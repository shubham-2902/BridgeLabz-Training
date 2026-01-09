package com.day6.medistore;
import java.util.Scanner;

public class MediStoreMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Select Medicine Type:");
        System.out.println("1. Tablet");
        System.out.println("2. Syrup");
        System.out.println("3. Injection");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Medicine Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();
        sc.nextLine();

        System.out.print("Expiry Date: ");
        String expiry = sc.nextLine();

        System.out.print("Quantity: ");
        int qty = sc.nextInt();

        Medicine medicine;
        if (choice == 1)
            medicine = new Tablet(name, price, expiry, qty);
        else if (choice == 2)
            medicine = new Syrup(name, price, expiry, qty);
        else
            medicine = new Injection(name, price, expiry, qty);

        medicine.checkExpiry();

        System.out.print("Enter quantity to sell: ");
        int sellQty = sc.nextInt();

        medicine.sell(sellQty);
        medicine.showBill();

        sc.close();
    }
}
