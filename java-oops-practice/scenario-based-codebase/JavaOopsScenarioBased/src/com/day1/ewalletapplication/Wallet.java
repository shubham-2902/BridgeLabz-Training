package com.day1.ewalletapplication;

public abstract class Wallet implements Transferrable {

    protected User owner;
    private double balance;   // sensitive data

    // Normal wallet constructor
    public Wallet(User owner) {
        this.owner = owner;
        this.balance = 0;
    }

    // Wallet with referral bonus
    public Wallet(User owner, double referralBonus) {
        this.owner = owner;
        this.balance = referralBonus;
    }

    // Encapsulation
    public double getBalance() {
        return balance;
    }

    protected void addBalance(double amount) {
        balance += amount;
    }

    protected boolean deductBalance(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public void loadMoney(double amount) {
        addBalance(amount);
    }
}
