package com.example.a7wondersoftheworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Colosseum extends AppCompatActivity {
    private Button button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colosseum);

        button1 = (Button) findViewById(R.id.Previous);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Colosseum.this, GreatWallofChina.class);
                startActivity(intent);

            }
        });

        button2 = (Button) findViewById(R.id.Next);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Colosseum.this, TajMahal.class);
                startActivity(intent);

            }
        });


    }
}