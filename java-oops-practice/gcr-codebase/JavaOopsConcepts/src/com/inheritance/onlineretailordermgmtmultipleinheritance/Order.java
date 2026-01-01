package com.inheritance.onlineretailordermgmtmultipleinheritance;

//Order.java
public class Order {

 int orderId;
 String orderDate;

 public Order(int orderId, String orderDate) {
     this.orderId = orderId;
     this.orderDate = orderDate;
 }

 public String getOrderStatus() {
     return "Order Placed";
 }
}
