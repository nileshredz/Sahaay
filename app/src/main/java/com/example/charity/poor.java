package com.example.charity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class poor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poor);

        //p1 - https://apnalaya.org/
        //p2 - https://www.neptunefoundationindia.org/
        //p3 - https://www.stjudechild.org/
        //p4 - http://www.akanksha.org/

        ImageView p1,p2,p3,p4,p5;

        p1 = findViewById(R.id.p1);
        p2 = findViewById(R.id.p2);
        p3 = findViewById(R.id.p3);
        p4 = findViewById(R.id.p4);

        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(poor.this,browser.class);
                intent.putExtra("website","https://apnalaya.org/");
                startActivity(intent);
            }
        });

        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(poor.this,browser.class);
                intent.putExtra("website","https://www.neptunefoundationindia.org/");
                startActivity(intent);
            }
        });

        p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(poor.this,browser.class);
                intent.putExtra("website","https://www.stjudechild.org/");
                startActivity(intent);
            }
        });

        p4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(poor.this,browser.class);
                intent.putExtra("website","http://www.akanksha.org/");
                startActivity(intent);
            }
        });


    }
}
