package com.day5.loadbuddy;
public abstract class LoanApplication implements IApprovable {

    protected Applicant applicant;
    protected int tenureMonths;
    protected double interestRate;

    private boolean approved;   // internal state

    public LoanApplication(Applicant applicant,
                           int tenureMonths,
                           double interestRate) {
        this.applicant = applicant;
        this.tenureMonths = tenureMonths;
        this.interestRate = interestRate;
    }

    protected void setApproved(boolean status) {
        this.approved = status;
    }

    public boolean isApproved() {
        return approved;
    }

    // EMI Formula
    protected double calculateBaseEMI() {
        double P = applicant.getLoanAmount();
        double R = interestRate / (12 * 100); // monthly rate
        int N = tenureMonths;

        return (P * R * Math.pow(1 + R, N))
                / (Math.pow(1 + R, N) - 1);
    }
}
