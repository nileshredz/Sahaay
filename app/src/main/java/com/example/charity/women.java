package com.example.charity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class women extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_women);

        //w1 - http://www.sewa.org/
        //w3 - https://northeastnetwork.org/
        //w2 - https://www.snehalaya.org/
        //w4 - http://janodaya.org/
        //w5 - http://makaam.in/
        //w6 - http://www.majlislaw.com/

        ImageView w1,w2,w3,w4,w5,w6;

        w1 = findViewById(R.id.w1);
        w2 = findViewById(R.id.w2);
        w3 = findViewById(R.id.w3);
        w4 = findViewById(R.id.w4);
        w5 = findViewById(R.id.w5);
        w6 = findViewById(R.id.w6);


        w1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(women.this,browser.class);
                intent.putExtra("website","http://www.sewa.org/");
                startActivity(intent);
            }
        });

        w2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(women.this,browser.class);
                intent.putExtra("website","https://www.snehalaya.org/");
                startActivity(intent);
            }
        });

        w3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(women.this,browser.class);
                intent.putExtra("website","https://northeastnetwork.org/");
                startActivity(intent);
            }
        });

        w4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(women.this,browser.class);
                intent.putExtra("website","http://janodaya.org/");
                startActivity(intent);
            }
        });

        w5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(women.this,browser.class);
                intent.putExtra("website","http://makaam.in/");
                startActivity(intent);
            }
        });


        w6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(women.this,browser.class);
                intent.putExtra("website","http://www.majlislaw.com/");
                startActivity(intent);
            }
        });
    }
}
