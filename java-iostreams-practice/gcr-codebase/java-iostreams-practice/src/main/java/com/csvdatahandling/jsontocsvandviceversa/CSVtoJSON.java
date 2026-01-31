package com.csvdatahandling.jsontocsvandviceversa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CSVtoJSON {

    public static void main(String[] args) throws Exception {
        csvToJson();  // call your method
    }

    public static void csvToJson() throws Exception {

        List<Student> list = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader("students_from_json.csv"));

        br.readLine(); // skip header
        String line;

        while ((line = br.readLine()) != null) {
            String[] d = line.split(",");
            Student s = new Student();
            s.id = Integer.parseInt(d[0]);
            s.name = d[1];
            s.age = Integer.parseInt(d[2]);
            s.marks = Integer.parseInt(d[3]);
            list.add(s);
        }
        br.close();

        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File("students_from_csv.json"), list);

        System.out.println("CSV converted back to JSON!");
    }
}
