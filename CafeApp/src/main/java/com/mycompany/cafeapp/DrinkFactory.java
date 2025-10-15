package com.mycompany.cafeapp;

public class DrinkFactory {
    public static Drink createDrink(String type) {
        switch(type) {
            case "coffee": return new Coffee();
            case "tea": return new Tea();
            default: throw new IllegalArgumentException("Unknown drink");
        }
    }
}