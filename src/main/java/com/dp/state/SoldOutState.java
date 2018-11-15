package com.dp.state;

class SoldOutState extends State {
	SoldOutState(final GumballMachine g) {
		super(g);
	}
	@Override State coinInserted() {
		System.out.println("Coin refund");
		return this;
	}
}
