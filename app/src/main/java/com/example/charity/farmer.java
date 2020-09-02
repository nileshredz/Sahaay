package com.example.charity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class farmer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farmer);

        //f1 - https://swadesfoundation.org/
        //f2 - https://www.actionagainsthunger.in/
        //f3 - http://farmer.org.in/
        //f4 - https://www.saveindianfarmers.org/
        //f5 - http://krishiyodha.com/
        //f6 - http://www.miitti.in/agriculture/

        ImageView f1,f2,f3,f4,f5,f6;

        f1 = findViewById(R.id.f1);
        f2 = findViewById(R.id.f2);
        f3 = findViewById(R.id.f3);
        f4 = findViewById(R.id.f4);
        f5 = findViewById(R.id.f5);
        f6 = findViewById(R.id.f6);

        f1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(farmer.this,browser.class);
                intent.putExtra("website","https://swadesfoundation.org/");
                startActivity(intent);
            }
        });

        f2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(farmer.this,browser.class);
                intent.putExtra("website","https://www.actionagainsthunger.in/");
                startActivity(intent);
            }
        });

        f3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(farmer.this,browser.class);
                intent.putExtra("website","http://farmer.org.in/");
                startActivity(intent);
            }
        });

        f4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(farmer.this,browser.class);
                intent.putExtra("website","https://www.saveindianfarmers.org/");
                startActivity(intent);
            }
        });

        f5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(farmer.this,browser.class);
                intent.putExtra("website","http://krishiyodha.com/");
                startActivity(intent);
            }
        });

        f6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(farmer.this,browser.class);
                intent.putExtra("website","http://www.miitti.in/agriculture/");
                startActivity(intent);
            }
        });
    }
}
