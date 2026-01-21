package com.day9.medwarehouse;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BranchDataMerger {

    // Combine all branch lists into one master list
    public List<Medicine> mergeBranches(Map<String, List<Medicine>> branchData) {
        List<Medicine> master = new ArrayList<>();

        for (List<Medicine> list : branchData.values()) {
            master.addAll(list);
        }

        return master;
    }
}
