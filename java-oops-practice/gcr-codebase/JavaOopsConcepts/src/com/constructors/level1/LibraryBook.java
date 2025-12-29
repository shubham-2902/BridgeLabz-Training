package com.constructors.level1;

public class LibraryBook {


	    // Attributes
	    String title;
	    String author;
	    double price;
	    boolean availability;

	    // Parameterized Constructor
	    public LibraryBook(String title, String author, double price, boolean availability) {
	        this.title = title;
	        this.author = author;
	        this.price = price;
	        this.availability = availability;
	    }

	    // Method to borrow a book
	    public void borrowBook() {
	        if (availability) {
	            availability = false;
	            System.out.println("Book borrowed successfully.");
	        } else {
	            System.out.println("Sorry, book is not available.");
	        }
	    }

	    // Method to display book details
	    public void displayBookDetails() {
	        System.out.println("Title        : " + title);
	        System.out.println("Author       : " + author);
	        System.out.println("Price        : ₹" + price);
	        System.out.println("Availability : " + (availability ? "Available" : "Not Available"));
	    }

	    // Main method
	    public static void main(String[] args) {

	        LibraryBook book1 = new LibraryBook("Clean Code", "Robert C. Martin", 450.0, true);

	        book1.displayBookDetails();
	        System.out.println();

	        book1.borrowBook();
	        System.out.println();

	        book1.displayBookDetails();
	    }
	}



