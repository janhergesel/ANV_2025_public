package com.mycompany.cafeapp;

public class Coffee extends DrinkTemplate implements Drink {

    public Coffee() {
        super("coffee");
    }

    @Override
    protected void brew() {
        System.out.println("[APP] Brewing coffee grounds");
    }

    @Override
    public String serve() {
        return "Coffee";
    }
}
