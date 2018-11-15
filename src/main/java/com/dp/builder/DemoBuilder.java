package com.dp.builder;

class DemoBuilder {
	boolean ag, bg, cg;
	int a, b, c;
	DemoBuilder setA(final int a) {
		this.a = a;
		ag = true;
		return this;
	}
	DemoBuilder setB(final int b) {
		this.b = b;
		bg = true;
		return this;
	}
	DemoBuilder setC(final int c) {
		this.c = c;
		cg = true;
		return this;
	}
	Dummy giveInstance() {
		if (!ag)
			a = 5;
		if (!bg)
			b = 6;
		if (!cg)
			c = 50;
		return new Dummy(a, b, c);
	}
}
