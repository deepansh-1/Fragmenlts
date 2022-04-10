package com.deepanshu.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.SurfaceControl;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.deepanshu.fragment.Fragmentshome.firstFragment;

public class MainActivity extends AppCompatActivity {
Button btn1,btn2;
LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2= findViewById(R.id.btn2);
        linearLayout = findViewById(R.id.linearlayout);
       btn1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               firstFragment fragmets = new firstFragment(){
                   FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                   transaction.replace(R.id.linearLayout , firstFragment);
               transaction.commit();
               }
           }
       });


    }
}