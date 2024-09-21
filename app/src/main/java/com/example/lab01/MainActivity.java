package com.example.lab01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lab01.databinding.ActivityMainBinding;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

 Button btn1;
    private ActivityMainBinding bindingVar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindingVar=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(bindingVar.getRoot());


       btn1=findViewById(R.id.btnHello);


       bindingVar.btnHello.setOnClickListener(view->{


               }
       );



    }
}