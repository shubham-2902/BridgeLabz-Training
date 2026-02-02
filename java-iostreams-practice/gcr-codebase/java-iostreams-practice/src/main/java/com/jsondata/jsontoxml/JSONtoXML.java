package com.jsondata.jsontoxml;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import java.io.*;

public class JSONtoXML {

    public static void main(String[] args) {
        try {
            InputStream is = JSONtoXML.class.getClassLoader()
                    .getResourceAsStream("Sample.json");

            JsonNode node = new ObjectMapper().readTree(is);

            new XmlMapper().writeValue(new File("Sample.xml"), node);

            System.out.println("JSON converted to XML successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
