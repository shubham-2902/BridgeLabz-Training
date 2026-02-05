package com.day1.SongVault;
public class Song {
    String title;
    String artist;
    String duration;
    String genre;

    public Song(String title, String artist, String duration, String genre) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return title + " by " + artist + " (" + genre + ")";
    }
}
