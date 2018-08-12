package com.dp.strategy2;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        super("Decoy Duck", new FlyNoWay());
    }

    @Override
    public void display() {
        System.out.println(name + "Decoy Duck");
    }
}
