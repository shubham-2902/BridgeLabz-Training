package com.streamapi.transformingnames;
import java.util.*;

public class CustomerMain {
    public static void main(String[] args) {
        List<Customer> customers = Arrays.asList(
            new Customer("rajiv"),
            new Customer("amit"),
            new Customer("riya")
        );

        customers.stream()
                 .map(c -> c.getName().toUpperCase())
                 .sorted()
                 .forEach(System.out::println);
    }
}
