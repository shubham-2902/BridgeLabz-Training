package com.inheritance.bankaccounttypeshierarchicalinheritance;

//CheckingAccount.java
public class CheckingAccount extends BankAccount {

 double withdrawalLimit;

 public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
     super(accountNumber, balance);
     this.withdrawalLimit = withdrawalLimit;
 }

 public void displayAccountType() {
     System.out.println("Account Type      : Checking Account");
     System.out.println("Withdrawal Limit : ₹" + withdrawalLimit);
 }
}
