package com.mycompany.cafeapp;

public class PaymentCommand implements Command {

    private final OrderSubject paymentSubject;
    private final Checkout checkout;
    private final int amount;
    private final int tableNumber;

    public PaymentCommand(OrderSubject paymentSubject,
                          Checkout checkout,
                          int amount,
                          int tableNumber) {
        this.paymentSubject = paymentSubject;
        this.checkout = checkout;
        this.amount = amount;
        this.tableNumber = tableNumber;
    }

    @Override
    public void execute() {
        // „Receiver“ je Checkout – provede platbu a vrátí text
        String message = checkout.processPayment(amount, tableNumber);
        paymentSubject.notifyAll(message);
    }
}
