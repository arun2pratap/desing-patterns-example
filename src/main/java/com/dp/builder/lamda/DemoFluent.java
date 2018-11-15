package com.dp.builder.lamda;

class DemoFluent {
	int a, b, c;
	public DemoFluent(final int a, final int b, final int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public String toString() {
		return "DemoFluent{" +
				"a=" + a +
				", b=" + b +
				", c=" + c +
				'}';
	}
}
