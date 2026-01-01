package com.objectmodelling.level1.libraryandbooks;
import java.util.ArrayList;

public class Library {
	

	    private String libraryName;
	    private ArrayList<Book> books; // Aggregation

	    public Library(String libraryName) {
	        this.libraryName = libraryName;
	        this.books = new ArrayList<>();
	    }

	    public void addBook(Book book) {
	        books.add(book);
	    }

	    public void displayBooks() {
	        System.out.println("\nLibrary Name: " + libraryName);
	        for (Book book : books) {
	            book.displayBookDetails();
	            System.out.println("--------------------");
	        }
	    }
	}



