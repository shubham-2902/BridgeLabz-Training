package com.queueinterface.generatebinarynumber;
import java.util.*;

public class GenerateBinaryNumbers {

    public static List<String> generateBinary(int n) {
        List<String> result = new ArrayList<>();
        if (n <= 0) return result;

        Queue<String> q = new LinkedList<>();
        q.add("1");

        for (int i = 1; i <= n; i++) {
            String current = q.remove();
            result.add(current);

            q.add(current + "0");
            q.add(current + "1");
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        List<String> binaries = generateBinary(n);
        System.out.println("First " + n + " binary numbers: " + binaries);

        sc.close();
    }
}
