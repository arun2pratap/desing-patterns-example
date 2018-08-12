package com.dp.strategy2;

public class MallerDuck extends Duck {
    public MallerDuck() {
        super("Maller Duck", new FlyBehaviour1());
    }

    @Override
    public void display() {
        System.out.println(name + " Maller duck");
    }
}
