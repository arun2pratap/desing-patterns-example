package com.dp.interpreter;

class Product {
	int color, price, size;
	public Product(final int color, final int price, final int size) {
		super();
		this.color = color;
		this.price = price;
		this.size = size;
	}
	@Override public String toString() {
		return String.format("color=%d price=%d size=%d", color,
		        price, size);
	}
}
