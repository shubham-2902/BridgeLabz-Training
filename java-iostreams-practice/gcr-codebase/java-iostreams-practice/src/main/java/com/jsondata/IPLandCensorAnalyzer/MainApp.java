package com.jsondata.IPLandCensorAnalyzer;


public class MainApp {

    public static void main(String[] args) {
        try {
            JSONProcessor.processJSON();
            CSVProcessor.processCSV();
            System.out.println("IPL Censorship Completed Successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
