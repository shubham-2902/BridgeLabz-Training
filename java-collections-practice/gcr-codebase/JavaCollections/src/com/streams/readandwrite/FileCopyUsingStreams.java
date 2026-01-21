package com.streams.readandwrite;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyUsingStreams {

    public static void main(String[] args) {

        String sourceFile = "Hello";
        String destinationFile = "destination";

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            // Open source file for reading
            fis = new FileInputStream(sourceFile);

            // Open destination file for writing (creates file if not exists)
            fos = new FileOutputStream(destinationFile);

            int data;

            // Read byte-by-byte and write into destination
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            System.out.println("File copied successfully from " + sourceFile + " to " + destinationFile);

        } 
        catch (FileNotFoundException e) {
            System.out.println("Source file not found: " + sourceFile);
        } 
        catch (IOException e) {
            System.out.println("I/O Error occurred: " + e.getMessage());
        } 
        finally {
            // Close resources properly
            try {
                if (fis != null) {
                    fis.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                System.out.println("Error while closing files: " + e.getMessage());
            }
        }
    }
}
