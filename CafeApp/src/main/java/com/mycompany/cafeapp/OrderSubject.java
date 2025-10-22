package com.mycompany.cafeapp;

import java.util.ArrayList;

class OrderSubject {
    private ArrayList<Observer> observers = new ArrayList<>();
    public void addObserver(Observer o) { observers.add(o); }
    public void notifyAll(String status) {
        for (Observer o : observers) o.update(status);
    }
}
