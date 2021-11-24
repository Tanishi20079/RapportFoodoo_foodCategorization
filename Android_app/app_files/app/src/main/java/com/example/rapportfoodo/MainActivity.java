package com.example.rapportfoodo;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.speech.RecognitionListener;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.rapportfoodo.R;
import com.example.rapportfoodo.ml.Model;
import com.google.firebase.auth.FirebaseAuth;

import org.tensorflow.lite.support.image.ImageProcessor;
import org.tensorflow.lite.support.image.TensorImage;
import org.tensorflow.lite.support.image.ops.ResizeOp;
import org.tensorflow.lite.support.image.ops.ResizeWithCropOrPadOp;
import org.tensorflow.lite.support.image.ops.Rot90Op;
import org.tensorflow.lite.support.label.Category;

public class MainActivity extends Activity {

    private int REQUEST_CAMERA = 0, SELECT_FILE = 1;
    private Button btnSelect,btnCheck;
    private ImageView ivImage;
    private Context context;
    private String userChoosenTask;
    private Model model;
    private TextView recognise,name;
    private String reci="";
    private double max=0.0,score=0.0;
    private int flag=0;
    public static int index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSelect = (Button) findViewById(R.id.buttonUploadPhoto);
        btnCheck = (Button) findViewById(R.id.buttonCheck);
        context=this;
        recognise=findViewById(R.id.recognise);
        name=findViewById(R.id.recipe_name);



        btnSelect.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                selectImage();
            }
        });

        btnCheck.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Go to Server later",Toast.LENGTH_LONG).show();
                Intent i = new Intent(MainActivity.this,SecondActivity.class);
                i.putExtra("Recipe",reci);
                Log.i("hello","main"+reci);
                startActivity(i);
            }
        });

        ivImage = (ImageView) findViewById(R.id.imageViewFood);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        switch (requestCode) {
            case Utility.MY_PERMISSIONS_REQUEST_READ_EXTERNAL_STORAGE:
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    if(userChoosenTask.equals("Take Photo"))
                        cameraIntent();
                    else if(userChoosenTask.equals("Choose from Library"))
                        galleryIntent();
                } else {
                    //code for deny
                }
                break;
        }
    }

    private void selectImage() {
        final CharSequence[] items = { "Take Photo", "Choose from Library",
                "Cancel" };

        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Add Photo!");
        builder.setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int item) {
                boolean result=Utility.checkPermission(MainActivity.this);

                if (items[item].equals("Take Photo")) {
                    userChoosenTask ="Take Photo";
                    if(result)
                        cameraIntent();

                } else if (items[item].equals("Choose from Library")) {
                    userChoosenTask ="Choose from Library";
                    if(result)
                        galleryIntent();

                } else if (items[item].equals("Cancel")) {
                    dialog.dismiss();
                }
            }
        });
        builder.show();
    }

    private void galleryIntent()
    {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);//
        startActivityForResult(Intent.createChooser(intent, "Select File"),SELECT_FILE);
    }

    private void cameraIntent()
    {
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, REQUEST_CAMERA);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


        if (resultCode == Activity.RESULT_OK) {
            if (requestCode == SELECT_FILE) {
                try {
                    onSelectFromGalleryResult(data);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else if (requestCode == REQUEST_CAMERA)
                onCaptureImageResult(data);
        }
    }

    private void onCaptureImageResult(Intent data) {
        Bitmap thumbnail = (Bitmap) data.getExtras().get("data");
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        thumbnail.compress(Bitmap.CompressFormat.JPEG, 100, bytes);

        File destination = new File(Environment.getExternalStorageDirectory(),
                System.currentTimeMillis() + ".jpg");

        FileOutputStream fo;
        try {
            destination.createNewFile();
            fo = new FileOutputStream(destination);
            fo.write(bytes.toByteArray());
            fo.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ivImage.setImageBitmap(thumbnail);
        try {
            model = Model.newInstance(context);

            // Creates inputs for reference.
            TensorImage image = TensorImage.fromBitmap(thumbnail);
            Model.Outputs outputs = model.process(image);
            List<Category> probability = outputs.getProbabilityAsCategoryList();
//            recognise.setVisibility(View.VISIBLE);
//            recognise.setText(probability.toString());
            model.close();

            for(int i=0;i<25;i++)
            {
                String s=probability.get(i).toString();
                String[] arr=s.split(" ");
                String a=arr[2].replace("(score=","");
                String b=a.replace(")>","");
                score = Float.parseFloat(b);
                Log.i("hello", "String"+arr[1]+score);
                if(max<score) {
                    max = score;
                    reci = arr[1];
                    flag=1;
                }
            }
            if(flag==1){
                name.setVisibility(View.VISIBLE);
//                name.setText("Recognised as-"+reci);
                name.setVisibility(View.VISIBLE);

                reci = reci.replace("\"","");

                for(int i=0;i<Data.mainArray.length;i++){
                    System.out.println(reci+" "+Data.dishNames[1]+" "+reci.equals(Data.dishNames[i]));
                    if(reci.equals(Data.dishNames[i])){
                        index = i;
                        break;
                    }
                }
                name.setText("Recognised as :- "+Data.mainArray[index][0]);
                btnCheck.setVisibility(View.VISIBLE);
            }

        }
        catch(IOException e){


        }
    }

    @SuppressWarnings("deprecation")
    private void onSelectFromGalleryResult(Intent data) throws IOException {

        Bitmap bm=null;
        if (data != null) {
            try {
                bm = MediaStore.Images.Media.getBitmap(getApplicationContext().getContentResolver(), data.getData());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        ivImage.setImageBitmap(bm);
        try {
            model = Model.newInstance(context);

            // Creates inputs for reference.
            TensorImage image = TensorImage.fromBitmap(bm);
            Model.Outputs outputs = model.process(image);
            List<Category> probability = outputs.getProbabilityAsCategoryList();
//            recognise.setVisibility(View.VISIBLE);
//            recognise.setText(probability.toString());
            model.close();

            for(int i=0;i<25;i++) {
                String s = probability.get(i).toString();
                String[] arr = s.split(" ");
                String a = arr[2].replace("(score=", "");
                String b = a.replace(")>", "");
                score = Float.parseFloat(b);
                Log.i("hello", "String" + arr[1] + score);
                if (max < score) {
                    max = score;
                    reci = arr[1];
                    flag = 1;
                }
            }
            if(flag==1){
                name.setVisibility(View.VISIBLE);
//                name.setText("Recognised as-"+reci);
                name.setVisibility(View.VISIBLE);
                reci = reci.replace("\"","");
                for(int i=0;i<Data.mainArray.length;i++){
                    System.out.println(reci+" "+Data.dishNames[1]+" "+reci.equals(Data.dishNames[i]));
                    if(reci.equals(Data.dishNames[i])){
                        index = i;
                        break;
                    }
                }
                name.setText("Recognised as :- "+Data.mainArray[index][0]);
                btnCheck.setVisibility(View.VISIBLE);
            }
        }
        catch(IOException e){


        }
    }
}