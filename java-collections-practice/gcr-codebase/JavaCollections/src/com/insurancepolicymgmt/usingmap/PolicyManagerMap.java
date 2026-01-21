package com.insurancepolicymgmt.usingmap;
import java.time.LocalDate;
import java.util.*;

public class PolicyManagerMap {

    private Map<String, Policy> hashMapPolicies;
    private Map<String, Policy> linkedHashMapPolicies;
    private TreeMap<ExpiryKey, Policy> treeMapPolicies;

    public PolicyManagerMap() {
        hashMapPolicies = new HashMap<>();
        linkedHashMapPolicies = new LinkedHashMap<>();
        treeMapPolicies = new TreeMap<>();
    }

    // 1) Add policy to all maps
    public void addPolicy(Policy policy) {
        String number = policy.getPolicyNumber();

        // If policy exists, remove old from TreeMap first (to avoid duplicates there)
        if (hashMapPolicies.containsKey(number)) {
            Policy old = hashMapPolicies.get(number);
            treeMapPolicies.remove(new ExpiryKey(old.getExpiryDate(), old.getPolicyNumber()));
        }

        hashMapPolicies.put(number, policy);
        linkedHashMapPolicies.put(number, policy);

        ExpiryKey key = new ExpiryKey(policy.getExpiryDate(), policy.getPolicyNumber());
        treeMapPolicies.put(key, policy);
    }

    // 2a) Retrieve policy by number
    public Policy getPolicyByNumber(String policyNumber) {
        return hashMapPolicies.get(policyNumber);
    }

    // 2b) List policies expiring within next N days
    public List<Policy> getPoliciesExpiringWithinDays(int days) {
        List<Policy> result = new ArrayList<>();

        LocalDate now = LocalDate.now();
        LocalDate endDate = now.plusDays(days);

        // TreeMap sorted by expiry date => best for this query
        for (Map.Entry<ExpiryKey, Policy> entry : treeMapPolicies.entrySet()) {
            LocalDate expiry = entry.getKey().getExpiryDate();

            if (expiry.isBefore(now)) {
                continue; // already expired
            }

            if (expiry.isAfter(endDate)) {
                break; // because sorted, stop early
            }

            result.add(entry.getValue());
        }
        return result;
    }

    // 2c) List all policies for a specific policyholder
    public List<Policy> getPoliciesByPolicyHolder(String holderName) {
        List<Policy> result = new ArrayList<>();

        for (Policy p : hashMapPolicies.values()) {
            if (p.getPolicyHolderName().equalsIgnoreCase(holderName)) {
                result.add(p);
            }
        }
        return result;
    }

    // 2d) Remove policies that are expired
    public int removeExpiredPolicies() {
        LocalDate now = LocalDate.now();

        // Collect expired policy numbers
        List<String> expiredPolicyNumbers = new ArrayList<>();

        for (Policy p : hashMapPolicies.values()) {
            if (p.getExpiryDate().isBefore(now)) {
                expiredPolicyNumbers.add(p.getPolicyNumber());
            }
        }

        // Remove from all maps
        for (String policyNumber : expiredPolicyNumbers) {
            Policy p = hashMapPolicies.remove(policyNumber);
            linkedHashMapPolicies.remove(policyNumber);

            if (p != null) {
                treeMapPolicies.remove(new ExpiryKey(p.getExpiryDate(), p.getPolicyNumber()));
            }
        }

        return expiredPolicyNumbers.size();
    }

    // Display Helpers (optional but useful)
    public void displayAllHashMap() {
        System.out.println("\n--- Policies (HashMap - Random Order) ---");
        if (hashMapPolicies.isEmpty()) {
            System.out.println("No policies found.");
            return;
        }
        for (Policy p : hashMapPolicies.values()) {
            System.out.println(p);
        }
    }

    public void displayAllLinkedHashMap() {
        System.out.println("\n--- Policies (LinkedHashMap - Insertion Order) ---");
        if (linkedHashMapPolicies.isEmpty()) {
            System.out.println("No policies found.");
            return;
        }
        for (Policy p : linkedHashMapPolicies.values()) {
            System.out.println(p);
        }
    }

    public void displayAllTreeMap() {
        System.out.println("\n--- Policies (TreeMap - Sorted by Expiry Date) ---");
        if (treeMapPolicies.isEmpty()) {
            System.out.println("No policies found.");
            return;
        }
        for (Map.Entry<ExpiryKey, Policy> entry : treeMapPolicies.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
