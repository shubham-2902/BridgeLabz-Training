package com.designpattern.smartuniversitylibrary;
public class LibraryApp {
    public static void main(String[] args) {

        LibraryCatalog catalog = LibraryCatalog.getInstance();

        User u1 = UserFactory.createUser("student","Alice");
        User u2 = UserFactory.createUser("faculty","Dr.Bob");

        u1.showRole();
        u2.showRole();

        catalog.addObserver(u1);
        catalog.addObserver(u2);

        Book book = new Book.BookBuilder("Design Patterns")
                        .author("GoF")
                        .edition("2nd")
                        .genre("Software")
                        .publisher("Pearson")
                        .build();

        catalog.addBook(book);
    }
}
