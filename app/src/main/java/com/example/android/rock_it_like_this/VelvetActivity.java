package com.example.android.rock_it_like_this;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class VelvetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        Button returnMainButton = findViewById(R.id.return_main_button);
        returnMainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent returnMainIntent = new Intent(VelvetActivity.this, MainActivity.class);
                startActivity(returnMainIntent);
            }
        });

        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("The Velvet Underground", "Album: White Light/White Heat", "Year: 1968", "Song: Here She Comes Now"));
        songs.add(new Song("The Velvet Underground", "Album: The Velvet Underground & Nico", "Year: 1967", "Song: Femme Fatale"));
        songs.add(new Song("The Velvet Underground", "Album: Loaded", "Year: 1970", "Song: Sweet Jane"));

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = findViewById(R.id.song_list);

        listView.setAdapter(adapter);

    }
}
