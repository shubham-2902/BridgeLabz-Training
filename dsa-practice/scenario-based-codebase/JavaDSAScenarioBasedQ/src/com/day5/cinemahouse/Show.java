package com.day5.cinemahouse;
import java.time.LocalTime;

public class Show {
    private String movieName;
    private LocalTime showTime;

    public Show(String movieName, LocalTime showTime) {
        this.movieName = movieName;
        this.showTime = showTime;
    }

    public String getMovieName() {
        return movieName;
    }

    public LocalTime getShowTime() {
        return showTime;
    }

    @Override
    public String toString() {
        return "Movie: " + movieName + ", Time: " + showTime;
    }
}
