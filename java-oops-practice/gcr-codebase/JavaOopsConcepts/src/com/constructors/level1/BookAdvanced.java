package com.constructors.level1;

public class BookAdvanced {

    // Encapsulation
    private String isbn;
    private String title;
    private String author;

    BookAdvanced(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    // Controlled access
    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    void displayBook() { // package-private
        System.out.println("ISBN   : " + isbn);
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
    }

    public static void main(String[] args) {
        BookAdvanced book =
                new BookAdvanced("978-111", "Effective Java", "Joshua Bloch");
        book.displayBook();
    }
}
