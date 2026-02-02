package com.methodreferences.nameuppercasing;
import java.util.*;

public class HRLetter {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("rahul", "sneha", "vikas");

        names.stream()
             .map(String::toUpperCase)   // Method reference
             .forEach(System.out::println);
    }
}
