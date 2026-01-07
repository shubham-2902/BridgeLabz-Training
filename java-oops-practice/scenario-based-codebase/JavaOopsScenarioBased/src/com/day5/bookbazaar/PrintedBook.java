package com.day5.bookbazaar;
public class PrintedBook extends Book {

    public PrintedBook(String title, String author, double price, int stock) {
        super(title, author, price, stock);
    }

    // Lower discount for printed books
    @Override
    public double applyDiscount(int quantity) {
        return price * quantity * 0.10; // 10% discount
    }
}
