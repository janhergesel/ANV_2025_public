package com.mycompany.cafeapp;

abstract class PaymentStrategy {
    String pay(int amount, int table){
        return "(table "+table+")";
    };
}
