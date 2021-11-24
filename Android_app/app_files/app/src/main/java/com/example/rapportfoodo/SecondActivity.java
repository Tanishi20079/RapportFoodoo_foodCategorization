package com.example.rapportfoodo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView rec;
    private Button ord,inst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        rec=findViewById(R.id.textViewDishName);
        ord=findViewById(R.id.buttonOrder);
        inst=findViewById(R.id.buttonGetRecipe);

        Intent i=getIntent();
        String r=i.getStringExtra("Recipe");

        rec.setText(Data.mainArray[MainActivity.index][0]);

        Log.i("Sec",r);
        Data d=new Data();
        Data.setName(r);
        Intent i2=new Intent(SecondActivity.this,ShowAcitivty.class);
        ord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i2.putExtra("Case","1");
                startActivity(i2);
            }
        });
        inst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i2.putExtra("Case","2");
                startActivity(i2);
            }
        });

    }
}