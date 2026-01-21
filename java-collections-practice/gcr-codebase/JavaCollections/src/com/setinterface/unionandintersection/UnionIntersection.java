package com.setinterface.unionandintersection;
import java.util.*;

public class UnionIntersection {

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

        // Union
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        // Intersection
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        System.out.println("\nSet1: " + set1);
        System.out.println("Set2: " + set2);
        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);

        sc.close();
    }
}
