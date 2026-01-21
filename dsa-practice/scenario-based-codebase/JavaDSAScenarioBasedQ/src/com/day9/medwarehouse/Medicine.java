package com.day9.medwarehouse;

public class Medicine {
    private String batchId;
    private String name;
    private int quantity;
    private String expiryDate;   // YYYY-MM-DD
    private String branchName;

    public Medicine(String batchId, String name, int quantity, String expiryDate, String branchName) {
        this.batchId = batchId;
        this.name = name;
        this.quantity = quantity;
        this.expiryDate = expiryDate;
        this.branchName = branchName;
    }

    public String getBatchId() {
        return batchId;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public String getBranchName() {
        return branchName;
    }

    @Override
    public String toString() {
        return "Batch: " + batchId +
                ", Name: " + name +
                ", Qty: " + quantity +
                ", Expiry: " + expiryDate +
                ", Branch: " + branchName;
    }
}
