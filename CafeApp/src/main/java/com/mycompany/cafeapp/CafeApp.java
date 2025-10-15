/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cafeapp;

/**
 *
 * @author konev
 */
public class CafeApp {

    public static void main(String[] args) {
        CustomDrink customDrink = new CustomDrink.Builder("coffee").milk().sugar().build();
        System.out.println(customDrink +" in "+CafeConfig.getInstance().getCafeName());
    }
}
