package com.example.saimanas.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   Button b7,b8,b9,b4,b5,b6,b11,b2,b3,b0;
   TextView exp,result;
   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
b7=findViewById(R.id.7);
       b8=findViewById(R.id.8);
       b9=findViewById(R.id.9);
       b4=findViewById(R.id.4);
       b5=findViewById(R.id.5);
       b6=findViewById(R.id.6);
       b11=findViewById(R.id.1);
       b2=findViewById(R.id.2);
       b3=findViewById(R.id.3);
       b0=findViewById(R.id.0);
       exp=findViewById(R.id.textView);
       result=findViewById(R.id.textView2);

   b7.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View view) {
       exp.setText(exp.getText().toString()+"7");

       }
   });
   b8.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View view) {
           exp.setText(exp.getText().toString()+"8");

       }
   });
       b9.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               exp.setText(exp.getText().toString()+"9");

           }
       });
       b4.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               exp.setText(exp.getText().toString()+"4");

           }
       });
       b5.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               exp.setText(exp.getText().toString()+"5");

           }
       });
       b6.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               exp.setText(exp.getText().toString()+"6");

           }
       });
       b11.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               exp.setText(exp.getText().toString()+"1");

           }
       });
       b2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               exp.setText(exp.getText().toString()+"2");

           }
       });
       b3.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               exp.setText(exp.getText().toString()+"3");

           }
       });
       b0.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               exp.setText(exp.getText().toString()+"0");

           }
       });





   }


}
