package com.csvdatahandling.detectduplicates;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class DetectDuplicates {

    public static void main(String[] args) {

        Set<String> uniqueIds = new HashSet<>();
        Set<String> duplicateRows = new HashSet<>();

        try {
            InputStream is = DetectDuplicates.class
                    .getClassLoader()
                    .getResourceAsStream("employee.csv");

            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            String line;

            // Skip header
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String id = data[0];

                // If ID already exists, it's duplicate
                if (!uniqueIds.add(id)) {
                    duplicateRows.add(line);
                }
            }

            br.close();

            System.out.println("Duplicate Records:");
            for (String row : duplicateRows) {
                System.out.println(row);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
