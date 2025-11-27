package com.mycompany.cafeapp;

public class CafeApp {

    public static void main(String[] args) {
        EmployeeObserver waiter = new EmployeeObserver("Waiter");
        EmployeeObserver barista = new EmployeeObserver("Barista");

        OrderSubject order = new OrderSubject();
        order.addObserver(barista);

        OrderSubject payment = new OrderSubject();
        payment.addObserver(waiter);

        CustomDrink coffee = new CustomDrink.Builder("coffee")
                .milk()
                .sugar()
                .build();
        coffee = new OwnMugDecorator(new ToGoDecorator(coffee));

        CustomDrink tea = new CustomDrink.Builder("tea")
                .sugar()
                .build();
        tea = new OwnMugDecorator(tea);

        String cafeName = CafeConfig.getInstance().getCafeName();

        Command coffeeOrder = new OrderCommand(
                order,
                coffee + " in " + cafeName
        );

        Command teaOrder = new OrderCommand(
                order,
                tea + " in " + cafeName
        );

        coffeeOrder.execute();
        teaOrder.execute();

        Checkout checkout = new Checkout(new CreditCardPayment());

        Command payByCard = new PaymentCommand(
                payment,
                checkout,
                150,
                4
        );

        checkout.setStrategy(new CashPayment());

        Command payByCash = new PaymentCommand(
                payment,
                checkout,
                100,
                2
        );

        payByCard.execute();
        payByCash.execute();
    }
}
