package com.inheritance.onlineretailordermgmtmultipleinheritance;

//ShippedOrder.java
public class ShippedOrder extends Order {

 String trackingNumber;

 public ShippedOrder(int orderId, String orderDate, String trackingNumber) {
     super(orderId, orderDate);
     this.trackingNumber = trackingNumber;
 }

 @Override
 public String getOrderStatus() {
     return "Order Shipped";
 }
}
