package com.objectmodelling.level1.bankandaccountholders;

public class Customer {


	    private String customerName;
	    private double balance;
	    private Bank bank; // Association

	    public Customer(String customerName) {
	        this.customerName = customerName;
	    }

	    public void setBank(Bank bank) {
	        this.bank = bank;
	    }

	    public void setBalance(double balance) {
	        this.balance = balance;
	    }

	    public String getCustomerName() {
	        return customerName;
	    }

	    // Customer communicating with Bank data
	    public void viewBalance() {
	        System.out.println("Customer Name : " + customerName);
	        System.out.println("Bank          : " + bank.getBankName());
	        System.out.println("Balance       : ₹" + balance);
	        System.out.println("----------------------------");
	    }
	}


