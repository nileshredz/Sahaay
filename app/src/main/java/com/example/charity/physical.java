package com.example.charity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class physical extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physical);

        //phy1 - https://ratnanidhi.org/Category/health-and-disability?gclid=Cj0KCQjwhb36BRCfARIsAKcXh6EGEn4EZeg0ogvT-alNORtbWcFMYiyzZWh8Ig7kE5AAaOivkvMJ9GoaAtkeEALw_wcB
        //phy2 - http://helpinghandindiango.org/?gclid=Cj0KCQjwhb36BRCfARIsAKcXh6F8v4Zd7t9lcigd5qPK7t17AXgi2KzT7InD20igN3nQVVMtCHQpm5QaAobrEALw_wcB
        //phy3 - https://amritfoundationofindia.in/get-in-touch/?gclid=Cj0KCQjwhb36BRCfARIsAKcXh6FAJjLxFbEVdktY8Nz6u_abQIkoE_AF0ZPy_7hCyqwozn3BGAwf0I8aAod2EALw_wcB
        //phy4 - http://www.adharwad.org/ngo-physically-challenged-mumbai/
        //phy5 - http://thehansfoundation.org/disability/
        //phy6 - https://www.narayanseva.org/welcome

        ImageView phy1,phy2,phy3,phy4,phy5,phy6;

        phy1 = findViewById(R.id.phy1);
        phy2 = findViewById(R.id.phy2);
        phy3 = findViewById(R.id.phy3);
        phy4 = findViewById(R.id.phy4);
        phy5 = findViewById(R.id.phy5);
        phy6 = findViewById(R.id.phy6);

        phy1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(physical.this,browser.class);
                intent.putExtra("website","https://ratnanidhi.org/Category/health-and-disability?gclid=Cj0KCQjwhb36BRCfARIsAKcXh6EGEn4EZeg0ogvT-alNORtbWcFMYiyzZWh8Ig7kE5AAaOivkvMJ9GoaAtkeEALw_wcB");
                startActivity(intent);
            }
        });

        phy2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(physical.this,browser.class);
                intent.putExtra("website","http://helpinghandindiango.org/?gclid=Cj0KCQjwhb36BRCfARIsAKcXh6F8v4Zd7t9lcigd5qPK7t17AXgi2KzT7InD20igN3nQVVMtCHQpm5QaAobrEALw_wcB");
                startActivity(intent);
            }
        });

        phy3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(physical.this,browser.class);
                intent.putExtra("website","https://amritfoundationofindia.in/get-in-touch/?gclid=Cj0KCQjwhb36BRCfARIsAKcXh6FAJjLxFbEVdktY8Nz6u_abQIkoE_AF0ZPy_7hCyqwozn3BGAwf0I8aAod2EALw_wcB");
                startActivity(intent);
            }
        });

        phy4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(physical.this,browser.class);
                intent.putExtra("website","http://www.adharwad.org/ngo-physically-challenged-mumbai/");
                startActivity(intent);
            }
        });

        phy5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(physical.this,browser.class);
                intent.putExtra("website","http://thehansfoundation.org/disability/");
                startActivity(intent);
            }
        });

        phy6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(physical.this,browser.class);
                intent.putExtra("website","https://www.narayanseva.org/welcome");
                startActivity(intent);
            }
        });
    }
}
