package com.jsondata.filterjson;

import com.fasterxml.jackson.databind.*;
import java.io.InputStream;

public class FilterStudents {
    public static void main(String[] args) {
        try {
            InputStream is = FilterStudents.class.getClassLoader()
                    .getResourceAsStream("Sample.json");

            JsonNode students = new ObjectMapper().readTree(is).get("students");

            for (JsonNode s : students) {
                if (s.get("age").asInt() > 21)
                    System.out.println(s.get("name").asText());
            }

            System.out.println("Filtering done!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
