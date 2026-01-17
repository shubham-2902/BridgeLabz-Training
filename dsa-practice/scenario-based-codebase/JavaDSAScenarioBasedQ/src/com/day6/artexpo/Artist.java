package com.day6.artexpo;
import java.time.LocalTime;

public class Artist {
    private String artistId;
    private String name;
    private LocalTime registrationTime;

    public Artist(String artistId, String name, LocalTime registrationTime) {
        this.artistId = artistId;
        this.name = name;
        this.registrationTime = registrationTime;
    }

    public String getArtistId() {
        return artistId;
    }

    public String getName() {
        return name;
    }

    public LocalTime getRegistrationTime() {
        return registrationTime;
    }

    @Override
    public String toString() {
        return "ArtistID: " + artistId +
                ", Name: " + name +
                ", Registered At: " + registrationTime;
    }
}
