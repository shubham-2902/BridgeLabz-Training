package com.jsondata.validate;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class ValidateJSON {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.readTree(new File("sample.json"));
            System.out.println("Valid JSON structure!");
        } catch (Exception e) {
            System.out.println("Invalid JSON format.");
        }
    }
}
