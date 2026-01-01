package com.inheritance.librarymgmtsingleinheritence;

//LibraryTest.java
public class LibraryTest {

 public static void main(String[] args) {

     Author bookWithAuthor =
             new Author(
                     "Clean Code",
                     2008,
                     "Robert C. Martin",
                     "Software engineer and author"
             );

     bookWithAuthor.displayInfo();
 }
}
