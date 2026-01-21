package com.queueinterface.reverse;
import java.util.*;

public class ReverseQueue {

    // Reverse using recursion (no stack collection used)
    public static void reverseQueue(Queue<Integer> q) {
        if (q.isEmpty()) return;

        int front = q.remove();
        reverseQueue(q);
        q.add(front);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Queue<Integer> q = new LinkedList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            q.add(sc.nextInt());
        }

        System.out.println("Original Queue: " + q);
        reverseQueue(q);
        System.out.println("Reversed Queue: " + q);

        sc.close();
    }
}
