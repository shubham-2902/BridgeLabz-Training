package com.streamapi.loggingtransactions;
import java.time.LocalDateTime;
import java.util.*;

public class TransactionMain {
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
            new Transaction("TXN101"),
            new Transaction("TXN102"),
            new Transaction("TXN103")
        );

        transactions.forEach(t ->
            System.out.println(LocalDateTime.now() +
                " - Transaction: " + t.getId()));
    }
}
