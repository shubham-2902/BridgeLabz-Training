package com.designpattern.smartuniversitylibrary;

import java.util.ArrayList;
import java.util.List;

class LibraryCatalog {
    private static LibraryCatalog instance;
    private List<Book> books = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    private LibraryCatalog() {}

    public static synchronized LibraryCatalog getInstance() {
        if (instance == null)
            instance = new LibraryCatalog();
        return instance;
    }

    public void addBook(Book book) {
        books.add(book);
        notifyObservers("New book added: " + book.getTitle());
    }

    public void addObserver(Observer o) { observers.add(o); }

    private void notifyObservers(String msg) {
        for (Observer o : observers) o.update(msg);
    }
}
