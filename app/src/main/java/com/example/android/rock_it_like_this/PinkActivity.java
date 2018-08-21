package com.example.android.rock_it_like_this;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class PinkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        Button returnMainButton = findViewById(R.id.return_main_button);
        returnMainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent returnMainIntent = new Intent(PinkActivity.this, MainActivity.class);
                startActivity(returnMainIntent);
            }
        });

        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Pink Floyd", "Album: Wish You Were Here", "Year: 1975", "Song: Wish You Were Here"));
        songs.add(new Song("Pink Floyd", "Album: Dark Side of the Moon", "Year: 1973", "Song: Money"));
        songs.add(new Song("Pink Floyd", "Album: The Wall", "Year: 1979", "Song: Mother"));

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = findViewById(R.id.song_list);

        listView.setAdapter(adapter);
    }
}
