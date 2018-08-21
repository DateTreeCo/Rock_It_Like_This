package com.example.android.rock_it_like_this;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class AnimalsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        Button returnMainButton = findViewById(R.id.return_main_button);
        returnMainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent returnMainIntent = new Intent(AnimalsActivity.this, MainActivity.class);
                startActivity(returnMainIntent);
            }
        });

        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("The Animals", "Album: House of the Rising Sun", "Year: 1964", "Song: House of the Rising Sun"));
        songs.add(new Song("The Animals", "Album: Animalisms", "Year: 1966", "Song: One Monkey Don't Stop No Show"));
        songs.add(new Song("The Animals", "Album: Winds of Change", "Year: 1967", "Song: Poem by the Sea"));

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = findViewById(R.id.song_list);

        listView.setAdapter(adapter);

    }
}
