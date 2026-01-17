package com.day4.smartshelf;
public class Main {
    public static void main(String[] args) {

        Book[] shelf = new Book[10];
        int count = 0;

        SmartShelf smartShelf = new SmartShelf();

        shelf[count++] = new Book("Java Programming", "James");
        smartShelf.sortBooks(shelf, count);

        shelf[count++] = new Book("Algorithms", "CLRS");
        smartShelf.sortBooks(shelf, count);

        shelf[count++] = new Book("Data Structures", "Mark");
        smartShelf.sortBooks(shelf, count);

        System.out.println(" Sorted Reading List:");
        smartShelf.display(shelf, count);
    }
}
