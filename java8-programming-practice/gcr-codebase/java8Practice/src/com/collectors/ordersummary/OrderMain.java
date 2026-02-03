package com.collectors.ordersummary;
import java.util.*;
import java.util.stream.*;

public class OrderMain {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
            new Order("Ram", 2000),
            new Order("Amit", 1500),
            new Order("Shyam", 300),
            new Order("Amit",3000)
        );

        Map<String, Double> revenue =
            orders.stream()
                  .collect(Collectors.groupingBy(
                      Order::getCustomer,
                      Collectors.summingDouble(Order::getTotal)
                  ));

        revenue.forEach((cust, sum) ->
            System.out.println(cust + " Total Revenue: " + sum));
    }
}
