package com.day1.DealTracker;
import java.io.*;
import java.time.*;
import java.time.format.*;
import java.util.*;
import java.util.regex.*;

public class DealTrackerApp {

    public static void main(String[] args) {

        Map<String, Deal> dealMap = new HashMap<>();
        Set<String> dealCodes = new HashSet<>();
        PromotionManager<Deal> manager = new PromotionManager<>();

        Pattern codeP = Pattern.compile("DealCode: (.*)");
        Pattern dateP = Pattern.compile("ValidTill: (\\d{2}-\\d{2}-\\d{4})");
        Pattern discountP = Pattern.compile("Discount: (\\d+)%");
        Pattern minP = Pattern.compile("MinimumPurchase: (\\d+)");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("deals.txt")))) {

            String line;
            String code = null;
            int discount = 0;
            LocalDate date = null;
            int minPurchase = 0;

            while ((line = br.readLine()) != null) {

                Matcher m1 = codeP.matcher(line);
                Matcher m2 = dateP.matcher(line);
                Matcher m3 = discountP.matcher(line);
                Matcher m4 = minP.matcher(line);

                if (m1.find()) code = m1.group(1);
                if (m2.find()) date = LocalDate.parse(m2.group(1), formatter);
                if (m3.find()) discount = Integer.parseInt(m3.group(1));
                if (m4.find()) minPurchase = Integer.parseInt(m4.group(1));

                if (code != null && date != null) {
                    if (date.isBefore(LocalDate.now())) {
                        System.out.println("Expired deal skipped: " + code);
                    } else if (dealCodes.add(code)) {
                        Deal d = new Deal(code, discount, date, minPurchase);
                        dealMap.put(code, d);
                        manager.add(d);
                    } else {
                        System.out.println("Duplicate deal ignored: " + code);
                    }
                    code = null;
                    date = null;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        //  Sort by discount descending
        List<Deal> deals = manager.getAll();
        deals.sort(Comparator.comparingInt((Deal d) -> d.discount).reversed());

        System.out.println("\n--- Valid Deals Sorted by Discount ---");
        deals.forEach(System.out::println);
    }
}
