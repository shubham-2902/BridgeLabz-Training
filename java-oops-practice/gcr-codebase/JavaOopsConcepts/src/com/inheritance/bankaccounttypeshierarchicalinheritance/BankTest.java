package com.inheritance.bankaccounttypeshierarchicalinheritance;

//BankTest.java
public class BankTest {

 public static void main(String[] args) {

     SavingsAccount sa =
             new SavingsAccount("SA101", 50000, 4.5);

     CheckingAccount ca =
             new CheckingAccount("CA202", 30000, 10000);

     FixedDepositAccount fd =
             new FixedDepositAccount("FD303", 100000, 5);
     

     sa.displayAccountDetails();
     sa.displayAccountType();
     System.out.println("----------------------");

     ca.displayAccountDetails();
     ca.displayAccountType();
     System.out.println("----------------------");

     fd.displayAccountDetails();
     fd.displayAccountType();
 }
}
