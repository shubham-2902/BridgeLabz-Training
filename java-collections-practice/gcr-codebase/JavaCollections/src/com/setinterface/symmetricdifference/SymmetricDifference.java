package com.setinterface.symmetricdifference;
import java.util.*;

public class SymmetricDifference {

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

        // symmetric difference = (A union B) - (A intersection B)

        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        Set<Integer> symmetricDifference = new HashSet<>(union);
        symmetricDifference.removeAll(intersection);

        System.out.println("\nSet1: " + set1);
        System.out.println("Set2: " + set2);
        System.out.println("Symmetric Difference: " + symmetricDifference);

        sc.close();
    }
}
