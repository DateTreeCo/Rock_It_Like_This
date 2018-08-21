package com.example.android.rock_it_like_this;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class AnimalsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("The Animals", "House of the Rising Sun", "1964", "House of the Rising Sun"));
        songs.add(new Song("The Animals", "Animalisms", "1966", "One Monkey Don't Stop No Show"));
        songs.add(new Song("The Animals", "Winds of Change", "1967", "Poem by the Sea"));

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = findViewById(R.id.song_list);

        listView.setAdapter(adapter);

    }
}
