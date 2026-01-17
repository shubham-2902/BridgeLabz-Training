package com.day5.robowarehouse;
public class PackageItem {
    private String packageId;
    private double weight;

    public PackageItem(String packageId, double weight) {
        this.packageId = packageId;
        this.weight = weight;
    }

    public String getPackageId() {
        return packageId;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "PackageID: " + packageId + ", Weight: " + weight;
    }
}
