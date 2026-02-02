package com.methodreferences.invoiceobjectgeneration;
import java.util.*;
import java.util.stream.Collectors;

public class InvoiceGenerator {
    public static void main(String[] args) {

        List<Integer> transactionIds = Arrays.asList(5001, 5002, 5003);

        List<Invoice> invoices = transactionIds.stream()
                .map(Invoice::new)   // Constructor reference
                .collect(Collectors.toList());

        invoices.forEach(System.out::println);
    }
}
