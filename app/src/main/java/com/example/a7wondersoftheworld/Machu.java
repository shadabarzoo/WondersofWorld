package com.example.a7wondersoftheworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Machu extends AppCompatActivity {
    private Button button7;
    private Button button8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_machu);

        button7 = (Button) findViewById(R.id.Previous3);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Machu.this, giza.class);
                startActivity(intent);

            }
        });

        button8 = (Button) findViewById(R.id.Next4);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Machu.this, Petra.class);
                startActivity(intent);

            }
        });
    }
}