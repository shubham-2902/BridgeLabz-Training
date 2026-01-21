package com.streams.readalargefile;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLargeFileErrors {

    public static void main(String[] args) {

        String filePath = "Hello";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;

            while ((line = br.readLine()) != null) {
                // case-insensitive check
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }

        } catch (IOException e) {
            System.out.println("File reading error: " + e.getMessage());
        }
    }
}
