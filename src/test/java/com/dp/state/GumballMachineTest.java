package com.dp.state;

import org.junit.Test;

import static org.junit.Assert.*;

public class GumballMachineTest {
    @Test
    public void name() {
        GumballMachine g = new GumballMachine(2);
        g.coinInstered();
        g.leverTurned();
        g.coinInstered();
        g.leverTurned();
        g.coinInstered();
        g.leverTurned();
        assertEquals("","");
    }
}