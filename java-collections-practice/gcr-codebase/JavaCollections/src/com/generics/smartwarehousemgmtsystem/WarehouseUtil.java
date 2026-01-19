package com.generics.smartwarehousemgmtsystem;
import java.util.List;

public class WarehouseUtil {

    // Wildcard: accepts Electronics/Groceries/Furniture lists
    public static void displayItems(List<? extends WarehouseItem> items) {

        if (items.isEmpty()) {
            System.out.println("Storage is empty.");
            return;
        }

        System.out.println("\n--- Warehouse Items ---");
        for (WarehouseItem item : items) {
            System.out.println(item);
        }
    }
}
