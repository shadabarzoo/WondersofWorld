package com.example.a7wondersoftheworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TajMahal extends AppCompatActivity {
    private Button button3;
    private Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taj_mahal);

        button3 = (Button) findViewById(R.id.Previous1);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(TajMahal.this, Colosseum.class);
                startActivity(intent);

            }
        });

        button4 = (Button) findViewById(R.id.next2);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(TajMahal.this, giza.class);
                startActivity(intent);

            }
        });
    }
}