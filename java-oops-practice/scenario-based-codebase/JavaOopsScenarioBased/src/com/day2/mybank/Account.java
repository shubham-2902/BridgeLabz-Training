package com.day2.mybank;

public abstract class Account implements ITransaction {

    protected String accountNumber;
    private double balance;   // sensitive

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Account(String accountNumber, double openingBalance) {
        this.accountNumber = accountNumber;
        this.balance = openingBalance;
    }

    protected double getBalanceInternal() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount added succesfully");
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Amount withdrawn succesfully");
        }
        else {
        	System.out.println("\nInsufficient Funds");
        }
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    public abstract double calculateInterest();
}
