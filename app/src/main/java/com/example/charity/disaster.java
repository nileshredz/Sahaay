package com.example.charity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class disaster extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disaster);

        //d1 - https://www.devamitra.org/ngo-for-disaster-relief/
        //d2 - https://www.smilefoundationindia.org/disaster_management.html
        //d3 - https://ndma.gov.in/en/
        //d4 - https://give4good.org.in/amphan-cyclone-2020

        ImageView d1,d2,d3,d4;

        d1 = findViewById(R.id.dm1);
        d2 = findViewById(R.id.dm2);
        d3 = findViewById(R.id.dm3);
        d4 = findViewById(R.id.dm4);

        d1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(disaster.this,browser.class);
                intent.putExtra("website","https://www.devamitra.org/ngo-for-disaster-relief/");
                startActivity(intent);
            }
        });

        d2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(disaster.this,browser.class);
                intent.putExtra("website","https://www.smilefoundationindia.org/disaster_management.html");
                startActivity(intent);
            }
        });

        d3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(disaster.this,browser.class);
                intent.putExtra("website","https://ndma.gov.in/en/");
                startActivity(intent);
            }
        });

        d4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(disaster.this,browser.class);
                intent.putExtra("website","https://give4good.org.in/amphan-cyclone-2020");
                startActivity(intent);
            }
        });
    }
}
