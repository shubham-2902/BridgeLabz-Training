package com.day5.loadbuddy;
public class PersonalLoan extends LoanApplication {

    public PersonalLoan(Applicant applicant, int tenureMonths) {
        super(applicant, tenureMonths, 14.0); // higher risk
    }

    @Override
    public boolean approveLoan() {

        if (applicant.getCreditScore() >= 750 &&
            applicant.getIncome() >= 40000) {
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
