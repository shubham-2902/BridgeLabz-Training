package com.csvdatahandling.validatecsv;

import java.io.*;
import java.util.regex.*;

public class ValidateCSV {
    public static void main(String[] args) throws Exception {

        Pattern emailPattern = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
        Pattern phonePattern = Pattern.compile("\\d{10}");

        BufferedReader br = new BufferedReader(new InputStreamReader(
                ValidateCSV.class.getClassLoader().getResourceAsStream("contacts.csv")));

        br.readLine();
        String line;

        while ((line = br.readLine()) != null) {
            String[] d = line.split(",");

            if (!emailPattern.matcher(d[2]).matches())
                System.out.println("Invalid Email in row: " + line);

            if (!phonePattern.matcher(d[3]).matches())
                System.out.println("Invalid Phone in row: " + line);
        }
        br.close();
    }
}
