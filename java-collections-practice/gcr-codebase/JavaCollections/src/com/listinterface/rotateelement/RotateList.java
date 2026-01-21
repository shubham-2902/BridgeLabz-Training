package com.listinterface.rotateelement;
import java.util.*;

public class RotateList {

    // Left rotation by k
    public static ArrayList<Integer> rotateLeft(ArrayList<Integer> list, int k) {
        int n = list.size();
        if (n == 0) return list;

        k = k % n;
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = k; i < n; i++) result.add(list.get(i));
        for (int i = 0; i < k; i++) result.add(list.get(i));

        return result;
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

        System.out.print("Enter rotation value k: ");
        int k = sc.nextInt();

        ArrayList<Integer> rotated = rotateLeft(list, k);
        System.out.println("Rotated List: " + rotated);

        sc.close();
    }
}
