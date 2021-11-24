package com.example.rapportfoodo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;

public class ShowAcitivty extends AppCompatActivity {
    FirstFragment firstFragment;
    SecondFragment secondFragment;
    public static final int intent=R.id.frag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_acitivty);
        Intent i=getIntent();
        String s=i.getStringExtra("Case");
        if(s.equals("1")){
            firstFragment=new FirstFragment();
            FragmentManager manager=getSupportFragmentManager();
            FragmentTransaction fragmentTransaction=manager.beginTransaction();
            fragmentTransaction.add(intent,firstFragment);
            fragmentTransaction.commit();
        }
        if(s.equals("2")){
            secondFragment=new SecondFragment();
            FragmentManager manager=getSupportFragmentManager();
            FragmentTransaction fragmentTransaction=manager.beginTransaction();
            fragmentTransaction.add(intent,secondFragment);
            fragmentTransaction.commit();
        }
    }
}