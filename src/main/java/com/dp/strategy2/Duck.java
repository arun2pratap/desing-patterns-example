package com.dp.strategy2;

public abstract class Duck {

    public final String name ;

    private final Fly1 fly1;

    public Duck(String name, Fly1 fly1) {
        this.name = name;
        this.fly1 = fly1;
    }

    public abstract void display();

    public void swim(){
        System.out.println(name + " : can swim");
    }

    public void fly(){
        fly1.fly();
    }

}
