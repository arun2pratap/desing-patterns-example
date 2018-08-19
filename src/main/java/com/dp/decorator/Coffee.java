package com.dp.decorator;

public class Coffee implements Beverage {

    @Override
    public String description() {
        return "Coffee";
    }

    @Override
    public double price() {
        return 10.0;
    }
}
