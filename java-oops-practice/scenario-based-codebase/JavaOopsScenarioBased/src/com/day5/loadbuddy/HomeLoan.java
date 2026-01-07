package com.day5.loadbuddy;
public class HomeLoan extends LoanApplication {

    public HomeLoan(Applicant applicant, int tenureMonths) {
        super(applicant, tenureMonths, 8.5); // lower interest
    }

    @Override
    public boolean approveLoan() {

        if (applicant.getCreditScore() >= 700 &&
            applicant.getIncome() >= 30000) {
            setApproved(true);
        } else {
            setApproved(false);
        }
        return isApproved();
    }

    @Override
    public double calculateEMI() {
        return calculateBaseEMI();
    }
}
