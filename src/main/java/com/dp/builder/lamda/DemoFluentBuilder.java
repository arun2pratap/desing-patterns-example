package com.dp.builder.lamda;

import java.util.function.Consumer;

class DemoFluentBuilder {
	boolean ag, bg, cg, dg, eg;
	int a, b, c, d, e;
	DemoFluentBuilder setA(final int a) {
		this.a = a;
		ag = true;
		return this;
	}
	DemoFluentBuilder setB(final int b) {
		this.b = b;
		bg = true;
		return this;
	}
	DemoFluentBuilder setC(final int c) {
		this.c = c;
		cg = true;
		return this;
	}
	static DemoFluent create(Consumer<DemoFluentBuilder> block) {
	  DemoFluentBuilder o = new DemoFluentBuilder();
	  block.accept(o);
		if (!o.ag)
			o.a = 5;
		if (!o.bg)
			o.b = 6;
		if (!o.cg)
			o.c = 50;
		return new DemoFluent(o.a, o.b, o.c);
	}
}
