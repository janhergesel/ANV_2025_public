package com.mycompany.cafeapp;

public abstract class DrinkTemplate implements PreparableDrink {

    private final String name;

    protected DrinkTemplate(String name) {
        this.name = name;
    }

    @Override
    public final void prepare() {
        System.out.println("[APP] Starting preparation: " + name);
        boilWater();
        brew();
        pour();
        System.out.println("[APP] Done: " + name);
    }

    protected void boilWater() {
        System.out.println("[APP] Boiling water");
    }

    protected abstract void brew();

    protected void pour() {
        System.out.println("[APP] Pouring into cup");
    }
}
