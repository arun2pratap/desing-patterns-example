package com.dp.state;

class GumballMachine {
	private int gumballs;
	State s = new NoQuaterState(this);
	GumballMachine(final int gumballs) {
		this.gumballs = gumballs;
	}
	void coinInstered() {
		s = s.coinInserted();
	}
	void leverTurned() {
		s = s.leverTurned();
	}
	void ejectPressed() {
		s = s.ejectPressed();
	}
	boolean hasGumballs() {
		gumballs--;
		return gumballs > 0;
	}
}
