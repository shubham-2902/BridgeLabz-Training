package com.day4.zipzapmart;
import java.time.LocalDateTime;

public class Sale {
    private String transactionId;
    private LocalDateTime dateTime;
    private double amount;

    public Sale(String transactionId, LocalDateTime dateTime, double amount) {
        this.transactionId = transactionId;
        this.dateTime = dateTime;
        this.amount = amount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "TxnID: " + transactionId +
                ", DateTime: " + dateTime +
                ", Amount: " + amount;
    }
}
