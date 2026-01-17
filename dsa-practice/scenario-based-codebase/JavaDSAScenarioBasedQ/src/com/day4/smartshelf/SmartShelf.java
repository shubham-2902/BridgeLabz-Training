package com.day4.smartshelf;
public class SmartShelf {

    // Insertion Sort by Book Title (Alphabetical)
    public void sortBooks(Book[] books, int count) {

        for (int i = 1; i < count; i++) {
            Book key = books[i];
            int j = i - 1;

            // Shift books greater than key to one position ahead
            while (j >= 0 && books[j].getTitle()
                    .compareToIgnoreCase(key.getTitle()) > 0) {

                books[j + 1] = books[j];
                j--;
            }

            books[j + 1] = key;
        }
    }

    public void display(Book[] books, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(books[i]);
        }
    }
}
