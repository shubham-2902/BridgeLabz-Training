package com.jsondata.printkeyvalue;

import com.fasterxml.jackson.databind.*;
import java.io.*;

public class ReadJSONKeys {
    public static void main(String[] args) {
        try {
            InputStream is = ReadJSONKeys.class.getClassLoader()
                    .getResourceAsStream("Sample.json");

            JsonNode root = new ObjectMapper().readTree(is);

            root.fields().forEachRemaining(e ->
                System.out.println(e.getKey() + " : " + e.getValue())
            );

            System.out.println("Read successful!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
