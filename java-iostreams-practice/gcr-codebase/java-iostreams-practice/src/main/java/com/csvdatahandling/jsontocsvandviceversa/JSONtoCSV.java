package com.csvdatahandling.jsontocsvandviceversa;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.*;
import java.util.*;

public class JSONtoCSV {

    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        // Read JSON file
        InputStream is = JSONtoCSV.class.getClassLoader()
                .getResourceAsStream("students.json");

        Student[] students = mapper.readValue(is, Student[].class);

        // Write to CSV
        BufferedWriter bw = new BufferedWriter(new FileWriter("students_from_json.csv"));

        bw.write("ID,Name,Age,Marks");
        bw.newLine();

        for (Student s : students) {
            bw.write(s.id + "," + s.name + "," + s.age + "," + s.marks);
            bw.newLine();
        }

        bw.close();
        System.out.println("JSON converted to CSV!");
    }
}
