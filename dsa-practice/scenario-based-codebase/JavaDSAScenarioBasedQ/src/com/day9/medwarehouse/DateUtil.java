package com.day9.medwarehouse;

public class DateUtil {

    // Converts "YYYY-MM-DD" -> sortable integer "YYYYMMDD"
    public static int toSortableDate(String date) {
        return Integer.parseInt(date.replace("-", ""));
    }

    // Basic format validation (DSA-friendly)
    public static boolean isValidDate(String date) {
        if (date == null) return false;
        if (!date.matches("\\d{4}-\\d{2}-\\d{2}")) return false;

        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));

        if (month < 1 || month > 12) return false;
        if (day < 1 || day > 31) return false;

        return true;
    }
}
