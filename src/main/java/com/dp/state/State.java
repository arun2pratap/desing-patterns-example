package com.dp.state;

abstract class State {
	protected GumballMachine g;
	State(final GumballMachine g) {
		this.g = g;
	}
	State coinInserted() {
		return this;
	}
	State leverTurned() {
		return this;
	}
	State ejectPressed() {
		return this;
	}
	boolean hasGumballs() {
		return g.hasGumballs();
	}
}
