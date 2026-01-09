package com.day7.Artify;
public class User {

    private String name;
    private double walletBalance; // sensitive

    public User(String name, double walletBalance) {
        this.name = name;
        this.walletBalance = walletBalance;
    }

    public boolean deductAmount(double amount) {
        if (walletBalance >= amount) {
            walletBalance -= amount;
            return true;
        }
        return false;
    }

    public double getWalletBalance() {
        return walletBalance;
    }

    public String getName() {
        return name;
    }
}
