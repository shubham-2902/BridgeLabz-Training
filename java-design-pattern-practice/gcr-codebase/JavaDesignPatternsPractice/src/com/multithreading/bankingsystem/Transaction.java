package com.multithreading.bankingsystem;
import java.time.LocalDateTime;

class Transaction implements Runnable {
    private BankAccount account;
    private String customerName;
    private int amount;

    public Transaction(BankAccount account, String customerName, int amount) {
        this.account = account;
        this.customerName = customerName;
        this.amount = amount;
    }

    @Override
    public void run() {
        System.out.println("[" + Thread.currentThread().getName() +
                "] State: " + Thread.currentThread().getState());
        System.out.println("[" + customerName + "] Attempting to withdraw " + amount);

        account.withdraw(customerName, amount);

        System.out.println("Time: " + LocalDateTime.now());
    }
}
