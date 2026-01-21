package com.setinterface.settosortedlist;
import java.util.*;

public class SetToSortedList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        Set<Integer> set = new HashSet<>();
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }

        // Convert set -> list
        List<Integer> list = new ArrayList<>(set);

        // Sort list ascending
        Collections.sort(list);

        System.out.println("\nOriginal Set: " + set);
        System.out.println("Sorted List: " + list);

        sc.close();
    }
}
