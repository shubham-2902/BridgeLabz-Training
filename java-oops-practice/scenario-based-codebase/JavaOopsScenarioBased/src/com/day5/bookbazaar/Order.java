package com.day5.bookbazaar;
public class Order {

    private String customerName;
    private Book book;
    private int quantity;
    private String status;  // restricted update

    public Order(String customerName, Book book, int quantity) {
        this.customerName = customerName;
        this.book = book;
        this.quantity = quantity;
        this.status = "CREATED";
    }

    // Internal process updates status
    private void updateStatus(String newStatus) {
        status = newStatus;
    }

    public void processOrder() {

        if (!book.isAvailable()) {
            updateStatus("FAILED");
            System.out.println("Book not available.");
            return;
        }

        if (!book.reduceStock(quantity)) {
            updateStatus("FAILED");
            System.out.println("Insufficient stock.");
            return;
        }

        double total = (book.price * quantity)
                     - book.applyDiscount(quantity);

        updateStatus("CONFIRMED");

        System.out.println("\n--- Order Summary ---");
        System.out.println("Customer: " + customerName);
        System.out.println("Book: " + book.title);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Payable: Rs " + total);
        System.out.println("Order Status: " + status);
    }
}
