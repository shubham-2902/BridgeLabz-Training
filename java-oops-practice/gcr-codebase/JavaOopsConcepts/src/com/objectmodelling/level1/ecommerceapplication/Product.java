package com.objectmodelling.level1.ecommerceapplication;

public class Product {
	

	    private int productId;
	    private String productName;
	    private double price;

	    Product(int productId, String productName, double price) {
	        this.productId = productId;
	        this.productName = productName;
	        this.price = price;
	    }

	    double getPrice() {
	        return price;
	    }

	    String getProductName() {
	        return productName;
	    }
	}


