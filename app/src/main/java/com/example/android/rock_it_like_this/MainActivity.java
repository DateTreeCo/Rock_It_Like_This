package com.example.android.rock_it_like_this;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView pinkTextView = findViewById(R.id.pink_text_view);
        pinkTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pinkIntent = new Intent(MainActivity.this, PinkActivity.class);
                startActivity(pinkIntent);
            }
        });

        TextView animalsTextView = findViewById(R.id.animals_text_view);
        animalsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent animalsIntent = new Intent(MainActivity.this, AnimalsActivity.class);
                startActivity(animalsIntent);
            }
        });

        TextView velvetTextView = findViewById(R.id.velvet_text_view);
        velvetTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent velvetIntent = new Intent(MainActivity.this, VelvetActivity.class);
                startActivity(velvetIntent);
            }
        });

    }
}
