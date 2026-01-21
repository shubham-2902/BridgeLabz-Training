package com.insurancepolicymgmt.usingmap;
import java.time.LocalDate;

public class ExpiryKey implements Comparable<ExpiryKey> {

    private LocalDate expiryDate;
    private String policyNumber;

    public ExpiryKey(LocalDate expiryDate, String policyNumber) {
        this.expiryDate = expiryDate;
        this.policyNumber = policyNumber;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    @Override
    public int compareTo(ExpiryKey other) {
        int cmp = this.expiryDate.compareTo(other.expiryDate);
        if (cmp == 0) {
            // if same expiry, sort by policy number (ensures uniqueness)
            return this.policyNumber.compareTo(other.policyNumber);
        }
        return cmp;
    }

    @Override
    public String toString() {
        return expiryDate + "-" + policyNumber;
    }
}
