package com.inheritance.librarymgmtsingleinheritence;

//Book.java
public class Book {

 String title;
 int publicationYear;

 // Constructor
 public Book(String title, int publicationYear) {
     this.title = title;
     this.publicationYear = publicationYear;
 }

 // Method to display book details
 public void displayInfo() {
     System.out.println("Book Title       : " + title);
     System.out.println("Publication Year : " + publicationYear);
 }
}
