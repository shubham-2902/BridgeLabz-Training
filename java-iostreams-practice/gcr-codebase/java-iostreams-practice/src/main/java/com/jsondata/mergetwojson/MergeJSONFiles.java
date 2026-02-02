package com.jsondata.mergetwojson;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.*;

public class MergeJSONFiles {

    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();

            InputStream is1 = MergeJSONFiles.class.getClassLoader()
                    .getResourceAsStream("Sample.json");//first file
            InputStream is2 = MergeJSONFiles.class.getClassLoader()
                    .getResourceAsStream("Sample2.json");//second file

            ObjectNode json1 = (ObjectNode) mapper.readTree(is1);
            ObjectNode json2 = (ObjectNode) mapper.readTree(is2);

            json1.setAll(json2); // merge

            mapper.writerWithDefaultPrettyPrinter()
                  .writeValue(new File("merged.json"), json1);

            System.out.println("Files merged successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
