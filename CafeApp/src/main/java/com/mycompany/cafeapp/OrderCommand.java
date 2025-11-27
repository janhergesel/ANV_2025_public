package com.mycompany.cafeapp;

public class OrderCommand implements Command {

    private final OrderSubject orderSubject;
    private final String orderText;

    public OrderCommand(OrderSubject orderSubject, String orderText) {
        this.orderSubject = orderSubject;
        this.orderText = orderText;
    }

    @Override
    public void execute() {
        // „Receiver“ je OrderSubject – ten už zná observéry a umí rozeslat zprávu
        orderSubject.notifyAll(orderText);
    }
}
