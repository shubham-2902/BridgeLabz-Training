package com.generics.smartwarehousemgmtsystem;
public class Groceries extends WarehouseItem {

    private String expiryDate;

    public Groceries(String itemId, String itemName, int quantity, String expiryDate) {
        super(itemId, itemName, quantity);
        this.expiryDate = expiryDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    @Override
    public String toString() {
        return "Groceries {" + super.toString() + ", Expiry=" + expiryDate + " }";
    }
}
