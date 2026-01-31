package com.csvdatahandling.mergecsv;

import java.io.*;
import java.util.*;

public class MergeCSV {

    public static void main(String[] args) {

        try {
            Map<String, String[]> map = new HashMap<>();

            // Read first file (students1.csv)
            InputStream is1 = MergeCSV.class
                    .getClassLoader()
                    .getResourceAsStream("students1.csv");

            BufferedReader br1 = new BufferedReader(new InputStreamReader(is1));
            br1.readLine(); // skip header

            String line;
            while ((line = br1.readLine()) != null) {
                String[] data = line.split(",");
                map.put(data[0], data); // ID → full row
            }
            br1.close();

            // Read second file & write merged output
            InputStream is2 = MergeCSV.class
                    .getClassLoader()
                    .getResourceAsStream("students2.csv");

            BufferedReader br2 = new BufferedReader(new InputStreamReader(is2));
            BufferedWriter bw = new BufferedWriter(new FileWriter("merged_students.csv"));

            // Write header
            bw.write("ID,Name,Age,Marks,Grade");
            bw.newLine();

            br2.readLine(); // skip header

            while ((line = br2.readLine()) != null) {
                String[] data2 = line.split(",");
                String id = data2[0];

                if (map.containsKey(id)) {
                    String[] data1 = map.get(id);

                    bw.write(data1[0] + "," + data1[1] + "," + data1[2] + "," +
                             data2[1] + "," + data2[2]);
                    bw.newLine();
                }
            }

            br2.close();
            bw.close();

            System.out.println("Files merged successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
