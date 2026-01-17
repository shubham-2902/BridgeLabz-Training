package com.day5.cinemahouse;
public class ShowSorter {

    // Bubble Sort by show time ascending
    public void bubbleSortShows(Show[] shows) {
        int n = shows.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (shows[j].getShowTime().isAfter(shows[j + 1].getShowTime())) {
                    Show temp = shows[j];
                    shows[j] = shows[j + 1];
                    shows[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) break;
        }
    }

    public void display(Show[] shows) {
        for (Show s : shows) {
            System.out.println(s);
        }
    }
}
