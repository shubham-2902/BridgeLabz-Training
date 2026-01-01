package com.inheritance.restaurantmgmthybridinheritance;

//RestaurantTest.java
public class RestaurantTest {

 public static void main(String[] args) {

     Worker chef = new Chef("Ramesh", 101);
     Worker waiter = new Waiter("Suresh", 102);

     chef.performDuties();
     waiter.performDuties();
 }
}
