package com.setinterface.checkequal;
import java.util.*;

public class CheckSetsEqual {

    public static Set<Integer> readSet(Scanner sc, String setName) {
        System.out.print("Enter number of elements in " + setName + ": ");
        int n = sc.nextInt();

        Set<Integer> set = new HashSet<>();
        System.out.println("Enter " + n + " integers for " + setName + ":");
        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }
        return set;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> set1 = readSet(sc, "Set1");
        Set<Integer> set2 = readSet(sc, "Set2");

        boolean isEqual = set1.equals(set2);

        System.out.println("\nSet1: " + set1);
        System.out.println("Set2: " + set2);
        System.out.println("Are both sets equal? " + isEqual);

        sc.close();
    }
}
