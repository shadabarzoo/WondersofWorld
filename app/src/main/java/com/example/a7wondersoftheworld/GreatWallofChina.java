package com.example.a7wondersoftheworld;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GreatWallofChina extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_great_wallof_china3);

        button = (Button) findViewById(R.id.Next1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(GreatWallofChina.this, Colosseum.class);
                startActivity(intent);

            }
        });


    }
}