package com.example.charity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Charity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_charity);
        ImageView c1,c2,c3,c4,c5,c6;

        c1 = findViewById(R.id.charity1);

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Charity.this,browser.class);
                intent.putExtra("website", "https://www.pmcares.gov.in/en/web/contribution/donate_india");
                startActivity(intent);
            }
        });

    }
}
