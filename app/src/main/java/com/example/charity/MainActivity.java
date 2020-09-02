package com.example.charity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button main,about;
        final TextView about_txt;

        main = findViewById(R.id.main);
        about = findViewById(R.id.about);
        about_txt = findViewById(R.id.about_txt);


        main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,category.class);
                startActivity(intent);


            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(about_txt.getVisibility() == View.VISIBLE){
                    about_txt.setVisibility(View.GONE);
                }
                else{
                    about_txt.setVisibility(View.VISIBLE);
                }

            }
        });
    }
}
