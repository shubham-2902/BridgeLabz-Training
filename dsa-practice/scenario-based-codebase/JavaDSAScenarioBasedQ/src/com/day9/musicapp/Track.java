package com.day9.musicapp;

public class Track {
    private int trackId;
    private String title;
    private String artist;
    private double durationMinutes;

    public Track(int trackId, String title, String artist, double durationMinutes) {
        this.trackId = trackId;
        this.title = title;
        this.artist = artist;
        this.durationMinutes = durationMinutes;
    }

    public int getTrackId() {
        return trackId;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public double getDurationMinutes() {
        return durationMinutes;
    }

    @Override
    public String toString() {
        return "TrackID=" + trackId + ", Title=" + title + ", Artist=" + artist + ", Duration=" + durationMinutes + " min";
    }
}
