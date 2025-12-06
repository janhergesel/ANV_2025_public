package com.mycompany.cafeapp;

public class Tea extends DrinkTemplate implements Drink {

    public Tea() {
        super("tea");
    }

    @Override
    protected void brew() {
        System.out.println("[APP] Steeping tea leaves");
    }

    @Override
    public String serve() {
        return "Ordered Tea";
    }
}
