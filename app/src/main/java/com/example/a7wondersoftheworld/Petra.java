package com.example.a7wondersoftheworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Petra extends AppCompatActivity {
    private Button button9;
    private Button button10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petra);

        button9 = (Button) findViewById(R.id.Previous4);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Petra.this,Machu.class);
                startActivity(intent);

            }
        });

        button10=(Button) findViewById(R.id.Next5);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Petra.this, Statue.class);
                startActivity(intent);

            }
        });
    }
}