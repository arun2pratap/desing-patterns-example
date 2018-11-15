package com.dp.state;

public class GumBallMachineApp {
	public static void main(final String[] args) {
		GumballMachine g = new GumballMachine(2);
		g.coinInstered();
		g.leverTurned();
		g.coinInstered();
		g.leverTurned();
		g.coinInstered();
		g.leverTurned();
	}
}
