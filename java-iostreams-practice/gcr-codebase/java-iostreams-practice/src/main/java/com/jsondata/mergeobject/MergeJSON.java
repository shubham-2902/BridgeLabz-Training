package com.jsondata.mergeobject;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.File;

public class MergeJSON {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();

            ObjectNode obj1 = mapper.createObjectNode();
            obj1.put("name", "Rahul");

            ObjectNode obj2 = mapper.createObjectNode();
            obj2.put("age", 20);

            obj1.setAll(obj2);
            mapper.writeValue(new File("merged.json"), obj1);

            System.out.println("merged.json created successfully!");
        } catch (Exception e) {
            System.out.println("Error merging JSON.");
        }
    }
}
