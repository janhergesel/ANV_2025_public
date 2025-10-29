/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cafeapp;

public class CafeApp {

    public static void main(String[] args) {
        OrderSubject order = new OrderSubject();

        EmployeeObserver waiter = new EmployeeObserver("Waiter");
        EmployeeObserver barista = new EmployeeObserver("Barista");

        order.addObserver(barista);
        order.addObserver(waiter);

        CustomDrink customDrink = new CustomDrink.Builder("coffee").milk().sugar().build();
        order.notifyAll(customDrink +" in "+CafeConfig.getInstance().getCafeName());

        OrderSubject payment = new OrderSubject();
        payment.addObserver(waiter);

        Checkout checkout = new Checkout(new CreditCardPayment());
        payment.notifyAll(checkout.processPayment(150, 4));
        checkout.setStrategy(new CashPayment());
        payment.notifyAll(checkout.processPayment(100, 2));

    }
}
