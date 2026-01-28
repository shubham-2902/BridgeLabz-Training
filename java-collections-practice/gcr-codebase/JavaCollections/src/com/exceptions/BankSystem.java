package com.exceptions;
import java.util.Scanner;


public class BankSystem {

    // Custom Checked Exception
    static class InsufficientBalanceException extends Exception {
        private static final long serialVersionUID = 1L;

        public InsufficientBalanceException(String message) {
            super(message);
        }
    }

    // Bank Account Class
    static class BankAccount {

        private double balance;

        public BankAccount(double balance) {
            this.balance = balance;
        }

        public void withdraw(double amount)
                throws InsufficientBalanceException {

            if (amount < 0) {
                throw new IllegalArgumentException("Invalid amount!");
            }

            if (amount > balance) {
                throw new InsufficientBalanceException("Insufficient balance!");
            }

            balance -= amount;
            System.out.println("Withdrawal successful, new balance: " + balance);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            // 🔹 Taking ORIGINAL BALANCE from user
            System.out.print("Enter initial account balance: ");
            double initialBalance = scanner.nextDouble();

            BankAccount account = new BankAccount(initialBalance);

            // 🔹 Taking withdrawal amount from user
            System.out.print("Enter withdrawal amount: ");
            double withdrawAmount = scanner.nextDouble();

            account.withdraw(withdrawAmount);

        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

        } catch (Exception e) {
            System.out.println("Invalid input type!");

        } finally {
            scanner.close();
        }
    }
}