package com.csvdatahandling.converttoobject;

import java.util.List;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CSVToObject {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        try {
            InputStream is = CSVToObject.class
                    .getClassLoader()
                    .getResourceAsStream("students.csv");

            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            String line;

            // Skip header
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                int age = Integer.parseInt(data[2]);
                int marks = Integer.parseInt(data[3]);

                Student student = new Student(id, name, age, marks);
                students.add(student);
            }

            br.close();

            // Print list of objects
            for (Student s : students) {
                System.out.println(s);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
