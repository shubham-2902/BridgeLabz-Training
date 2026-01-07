package com.day5.loadbuddy;
public class AutoLoan extends LoanApplication {

    public AutoLoan(Applicant applicant, int tenureMonths) {
        super(applicant, tenureMonths, 10.0);
    }

    @Override
    public boolean approveLoan() {

        if (applicant.getCreditScore() >= 650 &&
            applicant.getIncome() >= 20000) {
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
