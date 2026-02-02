package com.functionalinterface.paymentgatewayintegration;
class UPIProcessor implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("UPI payment of ₹" + amount + " successful");
    }
}
