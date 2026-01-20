package com.day8.movietime;
public class Show {
    private String movieName;
    private String showTime;   // in "HH:mm" format
    private int minutes;       // converted time for comparison

    public Show(String movieName, String showTime) {
        this.movieName = movieName;
        this.showTime = showTime;
        this.minutes = TimeUtil.toMinutes(showTime);
    }

    public String getMovieName() {
        return movieName;
    }

    public String getShowTime() {
        return showTime;
    }

    public int getMinutes() {
        return minutes;
    }

    @Override
    public String toString() {
        return showTime + " - " + movieName;
    }
}
