package com.day8.movietime;
import java.util.List;

public class InsertionSortShowsByTime {

    // Sort shows by time ASC (earliest first)
    public void sort(List<Show> shows) {
        for (int i = 1; i < shows.size(); i++) {
            Show key = shows.get(i);
            int j = i - 1;

            while (j >= 0 && shows.get(j).getMinutes() > key.getMinutes()) {
                shows.set(j + 1, shows.get(j));
                j--;
            }
            shows.set(j + 1, key);
        }
    }
}
