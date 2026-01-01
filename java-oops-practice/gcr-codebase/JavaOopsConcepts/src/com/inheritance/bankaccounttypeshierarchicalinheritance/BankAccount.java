package com.inheritance.bankaccounttypeshierarchicalinheritance;

//BankAccount.java
public class BankAccount {

 String accountNumber;
 double balance;

 // Constructor
 public BankAccount(String accountNumber, double balance) {
     this.accountNumber = accountNumber;
     this.balance = balance;
 }

 // Common method
 public void displayAccountDetails() {
     System.out.println("Account Number : " + accountNumber);
     System.out.println("Balance        : ₹" + balance);
 }
}
