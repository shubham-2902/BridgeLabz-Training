package com.day9.payxpress;
public class ElectricityBill extends Bill {

    public ElectricityBill(double amount, String dueDate, boolean recurring) {

        super("Electricity", amount, dueDate, recurring);
    }

    @Override
    public void pay(int daysLate) {


        if (isPaid()) {
            System.out.println("Electricity bill already paid!");
            return;
        }

        double totalPayable = calculateLateFee(daysLate);

        markPaid("Paid via UPI (Electricity)");
        System.out.println(" Electricity Bill Paid Successfully!");
        System.out.println("Total Paid: Rs " + totalPayable);
    }

    @Override
    public void sendReminder() {

    	
        System.out.println(" Reminder: Electricity bill due on " + dueDate);
    }
}
