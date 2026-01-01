package com.inheritance.librarymgmtsingleinheritence;

//Author.java
public class Author extends Book {

 String name;
 String bio;

 // Constructor
 public Author(String title, int publicationYear, String name, String bio) {
     super(title, publicationYear);
     this.name = name;
     this.bio = bio;
 }

 // Overridden method
 @Override
 public void displayInfo() {
     super.displayInfo();
     System.out.println("Author Name      : " + name);
     System.out.println("Author Bio       : " + bio);
 }
}
