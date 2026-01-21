package com.listinterface.findelement;
import java.util.*;

public class NthFromEnd {

    public static String nthFromEnd(LinkedList<String> list, int n) {
        if (n <= 0) throw new IllegalArgumentException("N must be > 0");

        Iterator<String> fast = list.iterator();
        Iterator<String> slow = list.iterator();

        // move fast n steps ahead
        for (int i = 0; i < n; i++) {
            if (!fast.hasNext()) throw new IllegalArgumentException("N is larger than list size");
            fast.next();
        }

        // move both pointers
        while (fast.hasNext()) {
            fast.next();
            slow.next();
        }

        return slow.next(); // slow now at Nth from end
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int size = sc.nextInt();
        sc.nextLine(); // consume newline

        LinkedList<String> list = new LinkedList<>();
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            list.add(sc.nextLine());
        }

        System.out.print("Enter N (Nth from end): ");
        int n = sc.nextInt();

        try {
            String result = nthFromEnd(list, n);
            System.out.println("Nth element from end: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
