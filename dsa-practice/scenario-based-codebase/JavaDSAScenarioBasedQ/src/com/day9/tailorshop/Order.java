package com.day9.tailorshop;

public class Order {
	
private String customerName;
private String orderId;
private String deliveryDate;
 public Order(String customerName, String orderId, String deliveryDate)
 {
	this.customerName= customerName;
	this.deliveryDate= deliveryDate;
	this.orderId=orderId;
 }
 public String getCustomerName() {
	 return customerName;
 }
 public String getOrderId() {
	 return orderId;
 }
 public String getDeliveryDate() {
	 return deliveryDate;
 }
 
 @Override
 public String toString() {
	 return customerName+"-> "+orderId+"-> "+deliveryDate;
 }
 


}
