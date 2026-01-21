
package com.mapinterface.freqcounter;
import java.io.*;
import java.util.*;

public class WordFrequencyCounter {

    public static Map<String, Integer> countWordFrequency(String filePath) throws IOException {
        Map<String, Integer> freqMap = new HashMap<>();

        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;

        while ((line = br.readLine()) != null) {
            // convert to lowercase
            line = line.toLowerCase();

            // remove punctuation (keep only letters, digits and spaces)
            line = line.replaceAll("[^a-z0-9\\s]", " ");

            // split by spaces
            String[] words = line.trim().split("\\s+");

            for (String word : words) {
                if (!word.isEmpty()) {
                    freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
                }
            }
        }

        br.close();
        return freqMap;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file path: ");
        String filePath = sc.nextLine();

        try {
            Map<String, Integer> result = countWordFrequency(filePath);
            System.out.println("\nWord Frequency:");
            System.out.println(result);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        sc.close();
    }
}
