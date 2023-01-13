package com.example.a7wondersoftheworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class giza extends AppCompatActivity {
    private Button button5;
    private Button button6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giza);

        button5 = (Button) findViewById(R.id.Previous2);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(giza.this, TajMahal.class);
                startActivity(intent);

            }
        });

        button6 = (Button) findViewById(R.id.Next3);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(giza.this, Machu.class);
                startActivity(intent);

            }
        });
    }
}