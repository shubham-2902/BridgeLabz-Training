package com.objectmodelling.level1.bankandaccountholders;

public class UseBankAndCustomer {

	

	    public static void main(String[] args) {

	        // Creating Bank
	        Bank sbiBank = new Bank("State Bank of India");

	        // Creating Customers (independent objects)
	        Customer customer1 = new Customer("Ravi");
	        Customer customer2 = new Customer("Anita");

	        // Association: Bank opening accounts for customers
	        sbiBank.openAccount(customer1, 25000);
	        sbiBank.openAccount(customer2, 40000);

	        // Customers viewing their balance
	        customer1.viewBalance();
	        customer2.viewBalance();
	    }
	}


