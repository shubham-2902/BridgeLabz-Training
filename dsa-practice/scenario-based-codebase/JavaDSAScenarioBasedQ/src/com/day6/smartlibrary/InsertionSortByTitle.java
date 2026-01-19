package com.day6.smartlibrary;
public class InsertionSortByTitle {

    // Sort books alphabetically by title (A-Z)
    public void sort(Book[] books) {
        for (int i = 1; i < books.length; i++) {
            Book key = books[i];
            int j = i - 1;

            // Shift elements greater than key title to one position ahead
            while (j >= 0 && books[j].getTitle().compareToIgnoreCase(key.getTitle()) > 0) {
                books[j + 1] = books[j];
                j--;
            }

            books[j + 1] = key;
        }
    }
}
