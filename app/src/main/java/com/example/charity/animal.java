package com.example.charity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class animal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal);

        ImageView a1,a2,a3,a4,a5,a6,a7,a8,a9,a10;

        a1 = findViewById(R.id.ani1);
        a2 = findViewById(R.id.ani2);
        a3 = findViewById(R.id.ani3);
        a4 = findViewById(R.id.ani4);
        a5 = findViewById(R.id.ani5);
        a6 = findViewById(R.id.ani6);
        a7 = findViewById(R.id.ani7);
        a8 = findViewById(R.id.ani8);
        a9 = findViewById(R.id.ani9);
        a10 = findViewById(R.id.ani10);

        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(animal.this,browser.class);
                intent.putExtra("website", "https://www.donatekart.com/AnimalMattersToMe/Help-Animal/");
                startActivity(intent);
            }
        });

        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(animal.this,browser.class);
                intent.putExtra("website", "https://www.donatekart.com/satyam/SSS-CoronaSupport/");
                startActivity(intent);
            }
        });

        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(animal.this,browser.class);
                intent.putExtra("website", "https://peopleforanimalsindia.org/");
                startActivity(intent);
            }
        });

        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(animal.this,browser.class);
                intent.putExtra("website", "http://sanjaygandhianimalcarecentre.org/");
                startActivity(intent);
            }
        });

        a5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(animal.this,browser.class);
                intent.putExtra("website", "https://www.petaindia.com/");
                startActivity(intent);
            }
        });

        a6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(animal.this,browser.class);
                intent.putExtra("website", "https://vspca.org/");
                startActivity(intent);
            }
        });

        a7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(animal.this,browser.class);
                intent.putExtra("website", "https://www.wti.org.in/");
                startActivity(intent);
            }
        });

        a8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(animal.this,browser.class);
                intent.putExtra("website", "https://friendicoes.org/");
                startActivity(intent);
            }
        });

        a9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(animal.this,browser.class);
                intent.putExtra("website", "https://www.strawindia.org/");
                startActivity(intent);
            }
        });

        a10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(animal.this,browser.class);
                intent.putExtra("website", "https://www.ipata.org/");
                startActivity(intent);
            }
        });
    }
}
