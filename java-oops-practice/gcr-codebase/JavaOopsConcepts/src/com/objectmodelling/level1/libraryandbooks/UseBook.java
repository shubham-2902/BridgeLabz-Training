package com.objectmodelling.level1.libraryandbooks;

public class UseBook {
	
	    public static void main(String[] args) {

	        // Creating Book objects (independent)
	        Book book1 = new Book("Clean Code", "Robert C. Martin");
	        Book book2 = new Book("Effective Java", "Joshua Bloch");
	        Book book3 = new Book("Java Complete Reference", "Herbert Schildt");

	        // Creating Library objects
	        Library centralLibrary = new Library("Central Library");
	        Library collegeLibrary = new Library("College Library");

	        // Using Book objects inside Library (Aggregation)
	        centralLibrary.addBook(book1);
	        centralLibrary.addBook(book2);

	        collegeLibrary.addBook(book2); // same book reused
	        collegeLibrary.addBook(book3);

	        // Displaying library contents
	        centralLibrary.displayBooks();
	        collegeLibrary.displayBooks();
	    }
	}

