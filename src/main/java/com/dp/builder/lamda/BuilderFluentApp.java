package com.dp.builder.lamda;

import java.util.function.Consumer;

public class BuilderFluentApp {
	public static void main(String[] args) {
		DemoFluent demoFluent = DemoFluentBuilder.create(c -> c.setA(20).setB(2).setC(50));
		System.out.println("demoFluent = " + demoFluent);
	}
}
