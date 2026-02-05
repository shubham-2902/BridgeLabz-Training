package com.day1.MedInventory;
public class Item {
    String itemId;
    String itemName;
    int quantity;
    String expiryDate; // dd-MM-yyyy

    public Item(String itemId, String itemName, int quantity, String expiryDate) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.expiryDate = expiryDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;
        Item item = (Item) o;
        return itemId.equals(item.itemId);
    }

    @Override
    public int hashCode() {
        return itemId.hashCode();
    }

    @Override
    public String toString() {
        return itemId + " " + itemName + " Qty:" + quantity + " Exp:" + expiryDate;
    }
}
