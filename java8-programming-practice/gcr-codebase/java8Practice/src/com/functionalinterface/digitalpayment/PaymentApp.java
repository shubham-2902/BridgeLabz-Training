package com.functionalinterface.digitalpayment;
public class PaymentApp {
    public static void main(String[] args) {
        Payment p = new UPI();
        p.pay(500);

        p = new CreditCard();
        p.pay(1200);
    }
}
