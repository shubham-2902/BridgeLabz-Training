package com.generics.smartwarehousemgmtsystem;
public class Furniture extends WarehouseItem {

    private String material;

    public Furniture(String itemId, String itemName, int quantity, String material) {
        super(itemId, itemName, quantity);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return "Furniture {" + super.toString() + ", Material=" + material + " }";
    }
}
