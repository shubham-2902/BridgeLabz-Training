package com.day9.payxpress;
public class WaterBill extends Bill {

    public WaterBill(double amount, String dueDate, boolean recurring) {
        super("Water", amount, dueDate, recurring);
    }

    @Override
    public void pay(int daysLate) {

        if (isPaid()) {
            System.out.println(" Water bill already paid!");
            return;
        }

        double totalPayable = calculateLateFee(daysLate);

        markPaid("Paid via Card (Water)");
        System.out.println(" Water Bill Paid Successfully!");
        System.out.println("Total Paid: Rs " + totalPayable);
    }

    @Override
    public void sendReminder() {
        System.out.println(" Reminder: Water bill due on " + dueDate);
    }
}
