package com.day1.bookshelf;
import java.util.*;

public class Library {

    private HashMap<String, LinkedList<Book>> catalog;
    private HashSet<String> uniqueBookIds;

    public Library() {
        catalog = new HashMap<>();
        uniqueBookIds = new HashSet<>();
    }

    //  Add book (Return book or New book)
    public void addBook(Book book) {

        // HashSet check for duplication
        if (uniqueBookIds.contains(book.getId())) {
            System.out.println("Duplicate Book ID not allowed: " + book.getId());
            return;
        }

        // If genre is not present, create empty LinkedList
        catalog.putIfAbsent(book.getGenre(), new LinkedList<>());

        // Add book to genre list
        catalog.get(book.getGenre()).add(book);

        // Add id to set
        uniqueBookIds.add(book.getId());

        System.out.println(" Book Added Successfully: " + book);
    }

    // Borrow book (Delete from LinkedList)
    public void borrowBook(String bookId) {

        for (String genre : catalog.keySet()) {
            LinkedList<Book> books = catalog.get(genre);

            // Iterator is best for safe removal
            Iterator<Book> it = books.iterator();

            while (it.hasNext()) {
                Book b = it.next();

                if (b.getId().equals(bookId)) {
                    it.remove(); // remove from linkedlist
                    uniqueBookIds.remove(bookId); // remove from set

                    System.out.println(" Book Borrowed: " + b);

                    // If genre list empty remove that genre
                    if (books.isEmpty()) {
                        catalog.remove(genre);
                    }
                    return;
                }
            }
        }

        System.out.println("Book not found with ID: " + bookId);
    }

    // Display full catalog
    public void displayCatalog() {

        if (catalog.isEmpty()) {
            System.out.println(" Library is empty.");
            return;
        }

        System.out.println("\nLibrary Catalog (Genre Wise):");

        for (Map.Entry<String, LinkedList<Book>> entry : catalog.entrySet()) {
            System.out.println("Genre: " + entry.getKey());

            for (Book b : entry.getValue()) {
                System.out.println("   -> " + b);
            }
        }
    }
}
