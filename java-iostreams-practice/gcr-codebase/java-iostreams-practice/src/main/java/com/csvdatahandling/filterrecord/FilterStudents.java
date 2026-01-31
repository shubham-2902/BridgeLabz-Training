package com.csvdatahandling.filterrecord;

import java.io.*;

public class FilterStudents {
    public static void main(String[] args) throws Exception {

        InputStream is = FilterStudents.class
                .getClassLoader()
                .getResourceAsStream("students.csv");

        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        String line = br.readLine(); // skip header

        System.out.println("Students scoring > 80:");

        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            int marks = Integer.parseInt(data[3]);

            if (marks > 80) {
                System.out.println(data[0] + " " + data[1] + " " + marks);
            }
        }
        br.close();
    }
}
