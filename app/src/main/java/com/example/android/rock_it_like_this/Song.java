package com.example.android.rock_it_like_this;

public class Song {

    private String mArtist;

    private String mAlbum;

    private String mYear;

    private String mSongTitle;

    public Song(String Artist, String Album, String Year, String SongTitle) {
        mArtist = Artist;
        mAlbum = Album;
        mYear = Year;
        mSongTitle = SongTitle;
    }

    public String getArtist() {
        return mArtist;
    }

    public String getAlbum() {
        return mAlbum;
    }

    public String getYear() {
        return mYear;
    }

    public String getSongTitle() {
        return mSongTitle;
    }

}