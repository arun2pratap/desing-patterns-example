package com.dp.strategy2;

public class FlyNoWay implements Fly1 {
    @Override
    public void fly() {
        System.out.println("I am not flying");
    }
}
