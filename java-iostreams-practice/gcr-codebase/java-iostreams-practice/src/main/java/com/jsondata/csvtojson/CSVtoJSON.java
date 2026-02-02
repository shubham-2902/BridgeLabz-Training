package com.jsondata.csvtojson;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.*;
import java.util.*;

public class CSVtoJSON {

    public static void main(String[] args) {
        try {
            InputStream is = CSVtoJSON.class.getClassLoader()
                    .getResourceAsStream("students.csv");

            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            String[] headers = br.readLine().split(",");
            List<Map<String, String>> list = new ArrayList<>();

            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                Map<String, String> map = new HashMap<>();
                for (int i = 0; i < headers.length; i++)
                    map.put(headers[i], values[i]);
                list.add(map);
            }

            new ObjectMapper().writeValue(new File("newStudents.json"), list);
            System.out.println("CSV converted to JSON successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
