package com.day6.artexpo;
public class RegistrationManager {

    // Insert artist into sorted array (ascending by registration time)
    public int addArtist(Artist[] artists, int count, Artist newArtist) {
        artists[count] = newArtist;
        count++;

        // insertion: move new element left until sorted
        int i = count - 1;
        while (i > 0 && artists[i - 1].getRegistrationTime()
                .isAfter(artists[i].getRegistrationTime())) {

            Artist temp = artists[i];
            artists[i] = artists[i - 1];
            artists[i - 1] = temp;

            i--;
        }

        return count;
    }

    public void display(Artist[] artists, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(artists[i]);
        }
    }
}
