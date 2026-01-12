package com.day2.callcenter;
public class Customer {
    private String customerId;
    private String name;
    private boolean vip;
    private int priorityLevel; // only for VIP customers

    public Customer(String customerId, String name, boolean vip, int priorityLevel) {
        this.customerId = customerId;
        this.name = name;
        this.vip = vip;
        this.priorityLevel = priorityLevel;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public boolean isVip() {
        return vip;
    }

    public int getPriorityLevel() {
        return priorityLevel;
    }

    @Override
    public String toString() {
        if (vip) {
            return "CustomerID: " + customerId + ", Name: " + name + ", VIP Priority: " + priorityLevel;
        }
        return "CustomerID: " + customerId + ", Name: " + name + ", Normal";
    }
}
