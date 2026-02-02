package com.methodreferences.invoiceobjectgeneration;
class Invoice {
    private int transactionId;

    public Invoice(int transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public String toString() {
        return "Invoice for Transaction: " + transactionId;
    }
}
