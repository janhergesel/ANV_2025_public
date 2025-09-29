/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cafeapp;

/**
 *
 * @author jan.hergesel@tul.cz
 */
public class CafeConfig {
    private static CafeConfig instance;
    private final String cafeName = "Smart Café";
    private CafeConfig() {}
    public static CafeConfig getInstance() {
        if (instance == null) instance = new CafeConfig();
        return instance;
    }
    public String getCafeName() { return cafeName; }
}
