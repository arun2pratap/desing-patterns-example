package com.dp.decorator.lamda;

public class BeverApp {
    public static void main(String[] args) {
        Bever coffe = () ->{
            System.out.println("Coffe ");return 10;};
        Bever milk = () -> {
            System.out.println("milk "); return 3 + coffe.price();};
        Bever cream = () -> {
            System.out.println("cream "); return 5 + milk.price();};

        System.out.println(cream.price());
    }
}
