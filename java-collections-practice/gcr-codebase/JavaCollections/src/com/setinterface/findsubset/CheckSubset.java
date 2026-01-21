package com.setinterface.findsubset;
import java.util.*;

public class CheckSubset {

    public static Set<Integer> readSet(Scanner sc, String name) {
        System.out.print("Enter number of elements in " + name + ": ");
        int n = sc.nextInt();

        Set<Integer> set = new HashSet<>();
        System.out.println("Enter " + n + " integers for " + name + ":");
        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }
        return set;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> set1 = readSet(sc, "Set1");
        Set<Integer> set2 = readSet(sc, "Set2");

        boolean isSubset = set2.containsAll(set1);

        System.out.println("\nSet1: " + set1);
        System.out.println("Set2: " + set2);
        System.out.println("Is Set1 subset of Set2? " + isSubset);

        sc.close();
    }
}
