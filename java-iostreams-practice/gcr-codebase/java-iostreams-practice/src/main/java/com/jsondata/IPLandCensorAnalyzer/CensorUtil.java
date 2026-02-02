package com.jsondata.IPLandCensorAnalyzer;

public class CensorUtil {

    public static String maskTeam(String team) {
        int index = team.lastIndexOf(" ");
        return (index > 0) ? team.substring(0, index) + " ***" : "***";
    }

    public static String redactPlayer() {
        return "REDACTED";
    }
}
