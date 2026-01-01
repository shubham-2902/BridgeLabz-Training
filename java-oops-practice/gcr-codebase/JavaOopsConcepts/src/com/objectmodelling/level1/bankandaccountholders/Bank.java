package com.objectmodelling.level1.bankandaccountholders;

public class Bank {

	

	    private String bankName;

	    public Bank(String bankName) {
	        this.bankName = bankName;
	    }

	    // Method to open an account for a customer
	    public void openAccount(Customer customer, double initialBalance) {
	        customer.setBank(this);
	        customer.setBalance(initialBalance);
	        System.out.println("Account opened for " + customer.getCustomerName()
	                + " in " + bankName);
	    }

	    public String getBankName() {
	        return bankName;
	    }
	}


