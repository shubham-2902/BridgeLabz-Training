package com.day1.MarkMate;

import java.io.*;
import java.util.*;

public class CSVReader {

    public static List<Student> readCSV(String filePath) {
        List<Student> students = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine(); // skip header

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                try {
                    String name = data[0];
                    int maths = Integer.parseInt(data[1]);
                    int science = Integer.parseInt(data[2]);
                    int english = Integer.parseInt(data[3]);

                    students.add(new Student(name, maths, science, english));

                } catch (Exception e) {
                    System.out.println("Invalid record skipped: " + line);
                }
            }

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }

        return students;
    }
}
