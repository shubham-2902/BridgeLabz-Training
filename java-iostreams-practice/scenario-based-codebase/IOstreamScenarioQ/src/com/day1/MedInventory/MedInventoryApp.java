package com.day1.MedInventory;
import java.io.*;
import java.util.*;
import java.util.regex.*;

public class MedInventoryApp {

    public static void main(String[] args) {

        String dateRegex = "\\d{2}-\\d{2}-\\d{4}";
        Pattern pattern = Pattern.compile(dateRegex);

        Set<Item> uniqueItems = new HashSet<>();
        Map<String, List<Item>> categoryMap = new HashMap<>();
        Inventory<Item> inventory = new Inventory<>();

        try (BufferedReader br = new BufferedReader(new FileReader("inventory.csv"))) {

            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                if (data.length != 4)
                    throw new InvalidDateFormatException("Invalid CSV format: " + line);

                Matcher matcher = pattern.matcher(data[3]);
                if (!matcher.matches())
                    throw new InvalidDateFormatException("Invalid date format: " + data[3]);

                Item item = new Item(data[0], data[1], Integer.parseInt(data[2]), data[3]);

                // Remove duplicates
                if (uniqueItems.add(item)) {
                    inventory.addItem(item);
                }

                // Categorize
                categoryMap.computeIfAbsent(item.itemName, k -> new ArrayList<>()).add(item);

                // Low stock check
                if (item.quantity < 5) {
                    throw new LowStockException(item.itemName + " is critically low!");
                }
            }

        } catch (LowStockException | InvalidDateFormatException e) {
            System.out.println("ALERT: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("\n--- Unique Inventory ---");
        uniqueItems.forEach(System.out::println);

        System.out.println("\n--- Categorized Items ---");
        categoryMap.forEach((k, v) -> System.out.println(k + " -> " + v));
    }
}
