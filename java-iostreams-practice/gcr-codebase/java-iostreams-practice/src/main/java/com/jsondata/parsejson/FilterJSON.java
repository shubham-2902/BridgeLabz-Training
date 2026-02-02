package com.jsondata.parsejson;

import com.fasterxml.jackson.databind.*;
import java.io.InputStream;

public class FilterJSON {
    public static void main(String[] args) {
    	try {
    	    InputStream is = FilterJSON.class.getClassLoader()
    	            .getResourceAsStream("people.json");

    	    JsonNode root = new ObjectMapper().readTree(is);

    	    System.out.println("Filtered records:");
    	    for (JsonNode n : root) {
    	        if (n.get("age").asInt() > 25)
    	            System.out.println(n);
    	    }

    	    System.out.println("Filtering completed successfully!");

    	} catch (Exception e) {
    	    e.printStackTrace();
    	}
    }}
    
