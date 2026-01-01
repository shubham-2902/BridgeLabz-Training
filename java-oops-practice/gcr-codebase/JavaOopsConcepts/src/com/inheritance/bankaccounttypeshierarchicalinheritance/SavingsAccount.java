package com.inheritance.bankaccounttypeshierarchicalinheritance;

//SavingsAccount.java
public class SavingsAccount extends BankAccount {

 double interestRate;

 public SavingsAccount(String accountNumber, double balance, double interestRate) {
     super(accountNumber, balance);
     this.interestRate = interestRate;
 }

 public void displayAccountType() {
     System.out.println("Account Type   : Savings Account");
     System.out.println("Interest Rate : " + interestRate + "%");
 }
}
