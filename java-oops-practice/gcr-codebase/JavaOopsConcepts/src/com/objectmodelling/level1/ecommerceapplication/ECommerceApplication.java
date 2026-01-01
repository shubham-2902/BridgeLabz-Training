package com.objectmodelling.level1.ecommerceapplication;

public class ECommerceApplication {
	

	    public static void main(String[] args) {

	        Customer customer = new Customer(1, "Aman");

	        Product p1 = new Product(101, "Laptop", 55000);
	        Product p2 = new Product(102, "Mouse", 800);

	        Order order = new Order(5001);
	        order.addProduct(p1);
	        order.addProduct(p2);

	        customer.placeOrder(order);
	    }
	}


