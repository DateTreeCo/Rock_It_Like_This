package com.example.android.rock_it_like_this;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Activity context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listView = convertView;
        if (listView == null) {
            listView = LayoutInflater.from(getContext()).inflate(
                    R.layout.song_details, parent, false);
        }

        Song currentSong = getItem(position);

        TextView artistTextView = listView.findViewById(R.id.artist_text_view);
        artistTextView.setText(currentSong.getArtist());

        TextView albumTextView = listView.findViewById(R.id.album_text_view);
        albumTextView.setText(currentSong.getAlbum());

        TextView yearTextView = listView.findViewById(R.id.year_text_view);
        yearTextView.setText(currentSong.getYear());

        TextView titleTextView = listView.findViewById(R.id.title_text_view);
        titleTextView.setText(currentSong.getSongTitle());

        return listView;
    }
}