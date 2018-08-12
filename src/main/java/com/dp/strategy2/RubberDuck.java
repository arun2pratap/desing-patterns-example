package com.dp.strategy2;

public class RubberDuck extends Duck {

    public RubberDuck() {
        super("Rubber Duck", new FlyNoWay());
    }

    @Override
    public void display() {
        System.out.println(name + "Rubber duck");
    }
}
