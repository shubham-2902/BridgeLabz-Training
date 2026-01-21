package com.listinterface.removeduplicates;
import java.util.*;

public class RemoveDuplicates {

    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>(list); // preserves insertion order
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        ArrayList<Integer> result = removeDuplicates(list);
        System.out.println("List after removing duplicates: " + result);

        sc.close();
    }
}
