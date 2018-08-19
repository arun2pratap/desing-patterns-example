package com.dp.decorator;

public class Milk implements Beverage {
    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String description() {
        return beverage.description() + " + Milk";
    }

    @Override
    public double price() {
        return 5.0 + beverage.price();
    }
}
