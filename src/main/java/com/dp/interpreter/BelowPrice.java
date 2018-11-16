package com.dp.interpreter;

class BelowPrice implements Spec {
	int price;
	public BelowPrice(final int price) {
		this.price = price;
	}
	@Override public boolean isSatisfiedBy(final Product p) {
		return p.price < price;
	}
}
