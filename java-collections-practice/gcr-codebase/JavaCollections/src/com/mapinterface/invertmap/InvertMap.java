package com.mapinterface.invertmap;
import java.util.*;

public class InvertMap {

    public static Map<Integer, List<String>> invertMap(Map<String, Integer> map) {
        Map<Integer, List<String>> inverted = new HashMap<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            inverted.putIfAbsent(value, new ArrayList<>());
            inverted.get(value).add(key);
        }

        return inverted;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> map = new HashMap<>();

        System.out.print("Enter number of entries: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            System.out.print("Enter key (String): ");
            String key = sc.nextLine();

            System.out.print("Enter value (Integer): ");
            int value = Integer.parseInt(sc.nextLine());

            map.put(key, value);
        }

        System.out.println("\nOriginal Map: " + map);

        Map<Integer, List<String>> inverted = invertMap(map);
        System.out.println("Inverted Map: " + inverted);

        sc.close();
    }
}
