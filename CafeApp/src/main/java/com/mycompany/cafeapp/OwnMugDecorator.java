package com.mycompany.cafeapp;

public class OwnMugDecorator extends CustomDrinkDecorator {
    public OwnMugDecorator(CustomDrink customDrink) { super(customDrink); }
    @Override public String toString() {
        return super.toString() + " [own mug]";
    }
}