package com.objectmodelling.level1.ecommerceapplication;

public class Customer {
	

	    private int customerId;
	    private String customerName;

	    Customer(int customerId, String customerName) {
	        this.customerId = customerId;
	        this.customerName = customerName;
	    }

	    void placeOrder(Order order) {
	        System.out.println(customerName + " placed an order.");
	        order.showOrderDetails();
	    }
	}


