/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cafeapp;

public class CafeApp {

    public static void main(String[] args) {
        OrderSubject order = new OrderSubject();

        order.addObserver(new EmployeeObserver("Barista"));
        order.addObserver(new EmployeeObserver("Waiter"));

        CustomDrink customDrink = new CustomDrink.Builder("coffee").milk().sugar().build();
        String msg = customDrink +" in "+CafeConfig.getInstance().getCafeName();

        order.notifyAll(msg);
    }
}
