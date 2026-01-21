package com.insurancepolicymgmt.usingset;
import java.time.LocalDate;

public class Policy implements Comparable<Policy> {

    private String policyNumber;       // Unique identifier (business key)
    private String policyHolderName;
    private LocalDate expiryDate;
    private String coverageType;       // Health, Auto, Home etc.
    private double premiumAmount;

    public Policy(String policyNumber, String policyHolderName, LocalDate expiryDate,
                  String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyHolderName = policyHolderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public String getPolicyHolderName() {
        return policyHolderName;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public String getCoverageType() {
        return coverageType;
    }

    public double getPremiumAmount() {
        return premiumAmount;
    }

    public void setPolicyHolderName(String policyHolderName) {
        this.policyHolderName = policyHolderName;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public void setCoverageType(String coverageType) {
        this.coverageType = coverageType;
    }

    public void setPremiumAmount(double premiumAmount) {
        this.premiumAmount = premiumAmount;
    }

    /**
     * HashSet / LinkedHashSet uniqueness depends on equals() + hashCode()
     * Here we define uniqueness by policyNumber
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Policy)) return false;
        Policy other = (Policy) obj;
        return this.policyNumber.equals(other.policyNumber);
    }

    @Override
    public int hashCode() {
        return policyNumber.hashCode();
    }

    /**
     * TreeSet sorting logic - primary sort by expiryDate
     * if same expiry date then compare by policyNumber to avoid duplicates loss
     */
    @Override
    public int compareTo(Policy other) {
        int cmp = this.expiryDate.compareTo(other.expiryDate);
        if (cmp == 0) {
            return this.policyNumber.compareTo(other.policyNumber);
        }
        return cmp;
    }

    @Override
    public String toString() {
        return "Policy{" +
                "policyNumber='" + policyNumber + '\'' +
                ", holder='" + policyHolderName + '\'' +
                ", expiryDate=" + expiryDate +
                ", coverageType='" + coverageType + '\'' +
                ", premium=" + premiumAmount +
                '}';
    }
}
