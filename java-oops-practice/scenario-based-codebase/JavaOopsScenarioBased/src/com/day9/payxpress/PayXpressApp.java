package com.day9.payxpress;
import java.util.Scanner;

public class PayXpressApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== PayXpress – Utility Bill Payment ===");
        System.out.println("Select Bill Type:");
        System.out.println("1. Electricity");
        System.out.println("2. Water");
        System.out.println("3. Internet");

        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Bill Amount: ");
        double amount = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Due Date (dd-mm-yyyy): ");
        String dueDate = sc.nextLine();

        System.out.print("Is it Recurring bill? (yes/no): ");
        boolean recurring = sc.nextLine().equalsIgnoreCase("yes");

        Bill bill;

        if (choice == 1) {
            bill = new ElectricityBill(amount, dueDate, recurring);
        } else if (choice == 2) {
            bill = new WaterBill(amount, dueDate, recurring);
        } else {
            bill = new InternetBill(amount, dueDate, recurring);
        }

        bill.showBillInfo();
        bill.sendReminder();

        System.out.println("\nEnter days late (0 if on time): ");
        int daysLate = sc.nextInt();

        bill.pay(daysLate);

        bill.showBillInfo();

        sc.close();
    }
}
