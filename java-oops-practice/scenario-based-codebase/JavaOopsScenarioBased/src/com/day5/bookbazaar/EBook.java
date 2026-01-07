package com.day5.bookbazaar;
public class EBook extends Book {

    public EBook(String title, String author, double price, int stock) {
        super(title, author, price, stock);
    }

    // Higher discount for e-books
    @Override
    public double applyDiscount(int quantity) {
        return price * quantity * 0.20; // 20% discount
    }
}
