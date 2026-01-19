package com.generics.smartwarehousemgmtsystem;
public class Electronics extends WarehouseItem {

    private int warrantyMonths;

    public Electronics(String itemId, String itemName, int quantity, int warrantyMonths) {
        super(itemId, itemName, quantity);
        this.warrantyMonths = warrantyMonths;
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }

    @Override
    public String toString() {
        return "Electronics {" + super.toString() + ", Warranty=" + warrantyMonths + " months }";
    }
}
