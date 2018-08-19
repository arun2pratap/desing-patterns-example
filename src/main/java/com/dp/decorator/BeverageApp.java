package com.dp.decorator;

public class BeverageApp {
    public static void main(String[] args) {
        Beverage coffee = new Coffee();
        coffee = new Milk(coffee);
        coffee = new Cream(coffee);
        System.out.println( "Description : " + coffee.description());
        System.out.println( "Total Price : " + coffee.price());
    }
}
