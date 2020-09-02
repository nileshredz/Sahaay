package com.example.charity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class oldage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oldage);


        //o1 - https://www.devamitra.org/old-age-ngo-india/
        //o2 - http://dadadadi.org/
        //o3 - https://www.aisccon.org/
        //o4 - http://www.harmonyeldercare.com/
        //o5 - https://emoha.com/
        //o6 - https://www.helpageindia.org/ndtv/

        ImageView o1,o2,o3,o4,o5,o6;

        o1 = findViewById(R.id.old1);
        o2 = findViewById(R.id.old2);
        o3 = findViewById(R.id.old3);
        o4 = findViewById(R.id.old4);
        o5 = findViewById(R.id.old5);
        o6 = findViewById(R.id.old6);


        o1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(oldage.this, browser.class);
                intent.putExtra("website", "https://www.devamitra.org/old-age-ngo-india/");
                startActivity(intent);
            }
        });

        o2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(oldage.this, browser.class);
                intent.putExtra("website", "http://dadadadi.org/");
                startActivity(intent);
            }
        });

        o3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(oldage.this, browser.class);
                intent.putExtra("website", "https://www.aisccon.org/");
                startActivity(intent);
            }
        });

        o4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(oldage.this, browser.class);
                intent.putExtra("website", "http://www.harmonyeldercare.com/");
                startActivity(intent);
            }
        });

        o5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(oldage.this, browser.class);
                intent.putExtra("website", "https://emoha.com/");
                startActivity(intent);
            }
        });

        o6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(oldage.this, browser.class);
                intent.putExtra("website", "https://www.helpageindia.org/ndtv/");
                startActivity(intent);
            }
        });
    }
}
