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
  //1- create a varible to refer to the new button
    Button btn2;
    // create a var for the textview
    TextView txt1;

    private ActivityMainBinding bindingVar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindingVar=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(bindingVar.getRoot());

        btn1= findViewById(R.id.btnHello);
        //2- assign the new button to the varible btn2
        btn2= findViewById(R.id.butChange);
        txt1= findViewById(R.id.txtName);



        btn1.setOnClickListener(view -> {
            CharSequence text = "Hello toast from Mervat!";
            int duration = Toast.LENGTH_LONG;
            Toast toast = Toast.makeText(getApplicationContext() , text, duration);
            toast.show();
     });
        //3- write the response int to setonclicl listner function
        btn2.setOnClickListener(view -> {

          txt1.setText("My Name is Mervat Mustafa");

        });


        bindingVar.btnStatus.setOnClickListener(view->{
            String message="";

            if ( bindingVar.chkCoffe.isSelected()==true) {
                // Checkbox is checked
                 message+="I like coffee ";
            } else {
                // Checkbox is unchecked
                message+= "I do not like Coffee";
            }

            if ( bindingVar.swtMilk.isSelected()==true) {
                // Checkbox is checked
                message+=", and I like Milk";
            } else {
                // Checkbox is unchecked
                message+=", and I do not like Milk";
            }


            Snackbar snackbar = Snackbar.make(view,message, Snackbar.LENGTH_LONG);
            snackbar.show();
        });




    }
}