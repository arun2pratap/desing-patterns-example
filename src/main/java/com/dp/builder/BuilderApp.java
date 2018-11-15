package com.dp.builder;

public class BuilderApp {
	public static void main(String[] args) {
		Dummy dummy = new DemoBuilder().setA(10).setB(22).setC(30).giveInstance();
		System.out.println("dummy = " + dummy);
	}
}
