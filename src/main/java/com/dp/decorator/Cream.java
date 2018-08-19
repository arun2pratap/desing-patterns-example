package com.dp.decorator;

public class Cream implements Beverage {
    private Beverage beverage;

    public Cream(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String description() {
        return beverage.description() + " + CREAM";
    }

    @Override
    public double price() {
        return 3.0 + beverage.price();
    }
}
