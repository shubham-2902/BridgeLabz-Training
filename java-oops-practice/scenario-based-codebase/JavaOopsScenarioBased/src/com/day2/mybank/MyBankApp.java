package com.day2.mybank;


import java.util.Scanner;

public class MyBankApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Select Account Type:// Only type serial number");
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");

        int choice = sc.nextInt();

        
        if (choice != 1 && choice != 2) {
            System.out.println("Invalid Choice. Program terminated.");
            sc.close();
            return;
        }

        sc.nextLine(); // clear buffer created by any scanner methods consumes the left over 

        System.out.println("Enter Account Number:");
        String accNo = sc.nextLine();

        System.out.println("Enter Opening Balance:");
        double balance = sc.nextDouble();

        Account account;

        if (choice == 1) {
            account = new SavingsAccount(accNo, balance);
        } else {
            account = new CurrentAccount(accNo, balance);
        }

        // Deposit
        System.out.println("Enter Deposit Amount:");
        double deposit = sc.nextDouble();
        account.deposit(deposit);

        // Withdraw
        System.out.println("Enter Withdraw Amount:");
        double withdraw = sc.nextDouble();
        account.withdraw(withdraw);

        System.out.println("\n--- Account Summary ---");
        System.out.println("Balance: Rs " + account.checkBalance());
        System.out.println("Interest: Rs " + account.calculateInterest());

        sc.close();
    }
}
