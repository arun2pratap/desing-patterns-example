package com.dp.decorator;

public class BeverageApp {
    public static void main(String[] args) {
        Beverage coffee;
        coffee = new Milk(new Cream(new Coffee()));
        System.out.println( "Description : " + coffee.description());
        System.out.println( "Total Price : " + coffee.price());
    }
}
