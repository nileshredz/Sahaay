package com.example.charity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class covid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_covid);

        //c1 - https://dreamgirlfoundation.ngo/covid-19-response-ngo/
        //c2 - https://goonj.org/support-covid-19-affected/?gclid=CjwKCAjw4rf6BRAvEiwAn2Q76u4nFpj2smvtLMf6zDsE9XBJ2HQZWT9Vp2-_ICDkD8S71VANgNJB9xoCXXkQAvD_BwE
        //c3 - https://gubbachi.org.in/index.html
        //c4 - https://manjhifoundation.org/

        ImageView c1,c2,c3,c4;

        c1 = findViewById(R.id.c1);
        c2 = findViewById(R.id.c2);
        c3 = findViewById(R.id.c3);
        c4 = findViewById(R.id.c4);

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(covid.this,browser.class);
                intent.putExtra("website","https://dreamgirlfoundation.ngo/covid-19-response-ngo/");
                startActivity(intent);
            }
        });

        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(covid.this,browser.class);
                intent.putExtra("website","https://goonj.org/support-covid-19-affected/?gclid=CjwKCAjw4rf6BRAvEiwAn2Q76u4nFpj2smvtLMf6zDsE9XBJ2HQZWT9Vp2-_ICDkD8S71VANgNJB9xoCXXkQAvD_BwE");
                startActivity(intent);
            }
        });

        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(covid.this,browser.class);
                intent.putExtra("website","https://gubbachi.org.in/index.html");
                startActivity(intent);
            }
        });

        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(covid.this,browser.class);
                intent.putExtra("website","https://manjhifoundation.org/");
                startActivity(intent);
            }
        });

    }
}
