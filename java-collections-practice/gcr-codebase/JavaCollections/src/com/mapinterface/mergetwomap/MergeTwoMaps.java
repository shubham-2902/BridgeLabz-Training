package com.mapinterface.mergetwomap;
import java.util.*;

public class MergeTwoMaps {

    public static Map<String, Integer> mergeMaps(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> result = new HashMap<>(map1);

        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();

            result.put(key, result.getOrDefault(key, 0) + value);
        }

        return result;
    }

    public static Map<String, Integer> readMap(Scanner sc, String name) {
        Map<String, Integer> map = new HashMap<>();

        System.out.print("Enter number of entries in " + name + ": ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter key (String): ");
            String key = sc.nextLine();

            System.out.print("Enter value (Integer): ");
            int value = Integer.parseInt(sc.nextLine());

            map.put(key, value);
        }

        return map;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> map1 = readMap(sc, "Map1");
        Map<String, Integer> map2 = readMap(sc, "Map2");

        System.out.println("\nMap1: " + map1);
        System.out.println("Map2: " + map2);

        Map<String, Integer> merged = mergeMaps(map1, map2);
        System.out.println("Merged Map: " + merged);

        sc.close();
    }
}
