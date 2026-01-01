package com.inheritance.bankaccounttypeshierarchicalinheritance;

//FixedDepositAccount.java
public class FixedDepositAccount extends BankAccount {

 int tenureYears;

 public FixedDepositAccount(String accountNumber, double balance, int tenureYears) {
     super(accountNumber, balance);
     this.tenureYears = tenureYears;
 }

 public void displayAccountType() {
     System.out.println("Account Type : Fixed Deposit Account");
     System.out.println("Tenure       : " + tenureYears + " years");
 }
}
