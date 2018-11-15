package com.dp.state;

class NoQuaterState extends State {
	NoQuaterState(final GumballMachine g) {
		super(g);
	}
	@Override State coinInserted() {
		return new HasQuaterState(g);
	}
}
