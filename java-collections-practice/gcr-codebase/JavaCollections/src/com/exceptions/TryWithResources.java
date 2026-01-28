package com.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("info.txt"))) {

            String firstLine = reader.readLine();
            System.out.println(firstLine);

        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}