package com.jsondata.readjson;

import com.fasterxml.jackson.databind.*;
import java.io.File;

public class ExtractFields {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            JsonNode node = mapper.readTree(new File("students.json"));

            System.out.println("Name: " + node.get("name").asText());
            System.out.println("Age: " + node.get("age").asText());
            System.out.println("Fields extracted successfully!");
        } catch (Exception e) {
            System.out.println(e.getMessage()+"\nError reading JSON file.");
        }
    }
}
