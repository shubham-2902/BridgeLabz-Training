package com.day5.bookbazaar;
import java.util.Scanner;

public class BookBazaarMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ---------- Customer ----------
        System.out.print("Enter Customer Name: ");
        String customer = sc.nextLine();

        // ---------- Book Selection ----------
        System.out.println("\nSelect Book Type:");
        System.out.println("1. E-Book");
        System.out.println("2. Printed Book");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Stock Available: ");
        int stock = sc.nextInt();

        Book book;
        if (choice == 1) {
            book = new EBook(title, author, price, stock);
        } else {
            book = new PrintedBook(title, author, price, stock);
        }

        // ---------- Order ----------
        System.out.print("Enter Quantity to Order: ");
        int quantity = sc.nextInt();

        Order order = new Order(customer, book, quantity);

        order.processOrder();

        sc.close();
    }
}
