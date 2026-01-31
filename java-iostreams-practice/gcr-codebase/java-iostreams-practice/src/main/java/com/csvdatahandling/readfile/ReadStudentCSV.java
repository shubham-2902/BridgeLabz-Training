package com.csvdatahandling.readfile;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ReadStudentCSV {

    public static void main(String[] args) {

        try {
            // Load CSV file from resources folder
            InputStream is = ReadStudentCSV.class
                    .getClassLoader()
                    .getResourceAsStream("students.csv");

            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            String line;

            // Skip header row
            br.readLine();

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                int age = Integer.parseInt(data[2]);
                int marks = Integer.parseInt(data[3]);

                System.out.println("Student Record");
                System.out.println("ID    : " + id);
                System.out.println("Name  : " + name);
                System.out.println("Age   : " + age);
                System.out.println("Marks : " + marks);
                System.out.println("----------------------");
            }

            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
