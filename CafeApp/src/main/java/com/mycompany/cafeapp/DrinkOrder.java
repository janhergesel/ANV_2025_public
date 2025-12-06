package com.mycompany.cafeapp;

import java.util.ArrayList;
import java.util.List;

// COMPOSITE – objednávka z mobilní aplikace, kterou lze sledovat krok po kroku
public class DrinkOrder implements PreparableDrink {

    private final List<PreparableDrink> items = new ArrayList<>();

    public void add(PreparableDrink drink) {
        items.add(drink);
    }

    public void remove(PreparableDrink drink) {
        items.remove(drink);
    }

    public int getCount() {
        return items.size();
    }

    @Override
    public void prepare() {
        System.out.println("[APP] New mobile order, items: " + items.size());
        for (PreparableDrink d : items) {
            d.prepare();
        }
        System.out.println("[APP] Mobile order ready.");
    }
}
