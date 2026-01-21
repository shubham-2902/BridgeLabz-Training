package com.insurancepolicymgmt.usingset;
import java.time.LocalDate;
import java.util.*;

public class PolicyManager {

    private Set<Policy> hashSetPolicies;
    private Set<Policy> linkedHashSetPolicies;
    private Set<Policy> treeSetPolicies;

    // Stores ALL policies entered including duplicates (to detect duplicates)
    private List<Policy> allInsertedPolicies;

    public PolicyManager() {
        hashSetPolicies = new HashSet<>();
        linkedHashSetPolicies = new LinkedHashSet<>();
        treeSetPolicies = new TreeSet<>();
        allInsertedPolicies = new ArrayList<>();
    }

    // Add Policy into all sets
    public void addPolicy(Policy policy) {
        allInsertedPolicies.add(policy);

        hashSetPolicies.add(policy);
        linkedHashSetPolicies.add(policy);
        treeSetPolicies.add(policy);
    }

    // Remove by policy number
    public boolean removePolicy(String policyNumber) {
        Policy dummy = new Policy(policyNumber, "", LocalDate.now(), "", 0);

        boolean removedHash = hashSetPolicies.remove(dummy);
        boolean removedLinked = linkedHashSetPolicies.remove(dummy);

        // TreeSet doesn't use hashCode/equals for searching, so remove manually
        boolean removedTree = false;
        Iterator<Policy> it = treeSetPolicies.iterator();
        while (it.hasNext()) {
            Policy p = it.next();
            if (p.getPolicyNumber().equals(policyNumber)) {
                it.remove();
                removedTree = true;
                break;
            }
        }
        return removedHash || removedLinked || removedTree;
    }

    // Search by policy number (fast in HashSet if you create dummy)
    public boolean containsPolicy(String policyNumber) {
        Policy dummy = new Policy(policyNumber, "", LocalDate.now(), "", 0);
        return hashSetPolicies.contains(dummy);
    }

    // 2) Retrieve and display
    public void displayAllUniquePolicies() {
        System.out.println("\n--- Unique Policies (HashSet) ---");
        for (Policy p : hashSetPolicies) {
            System.out.println(p);
        }
    }

    public void displayPoliciesInsertionOrder() {
        System.out.println("\n--- Unique Policies (LinkedHashSet: insertion order) ---");
        for (Policy p : linkedHashSetPolicies) {
            System.out.println(p);
        }
    }

    public void displayPoliciesSortedByExpiry() {
        System.out.println("\n--- Unique Policies (TreeSet: sorted by expiry date) ---");
        for (Policy p : treeSetPolicies) {
            System.out.println(p);
        }
    }

    // Policies expiring in next 30 days
    public void displayPoliciesExpiringSoon(int days) {
        System.out.println("\n--- Policies Expiring Within Next " + days + " Days ---");

        LocalDate now = LocalDate.now();
        LocalDate end = now.plusDays(days);

        boolean found = false;
        for (Policy p : treeSetPolicies) {
            LocalDate expiry = p.getExpiryDate();
            if ((expiry.isEqual(now) || expiry.isAfter(now)) && (expiry.isBefore(end) || expiry.isEqual(end))) {
                System.out.println(p);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No policies expiring within " + days + " days.");
        }
    }

    // Policies by coverage type
    public void displayPoliciesByCoverageType(String type) {
        System.out.println("\n--- Policies with Coverage Type: " + type + " ---");
        boolean found = false;

        for (Policy p : hashSetPolicies) {
            if (p.getCoverageType().equalsIgnoreCase(type)) {
                System.out.println(p);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No policies found for coverage type: " + type);
        }
    }

    // Duplicate policies based on policy number (entered multiple times)
    public void displayDuplicatePolicyNumbers() {
        System.out.println("\n--- Duplicate Policy Numbers ---");

        Map<String, Integer> countMap = new HashMap<>();
        for (Policy p : allInsertedPolicies) {
            countMap.put(p.getPolicyNumber(), countMap.getOrDefault(p.getPolicyNumber(), 0) + 1);
        }

        boolean found = false;
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("PolicyNumber: " + entry.getKey() + " repeated " + entry.getValue() + " times");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No duplicates found.");
        }
    }

    // 3) Performance Comparison
    public void comparePerformance(List<Policy> policiesToAdd, String policyToSearch, String policyToRemove) {
        System.out.println("\n================ PERFORMANCE COMPARISON ================");

        // HashSet performance
        performSetTest("HashSet", new HashSet<>(), policiesToAdd, policyToSearch, policyToRemove);

        // LinkedHashSet performance
        performSetTest("LinkedHashSet", new LinkedHashSet<>(), policiesToAdd, policyToSearch, policyToRemove);

        // TreeSet performance
        performSetTest("TreeSet", new TreeSet<>(), policiesToAdd, policyToSearch, policyToRemove);
    }

    private void performSetTest(String setName, Set<Policy> set, List<Policy> policiesToAdd,
                                String searchPolicyNumber, String removePolicyNumber) {

        long start, end;

        // ADD
        start = System.nanoTime();
        for (Policy p : policiesToAdd) {
            set.add(p);
        }
        end = System.nanoTime();
        long addTime = end - start;

        // SEARCH
        Policy dummySearch = new Policy(searchPolicyNumber, "", LocalDate.now(), "", 0);
        start = System.nanoTime();
        boolean exists = set.contains(dummySearch);
        end = System.nanoTime();
        long searchTime = end - start;

        // REMOVE
        Policy dummyRemove = new Policy(removePolicyNumber, "", LocalDate.now(), "", 0);
        start = System.nanoTime();
        set.remove(dummyRemove);
        end = System.nanoTime();
        long removeTime = end - start;

        System.out.println("\n--- " + setName + " ---");
        System.out.println("Add Time    : " + addTime + " ns");
        System.out.println("Search Time : " + searchTime + " ns (found=" + exists + ")");
        System.out.println("Remove Time : " + removeTime + " ns");
    }
}
