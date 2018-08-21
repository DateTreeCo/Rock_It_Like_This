package com.example.android.rock_it_like_this;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button animalsButton = findViewById(R.id.animals_button);
        animalsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent animalsIntent = new Intent(MainActivity.this, AnimalsActivity.class);
                startActivity(animalsIntent);
            }
        });

        Button pinkButton = findViewById(R.id.pink_button);
        pinkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pinkIntent = new Intent(MainActivity.this, PinkActivity.class);
                startActivity(pinkIntent);
            }
        });

        Button velvetButton = findViewById(R.id.velvet_button);
        velvetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent velvetIntent = new Intent(MainActivity.this, VelvetActivity.class);
                startActivity(velvetIntent);
            }
        });

    }
}
