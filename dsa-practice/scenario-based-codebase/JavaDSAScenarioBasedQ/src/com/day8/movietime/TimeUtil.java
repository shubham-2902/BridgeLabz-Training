package com.day8.movietime;
public class TimeUtil {

    // Converts "HH:mm" into total minutes (e.g., "14:30" -> 870)
    public static int toMinutes(String hhmm) {
        String[] parts = hhmm.split(":");
        int hh = Integer.parseInt(parts[0]);
        int mm = Integer.parseInt(parts[1]);
        return hh * 60 + mm;
    }

    public static boolean isValidHHMM(String hhmm) {
        if (hhmm == null) return false;
        if (!hhmm.matches("\\d{2}:\\d{2}")) return false;

        int hh = Integer.parseInt(hhmm.substring(0, 2));
        int mm = Integer.parseInt(hhmm.substring(3, 5));
        return hh >= 0 && hh <= 23 && mm >= 0 && mm <= 59;
    }
}
