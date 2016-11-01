package com.dp.strategy;

/**
 * Created by Neo on 11/1/2016.
 */
public class PondDuck extends Duck {
    PondDuck(){
        flyBehaviour = new FlyWithWing();
        quack = new LoudQuack();
    }

    void display() {
        System.out.println("Pond duck");
    }
}
