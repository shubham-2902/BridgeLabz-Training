package com.csvdatahandling.readlargecsv;

import java.io.BufferedReader;
import java.io.FileReader;

public class LargeCSVProcessor {

    public static void main(String[] args) {

        String filePath ="C:\\Users\\shubh\\Downloads\\1000000 Sales Records.7z"; // Large file path
// we actually do not have 
        int batchSize = 100;
        int batchCount = 0;
        int totalProcessed = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            // Skip heading by reading it here
            br.readLine();

            String line;

            while ((line = br.readLine()) != null) {

                // Process each row here 
                batchCount++;

                if (batchCount == batchSize) {
                    totalProcessed += batchCount;
                    System.out.println("Processed records so far: " + totalProcessed);
                    batchCount = 0; // reset for next batch
                }
            }

            // Process remaining records 
            if (batchCount > 0) {
                totalProcessed += batchCount;
                System.out.println("Processed records so far: " + totalProcessed);
            }

            System.out.println("Finished processing file.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
