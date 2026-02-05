package com.day1.MedInventory;
import java.util.*;

public class Inventory<T extends Item> {
    List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }
}
