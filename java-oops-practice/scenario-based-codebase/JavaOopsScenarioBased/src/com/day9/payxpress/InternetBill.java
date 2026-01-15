package com.day9.payxpress;
public class InternetBill extends Bill {

    public InternetBill(double amount, String dueDate, boolean recurring) {
        super("Internet", amount, dueDate, recurring);
    }

    @Override
    public void pay(int daysLate) {

        if (isPaid()) {
            System.out.println(" Internet bill already paid!");
            return;
        }

        double totalPayable = calculateLateFee(daysLate);

        markPaid("Paid via NetBanking (Internet)");
        System.out.println("Internet Bill Paid Successfully!");
        System.out.println("Total Paid: Rs " + totalPayable);
    }

    @Override
    public void sendReminder() {
        System.out.println("Reminder: Internet bill due on " + dueDate);
    }
}
