package com.streams.countwords;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WordFrequencyCounter {

    public static void main(String[] args) {

        String filePath = "Hello"; 
        HashMap<String, Integer> map = new HashMap<>();

        int totalWords = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;

            while ((line = br.readLine()) != null) {

                // remove special characters and make lowercase
                line = line.toLowerCase().replaceAll("[^a-z0-9 ]", " ");

                // split into words
                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        totalWords++;

                        // count frequency
                        map.put(word, map.getOrDefault(word, 0) + 1);
                    }
                }
            }

            System.out.println("Total Words = " + totalWords);

            // sort map entries by frequency (descending)
            List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

            list.sort((a, b) -> b.getValue() - a.getValue()); // descending order

            System.out.println("\nTop 5 most frequent words:");
            for (int i = 0; i < 5 && i < list.size(); i++) {
                System.out.println((i + 1) + ". " + list.get(i).getKey()
                        + " -> " + list.get(i).getValue());
            }

        } catch (IOException e) {
            System.out.println("File Error: " + e.getMessage());
        }
    }
}
