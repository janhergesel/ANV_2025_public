package com.mycompany.cafeapp;

class EmployeeObserver implements Observer {
    private String name;
    public EmployeeObserver(String name) { this.name = name; }
    public void update(String status) {
        System.out.println(name + " notified: " + status);
    }
}
