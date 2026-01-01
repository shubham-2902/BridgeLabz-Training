package com.objectmodelling.level1.libraryandbooks;

public class Book {
	

	    private String title;
	    private String author;

	    // Parameterized constructor
	    public Book(String title, String author) {
	        this.title = title;
	        this.author = author;
	    }

	    // Method to display book details
	    public void displayBookDetails() {
	        System.out.println("Title  : " + title);
	        System.out.println("Author : " + author);
	    }
	}


