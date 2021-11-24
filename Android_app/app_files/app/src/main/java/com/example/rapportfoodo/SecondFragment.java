package com.example.rapportfoodo;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Map;

public class SecondFragment extends Fragment {
    private TextView name,steps,ingredients;
    DatabaseReference reff;
    Data d;
    Data obj;
    private String r;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        super.onCreateView(inflater,container,savedInstanceState);
        View v= inflater.inflate(R.layout.fragment_second, container, false);
        r=d.getName();
       /*
        if(r.contains("Chocolate"))
            r="dessert";
        if(r.equals("Noodles")||r.equals("Meat")||r.equals("Seafood")||r.equals("Soup"))
            r=r.toLowerCase();
        if(r.contains("Vegetable"))
            r="vegetable";
        if(r.contains("Rice"))
            r="rice";
        if(r.contains("Egg"))
            r="egg";
        if(r.contains("French"))
            r="Fried";

        */

        name=v.findViewById(R.id.name);
        name.setText(Data.mainArray[MainActivity.index][0]);
        steps=v.findViewById(R.id.steps);
        ingredients=v.findViewById(R.id.ingredients);
//        Log.i("hello","tanishi"+r);
        String na="";

        int index = 0;
        for(int i=0;i<Data.mainArray.length;i++){
            if(r.equals(Data.dishNames[i])){
                index = i;
                break;
            }
        }
        ingredients.setText(Data.mainArray[index][2]);
        steps.setText(Data.mainArray[index][3]);
        return v;
    }
}