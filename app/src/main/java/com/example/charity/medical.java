package com.example.charity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class medical extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical);

        //m1 - https://www.leprasociety.org/
        //m2 - https://www.ruralhealthcarefoundation.com/
        //m3 - https://goonj.org/
        //m4 - https://udaanwelfarefoundation.in/
        //m5 - https://www.jeevandayee.gov.in/
        //m6 - https://www.smilefoundationindia.org/smile_on_wheels.html

        ImageView m1,m2,m3,m4,m5,m6;

        m1 = findViewById(R.id.med1);
        m2 = findViewById(R.id.med2);
        m3 = findViewById(R.id.med3);
        m4 = findViewById(R.id.med4);
        m5 = findViewById(R.id.med5);
        m6 = findViewById(R.id.med6);


        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(medical.this,browser.class);
                intent.putExtra("website","https://www.leprasociety.org/");
                startActivity(intent);
            }
        });

        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(medical.this,browser.class);
                intent.putExtra("website","https://www.ruralhealthcarefoundation.com/");
                startActivity(intent);
            }
        });

        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(medical.this,browser.class);
                intent.putExtra("website","https://goonj.org/");
                startActivity(intent);
            }
        });

        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(medical.this,browser.class);
                intent.putExtra("website","https://udaanwelfarefoundation.in/");
                startActivity(intent);
            }
        });

        m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(medical.this, browser.class);
                intent.putExtra("website","https://www.jeevandayee.gov.in/");
                startActivity(intent);
            }

        });

        m6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(medical.this, browser.class);
                intent.putExtra("website","https://www.smilefoundationindia.org/smile_on_wheels.html");
                startActivity(intent);
            }

        });

    }
}
