package com.example.myapp2;

import android.content.Intent;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import static com.example.myapp2.MainActivity.MY_NAME;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        TextView textView = findViewById(R.id.act2_label1);

//        Intent intent = getIntent();
//        String myName = intent.getStringExtra(MainActivity.MY_NAME);
//        textView.setText(myName);

        String myName;
        Bundle extras = getIntent().getExtras();
        if(extras != null){
           myName = extras.getString(MY_NAME);
           textView.setText(myName);
        }


    }
}