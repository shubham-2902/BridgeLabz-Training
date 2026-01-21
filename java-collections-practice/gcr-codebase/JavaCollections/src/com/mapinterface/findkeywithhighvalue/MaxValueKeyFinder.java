package com.mapinterface.findkeywithhighvalue;
import java.util.*;

public class MaxValueKeyFinder {

    public static String findMaxValueKey(Map<String, Integer> map) {
        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        return maxKey;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> map = new HashMap<>();

        System.out.print("Enter number of entries: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter key (String): ");
            String key = sc.nextLine();

            System.out.print("Enter value (Integer): ");
            int value = Integer.parseInt(sc.nextLine());

            map.put(key, value);
        }

        System.out.println("\nMap: " + map);

        String result = findMaxValueKey(map);
        System.out.println("Key with highest value: " + result);

        sc.close();
    }
}
