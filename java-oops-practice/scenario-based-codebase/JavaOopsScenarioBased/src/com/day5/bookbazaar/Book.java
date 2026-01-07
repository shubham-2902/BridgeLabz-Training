package com.day5.bookbazaar;
public abstract class Book implements IDiscountable {

    protected String title;
    protected String author;
    protected double price;

    private int stock;          // inventory protected
    private boolean available;  // internal status

    // Constructor without offer
    public Book(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
        this.available = true;
    }

    // Encapsulation: stock update only via methods
    public boolean reduceStock(int quantity) {
        if (stock >= quantity) {
            stock -= quantity;
            return true;
        }
        return false;
    }

    public int getStock() {
        return stock;
    }

    protected void setAvailable(boolean status) {
        this.available = status;
    }

    public boolean isAvailable() {
        return available;
    }
}
