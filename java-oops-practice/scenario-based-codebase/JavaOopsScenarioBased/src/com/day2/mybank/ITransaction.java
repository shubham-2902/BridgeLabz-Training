package com.day2.mybank;

public interface ITransaction {
    void deposit(double amount);
    void withdraw(double amount);
    double checkBalance();
}
