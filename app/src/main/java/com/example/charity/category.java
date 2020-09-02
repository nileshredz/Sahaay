package com.example.charity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class category extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        Button c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14;

        c1 = findViewById(R.id.cat1); //animal
        c2 = findViewById(R.id.cat2); //children
        c3 = findViewById(R.id.cat4); //oldage
        c4 = findViewById(R.id.cat5); //medical
        c5 = findViewById(R.id.cat6); //women
        c6 = findViewById(R.id.cat7); //disaster
        c7 = findViewById(R.id.cat8); //covid
        c8 = findViewById(R.id.cat9); //poor
        c9 = findViewById(R.id.cat10); // farmers
        c10 = findViewById(R.id.cat11);// sex workers
        c11 = findViewById(R.id.cat12); // physically disabled




        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(category.this,animal.class);
                startActivity(intent);
            }
        });

        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(category.this,children.class);
                startActivity(intent);
            }
        });

        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(category.this,oldage.class);
                startActivity(intent);
            }
        });

        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(category.this,medical.class);
                startActivity(intent);
            }
        });

        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(category.this,women.class);
                startActivity(intent);
            }
        });

        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(category.this,disaster.class);
                startActivity(intent);
            }
        });

        c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(category.this,covid.class);
                startActivity(intent);
            }
        });

        c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(category.this,poor.class);
                startActivity(intent);
            }
        });

        c9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(category.this,farmer.class);
                startActivity(intent);
            }
        });

        c10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(category.this,sworker.class);
                startActivity(intent);
            }
        });

        c11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(category.this,physical.class);
                startActivity(intent);
            }
        });
    }
}
