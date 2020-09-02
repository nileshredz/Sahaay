package com.example.charity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class sworker extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sworker);

        //s1 - http://www.aawc.in/
        //s2 - https://www.cry.org/projects/diksha

        ImageView s1,s2;

        s1 = findViewById(R.id.sw1);
        s2 = findViewById(R.id.sw2);

        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sworker.this,browser.class);
                intent.putExtra("website","http://www.aawc.in/");
                startActivity(intent);
            }
        });

        s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sworker.this,browser.class);
                intent.putExtra("website","https://www.cry.org/projects/diksha");
                startActivity(intent);
            }
        });
    }
}
