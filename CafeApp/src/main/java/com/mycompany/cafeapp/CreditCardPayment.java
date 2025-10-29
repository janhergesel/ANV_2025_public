package com.mycompany.cafeapp;

class CreditCardPayment extends PaymentStrategy {
    public String pay(int amount, int table) {
        return "Customer want to pay " + amount + " using Credit Card " +super.pay(amount, table);
    }
}