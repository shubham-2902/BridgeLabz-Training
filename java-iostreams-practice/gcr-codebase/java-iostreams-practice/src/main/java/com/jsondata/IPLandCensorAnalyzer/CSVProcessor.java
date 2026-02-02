package com.jsondata.IPLandCensorAnalyzer;

import java.io.*;

public class CSVProcessor {

    public static void processCSV() throws Exception {

        InputStream is = CSVProcessor.class.getClassLoader()
                .getResourceAsStream("ipl.csv");

        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        BufferedWriter bw = new BufferedWriter(new FileWriter("ipl_censored.csv"));

        String header = br.readLine();
        bw.write(header);
        bw.newLine();

        String line;
        while ((line = br.readLine()) != null) {

            if (line.trim().isEmpty()) continue; // skip empty lines

            String[] d = line.split(",");

            if (d.length < 7) {
                System.out.println("Skipping invalid row: " + line);
                continue;
            }

            d[1] = CensorUtil.maskTeam(d[1]);
            d[2] = CensorUtil.maskTeam(d[2]);
            d[5] = CensorUtil.maskTeam(d[5]);
            d[6] = CensorUtil.redactPlayer();

            bw.write(String.join(",", d));
            bw.newLine();
        }


        br.close();
        bw.close();

        System.out.println("Censored CSV generated!");
    }
}
