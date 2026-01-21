package com.streams.uppercasetolowercase;
import java.io.*;

public class UpperToLowerFileCopy {

    public static void main(String[] args) {

        String inputFile = "Hello";
        String outputFile = "output.txt";

        // UTF-8 encoding support
        try (
                BufferedReader br = new BufferedReader(
                        new InputStreamReader(new FileInputStream(inputFile), "UTF-8")
                );

                BufferedWriter bw = new BufferedWriter(
                        new OutputStreamWriter(new FileOutputStream(outputFile), "UTF-8")
                );
        ) {
            int ch;

            // Read character by character
            while ((ch = br.read()) != -1) {
                // Convert to lowercase
                bw.write(Character.toLowerCase((char) ch));
            }

            System.out.println("File written successfully with lowercase conversion!");

        } catch (FileNotFoundException e) {
            System.out.println("Input file not found: " + inputFile);
        } catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        }
    }
}
