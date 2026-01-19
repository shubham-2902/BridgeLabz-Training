package com.generics.smartwarehousemgmtsystem;
import java.util.ArrayList;
import java.util.List;

public class Storage<T extends WarehouseItem> {

    // Generic list: stores only objects of type T safely
    private List<T> items;

    public Storage() {
        items = new ArrayList<>();
    }

    public void storeItem(T item) {
        items.add(item);
    }

    public T retrieveItemById(String itemId) {
        for (T item : items) {
            if (item.getItemId().equalsIgnoreCase(itemId)) {
                return item;
            }
        }
        return null;
    }

    public List<T> getAllItems() {
        return items;
    }
}
