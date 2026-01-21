package com.listinterface.findfrequency;
import java.util.*;

public class FrequencyOfElements {

    public static Map<String, Integer> findFrequency(List<String> list) {
        Map<String, Integer> map = new HashMap<>();

        for (String item : list) {
            map.put(item, map.getOrDefault(item, 0) + 1);
        }
        return map;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        List<String> list = new ArrayList<>();
        System.out.println("Enter " + n + " strings:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextLine());
        }

        Map<String, Integer> freq = findFrequency(list);
        System.out.println("Frequency Map: " + freq);

        sc.close();
    }
}
