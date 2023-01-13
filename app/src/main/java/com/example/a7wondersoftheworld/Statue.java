package com.example.a7wondersoftheworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Statue extends AppCompatActivity {
    private Button button11;
    private Button button12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statue);

        button11 = (Button) findViewById(R.id.Previous5);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Statue.this,Petra.class);
                startActivity(intent);

            }
        });

        button12 = (Button) findViewById(R.id.Next6);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Statue.this,Dev.class);
                startActivity(intent);

            }
        });
    }
}