package com.constructors.level1;

class BankAccount {

    private int accountNumber;
    protected String accountHolder;  // controlled inheritance
    private double balance;

    BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}

public class SavingsAccount extends BankAccount {

    SavingsAccount(int accNo, String holder, double balance) {
        super(accNo, holder, balance);
    }

    void displayAccount() {
        System.out.println("Account No : " + getAccountNumber());
        System.out.println("Holder    : " + accountHolder);
        System.out.println("Balance   : ₹" + getBalance());
    }

    public static void main(String[] args) {
        SavingsAccount sa =
                new SavingsAccount(55501, "Anita", 25000);
        sa.deposit(5000);
        sa.displayAccount();
    }
}
