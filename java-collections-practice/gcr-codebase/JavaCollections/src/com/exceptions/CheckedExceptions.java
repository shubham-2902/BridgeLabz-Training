package com.exceptions;

	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.IOException;

	public class CheckedExceptions {

	    public static void main(String[] args) {

	        BufferedReader reader = null;

	        try {
	            reader = new BufferedReader(new FileReader("data.txt"));
	            String line;

	            while ((line = reader.readLine()) != null) {
	                System.out.println(line);
	            }

	        } catch (IOException e) {
	            System.out.println("File not found");

	        } finally {
	            try {
	                if (reader != null) {
	                    reader.close();
	                }
	            } catch (IOException e) {
	                // Ignored
	            }
	        }
	    }
	}

