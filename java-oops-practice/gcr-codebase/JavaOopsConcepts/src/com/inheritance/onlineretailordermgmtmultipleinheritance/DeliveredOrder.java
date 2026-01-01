package com.inheritance.onlineretailordermgmtmultipleinheritance;

//DeliveredOrder.java
public class DeliveredOrder extends ShippedOrder {

 String deliveryDate;

 public DeliveredOrder(int orderId, String orderDate,
                       String trackingNumber, String deliveryDate) {
     super(orderId, orderDate, trackingNumber);
     this.deliveryDate = deliveryDate;
 }

 @Override
 public String getOrderStatus() {
     return "Order Delivered";
 }
}
