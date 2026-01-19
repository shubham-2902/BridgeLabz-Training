package com.day6.smartlibrary;
import java.util.Arrays;

public class BorrowedBooksList {
    private Book[] books;
    private int size;

    public BorrowedBooksList(int capacity) {
        books = new Book[capacity];
        size = 0;
    }

    public void addBook(Book book) {
        if (size == books.length) {
            System.out.println("Cannot add book. Borrowed list is full.");
            return;
        }

        books[size] = book;
        size++;

        // Sort only the active portion after adding new book
        Book[] active = Arrays.copyOf(books, size);
        new InsertionSortByTitle().sort(active);

        // Copy sorted active list back
        for (int i = 0; i < size; i++) {
            books[i] = active[i];
        }
    }

    public void printBorrowedBooks() {
        if (size == 0) {
            System.out.println("No borrowed books.");
            return;
        }

        for (int i = 0; i < size; i++) {
            System.out.println((i + 1) + ". " + books[i]);
        }
    }
}
