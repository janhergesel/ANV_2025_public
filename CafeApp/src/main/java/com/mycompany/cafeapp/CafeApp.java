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
        System.out.println(DrinkFactory.createDrink("tea").serve() +" in "+CafeConfig.getInstance().getCafeName());
    }
}
