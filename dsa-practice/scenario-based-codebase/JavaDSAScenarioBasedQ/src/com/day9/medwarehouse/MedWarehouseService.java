package com.day9.medwarehouse;

import java.util.*;

public class MedWarehouseService {

    // Each branch has its own list of medicines
    private Map<String, List<Medicine>> branchData = new HashMap<>();

    private final BranchDataMerger merger = new BranchDataMerger();
    private final MergeSortMedicinesByExpiry sorter = new MergeSortMedicinesByExpiry();

    public void addMedicine(String branchName, Medicine medicine) {
        branchData.putIfAbsent(branchName, new ArrayList<>());
        branchData.get(branchName).add(medicine);
    }

    public void displayBranchWiseData() {
        if (branchData.isEmpty()) {
            System.out.println("No branch data available.");
            return;
        }

        for (String branch : branchData.keySet()) {
            System.out.println("\nBranch: " + branch);
            List<Medicine> meds = branchData.get(branch);

            if (meds.isEmpty()) {
                System.out.println("  No medicines.");
                continue;
            }

            for (Medicine m : meds) {
                System.out.println("  " + m);
            }
        }
    }

    // Generate final sorted master list
    public List<Medicine> getMasterSortedList() {
        List<Medicine> master = merger.mergeBranches(branchData);
        sorter.sort(master);
        return master;
    }

    // Alert medicines with expiry <= cutoffDate
    public List<Medicine> getNearExpiryMedicines(String cutoffDate) {
        List<Medicine> master = getMasterSortedList();
        List<Medicine> alert = new ArrayList<>();

        int cutoff = DateUtil.toSortableDate(cutoffDate);

        for (Medicine m : master) {
            int exp = DateUtil.toSortableDate(m.getExpiryDate());
            if (exp <= cutoff) {
                alert.add(m);
            } else {
                // master is sorted, so once we pass cutoff we can stop
                break;
            }
        }
        return alert;
    }

    public boolean hasAnyData() {
        return !branchData.isEmpty();
    }
}
