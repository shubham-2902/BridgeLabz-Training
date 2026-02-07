package com.multithreading.bankingsystem;
class BankAccount {
    private int balance = 10000;

    public synchronized boolean withdraw(String customer, int amount) {
        System.out.println(customer + " is trying to withdraw " + amount);

        if (balance >= amount) {
            balance -= amount;
            System.out.println("Transaction successful: " + customer +
                    ", Amount: " + amount + ", Balance: " + balance);
            return true;
        } else {
            System.out.println("Transaction failed: " + customer +
                    ", Insufficient balance. Current Balance: " + balance);
            return false;
        }
    }
}
