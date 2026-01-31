package com.csvdatahandling.searchrecord;

import java.io.*;
import java.util.Scanner;

public class SearchEmployee {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        String searchName = sc.nextLine();

        InputStream is = SearchEmployee.class
                .getClassLoader()
                .getResourceAsStream("employee.csv");

        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        br.readLine(); // skip header
        String line;
        boolean found = false;

        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");

            if (data[1].equalsIgnoreCase(searchName)) {
                System.out.println("Department: " + data[2]);
                System.out.println("Salary: " + data[3]);
                found = true;
                break;
            }
        }

        if (!found) System.out.println("Employee not found");
        br.close();
    }
}
