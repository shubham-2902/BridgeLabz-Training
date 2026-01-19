package com.generics.smartwarehousemgmtsystem;
public abstract class WarehouseItem {

    private String itemId;
    private String itemName;
    private int quantity;

    public WarehouseItem(String itemId, String itemName, int quantity) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
    }

    public String getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addStock(int qty) {
        this.quantity += qty;
    }

    public void removeStock(int qty) {
        if (qty > quantity) {
            throw new IllegalArgumentException("Not enough stock available!");
        }
        this.quantity -= qty;
    }

    @Override
    public String toString() {
        return "ID=" + itemId + ", Name=" + itemName + ", Qty=" + quantity;
    }
}
