package com.jsondata.IPLandCensorAnalyzer;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;

public class JSONProcessor {

    public static void processJSON() throws Exception {

        InputStream is = JSONProcessor.class.getClassLoader()
                .getResourceAsStream("ipl.json");

        ObjectMapper mapper = new ObjectMapper();
        Match[] matches = mapper.readValue(is, Match[].class);

        for (Match m : matches) {
            m.team1 = CensorUtil.maskTeam(m.team1);
            m.team2 = CensorUtil.maskTeam(m.team2);
            m.winner = CensorUtil.maskTeam(m.winner);
            m.player_of_match = CensorUtil.redactPlayer();
        }

        mapper.writerWithDefaultPrettyPrinter()
              .writeValue(new File("ipl_censored.json"), matches);

        System.out.println("Censored JSON generated!");
    }
}
