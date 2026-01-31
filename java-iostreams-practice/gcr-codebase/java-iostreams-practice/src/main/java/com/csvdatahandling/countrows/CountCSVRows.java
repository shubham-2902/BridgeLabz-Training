package com.csvdatahandling.countrows;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class CountCSVRows {

    public static void main(String[] args) {

        int count = 0;

        try {
            InputStream is = CountCSVRows.class
                    .getClassLoader()
                    .getResourceAsStream("students.csv");

            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            // Skip header
            br.readLine();

            while (br.readLine() != null) {
                count++;
            }

            br.close();

            System.out.println("Number of records (excluding header): " + count);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
