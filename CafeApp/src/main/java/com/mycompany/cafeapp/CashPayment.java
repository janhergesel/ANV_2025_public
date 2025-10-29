package com.mycompany.cafeapp;

class CashPayment extends PaymentStrategy {
    public String pay(int amount, int table) {
        return "Customer want to pay " + amount + " in cash "+super.pay(amount, table);
    }
}
