package com.mycompany.cafeapp;

public abstract class CustomDrinkDecorator extends CustomDrink {
    protected final CustomDrink customDrink;

    protected CustomDrinkDecorator(CustomDrink customDrink) {
        super();
        this.customDrink = customDrink;
    }

    @Override
    public String toString() {
        return customDrink.toString();
    }
}