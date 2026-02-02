package com.functionalinterface.paymentgatewayintegration;
public class PaymentApp {
    public static void main(String[] args) {
        PaymentProcessor p = new UPIProcessor();
        p.processPayment(1000);
        p.refund(500);   // Uses default method
    }
}
