package com.dp.interpreter;

class ColorSpec implements Spec {
	int color;
	public ColorSpec(final int color) {
		this.color = color;
	}
	@Override public boolean isSatisfiedBy(final Product p) {
		return p.color == color;
	}
}
