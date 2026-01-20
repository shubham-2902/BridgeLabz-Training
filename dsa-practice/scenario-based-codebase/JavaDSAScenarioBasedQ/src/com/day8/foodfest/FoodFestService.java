package com.day8.foodfest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FoodFestService {

    // Each zone has its own daily log list (zone-wise dataset)
    private Map<String, List<StallFootfall>> zoneLogs = new HashMap<>();

    public void addStallLog(String zone, StallFootfall record) {
        zoneLogs.putIfAbsent(zone, new ArrayList<>());
        zoneLogs.get(zone).add(record);
    }

    public void printZoneWise() {
        if (zoneLogs.isEmpty()) {
            System.out.println("No zone logs added yet.");
            return;
        }

        for (String zone : zoneLogs.keySet()) {
            System.out.println("\nZone: " + zone);
            List<StallFootfall> list = zoneLogs.get(zone);
            for (StallFootfall s : list) {
                System.out.println(s);
            }
        }
    }

    // Combine all zones into one master list
    public List<StallFootfall> getMasterList() {
        List<StallFootfall> master = new ArrayList<>();
        for (List<StallFootfall> list : zoneLogs.values()) {
            master.addAll(list);
        }
        return master;
    }
}
