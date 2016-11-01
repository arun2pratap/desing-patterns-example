package com.dp.strategy;

/**
 * Created by Neo on 11/1/2016.
 */
public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quack;


    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuack(QuackBehaviour quack) {
        this.quack = quack;
    }

    void fly(){
        flyBehaviour.fly();
    }

    void quack(){
        quack.quack();
    }

    abstract void display();
}
