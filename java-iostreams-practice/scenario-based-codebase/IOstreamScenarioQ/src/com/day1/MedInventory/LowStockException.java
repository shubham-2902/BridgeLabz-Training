package com.day1.MedInventory;
public class LowStockException extends Exception {
    public LowStockException(String msg) {
        super(msg);
    }
}
