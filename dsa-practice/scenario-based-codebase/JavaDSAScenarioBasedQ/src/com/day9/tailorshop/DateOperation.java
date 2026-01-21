package com.day9.tailorshop;

public class DateOperation {

    // Converts "YYYY-MM-DD" to sortable integer "YYYYMMDD"
    public static int toSortableDate(String date) {
        return Integer.parseInt(date.replace("-", ""));
    }

    public static boolean isValidDate(String date) {
        if (date == null) return false;
        if (!date.matches("\\d{4}-\\d{2}-\\d{2}")) return false;

        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));

        if (month < 1 || month > 12) return false;
        if (day < 1 || day > 31) return false; // basic validation is enough for DSA scenario

        return true;
    }
}
