package com.constructors.level1;

public class Book {

	    // Attributes
	    String title;
	    String author;
	    double price;

	    // Default Constructor
	    public Book() {
	        title = "Wings of Fire";
	        author = "Dr.APJ Abdul kalam";
	        price = 500.0;
	    }

	    // Parameterized Constructor
	    public Book(String title, String author, double price) {
	        this.title = title;
	        this.author = author;
	        this.price = price;
	    }

	    // Method to display book details
	    public void displayDetails() {
	        System.out.println("Title  : " + title);
	        System.out.println("Author : " + author);
	        System.out.println("Price  : Rs " + price);
	    }

	    public static void main(String[] args) {

	        // Object created using default constructor
	        Book book1 = new Book();
	        System.out.println("Book 1 Details:");
	        book1.displayDetails();

	        System.out.println();

	        // Object created using parameterized constructor
	        Book book2 = new Book("Effective Java", "Joshua Bloch", 550.00);
	        System.out.println("Book 2 Details:");
	        book2.displayDetails();
	    }
	}


