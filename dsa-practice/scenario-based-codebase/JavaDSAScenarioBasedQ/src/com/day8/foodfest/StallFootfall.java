package com.day8.foodfest;
public class StallFootfall {
    private String stallName;
    private int footfall;
    private String zone;

    public StallFootfall(String stallName, int footfall, String zone) {
        this.stallName = stallName;
        this.footfall = footfall;
        this.zone = zone;
    }

    public String getStallName() {
        return stallName;
    }

    public int getFootfall() {
        return footfall;
    }

    public String getZone() {
        return zone;
    }

    @Override
    public String toString() {
        return stallName + " (" + zone + ") -> " + footfall;
    }
}
