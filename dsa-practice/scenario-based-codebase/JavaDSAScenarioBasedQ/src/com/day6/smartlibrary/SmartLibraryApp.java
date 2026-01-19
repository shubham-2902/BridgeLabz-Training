package com.day6.smartlibrary;
public class SmartLibraryApp {

    public static void main(String[] args) {
        BorrowedBooksList borrowedList = new BorrowedBooksList(10);

        borrowedList.addBook(new Book("Java Programming"));
        borrowedList.addBook(new Book("Data Structures"));
        borrowedList.addBook(new Book("Algorithms "));
        borrowedList.addBook(new Book("How to Code"));
        borrowedList.addBook(new Book("Artificial Intelligence"));

        System.out.println("Borrowed Books (Auto-Sorted A-Z):");
        borrowedList.printBorrowedBooks();
    }
}
