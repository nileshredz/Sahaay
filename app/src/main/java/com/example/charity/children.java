package com.example.charity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class children extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_children);

        //c3 -  https://www.katha.org/
        //c4 - https://www.smilefoundationindia.org//
        //c5 - https://www.childlineindia.org/
        //c6 - https://www.savethechildren.in/
        //c7 - https://www.udayfoundation.org/
        // c8 - https://www.pratham.org/
        // c9 - https://www.teachforindia.org/
        // c10 - https://goonj.org/

        ImageView c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;

        c1 = findViewById(R.id.chi1);
        c2 = findViewById(R.id.chi2);
        c3 = findViewById(R.id.chi3);
        c4 = findViewById(R.id.chi4);
        c5 = findViewById(R.id.chi5);
        c6 = findViewById(R.id.chi6);
        c7 = findViewById(R.id.chi7);
        c8 = findViewById(R.id.chi8);
        c9 = findViewById(R.id.chi9);
        c10 = findViewById(R.id.chi10);

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(children.this, browser.class);
                intent.putExtra("website", "https://www.cry.org/");
                startActivity(intent);
            }
        });

        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(children.this, browser.class);
                intent.putExtra("website", "https://www.genesis-foundation.net/");
                startActivity(intent);
            }
        });

        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(children.this, browser.class);
                intent.putExtra("website", "https://www.katha.org/");
                startActivity(intent);
            }
        });

        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(children.this, browser.class);
                intent.putExtra("website", "https://www.smilefoundationindia.org/");
                startActivity(intent);
            }
        });

        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(children.this, browser.class);
                intent.putExtra("website", "https://www.childlineindia.org/");
                startActivity(intent);
            }
        });

        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(children.this, browser.class);
                intent.putExtra("website", "https://www.savethechildren.in/");
                startActivity(intent);
            }
        });

        c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(children.this, browser.class);
                intent.putExtra("website", "https://www.udayfoundation.org/");
                startActivity(intent);
            }
        });

        c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(children.this, browser.class);
                intent.putExtra("website", "https://www.pratham.org/");
                startActivity(intent);
            }
        });

        c9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(children.this, browser.class);
                intent.putExtra("website", "https://www.teachforindia.org/");
                startActivity(intent);
            }
        });

        c10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(children.this, browser.class);
                intent.putExtra("website", "https://goonj.org/");
                startActivity(intent);
            }
        });
    }
}
