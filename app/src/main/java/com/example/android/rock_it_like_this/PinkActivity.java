package com.example.android.rock_it_like_this;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PinkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Pink Floyd", "Wish You Were Here", "1975", "Wish You Were Here"));
        songs.add(new Song("Pink Floyd", "Dark Side of the Moon", "1973", "Money"));
        songs.add(new Song("Pink Floyd", "The Wall", "1979", "Mother"));

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = findViewById(R.id.song_list);

        listView.setAdapter(adapter);
    }
}
