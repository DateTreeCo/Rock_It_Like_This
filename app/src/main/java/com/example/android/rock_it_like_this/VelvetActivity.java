package com.example.android.rock_it_like_this;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class VelvetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("The Velvet Underground", "White Light/White Heat", "1968", "Here She Comes Now"));
        songs.add(new Song("The Velvet Underground", "The Velvet Underground & Nico", "1967", "Femme Fatale"));
        songs.add(new Song("The Velvet Underground", "Loaded", "1970", "Sweet Jane"));

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = findViewById(R.id.song_list);

        listView.setAdapter(adapter);

    }
}
