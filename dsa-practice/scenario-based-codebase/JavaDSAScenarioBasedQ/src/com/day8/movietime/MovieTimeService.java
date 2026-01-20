package com.day8.movietime;
import java.util.ArrayList;
import java.util.List;

public class MovieTimeService {
    private List<Show> shows = new ArrayList<>();

    public void addShow(Show show) {
        shows.add(show);
    }

    public List<Show> getShows() {
        return shows;
    }

    public void printShows() {
        if (shows.isEmpty()) {
            System.out.println("No shows available.");
            return;
        }
        for (Show s : shows) {
            System.out.println(s);
        }
    }
}
