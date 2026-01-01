package com.inheritance.onlineretailordermgmtmultipleinheritance;

//OrderTest.java
public class OrderTest {

 public static void main(String[] args) {

     Order order = new Order(1001, "01-Jan-2026");
     ShippedOrder shipped = new ShippedOrder(1002, "02-Jan-2026", "TRK12345");
     DeliveredOrder delivered =
             new DeliveredOrder(1003, "03-Jan-2026", "TRK67890", "05-Jan-2026");

     System.out.println(order.getOrderStatus());
     System.out.println(shipped.getOrderStatus());
     System.out.println(delivered.getOrderStatus());
 }
}
