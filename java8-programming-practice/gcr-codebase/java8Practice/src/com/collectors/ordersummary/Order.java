package com.collectors.ordersummary;
public class Order {
    private String customer;
    private double total;

    public Order(String customer, double total) {
        this.customer = customer;
        this.total = total;
    }

    public String getCustomer() { return customer; }
    public double getTotal() { return total; }
}
