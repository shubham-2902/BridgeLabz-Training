package com.listinterface.reverselist;
import java.util.*;

public class ReverseList {

    // Reverse ArrayList in-place (two pointers)
    public static void reverseArrayList(ArrayList<Integer> list) {
        int left = 0, right = list.size() - 1;

        while (left < right) {
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }

    // Reverse LinkedList without reverse()
    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> list) {
        LinkedList<Integer> reversed = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversed.add(list.get(i));
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arrayList.add(sc.nextInt());
        }

        // Reverse ArrayList
        reverseArrayList(arrayList);
        System.out.println("Reversed ArrayList: " + arrayList);

        // Reverse LinkedList
        // taking the revered arraylist as input for linkedlist	
        LinkedList<Integer> linkedList = new LinkedList<>(arrayList);
        LinkedList<Integer> reversedLinkedList = reverseLinkedList(linkedList);
        System.out.println("Reversed LinkedList: " + reversedLinkedList);

        sc.close();
    }
}
