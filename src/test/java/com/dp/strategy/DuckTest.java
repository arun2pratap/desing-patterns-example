package com.dp.strategy;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by Neo on 10/19/2016.
 */
public class DuckTest {

    @Test
    public void testFly(){
        Duck duck = new PondDuck();
        duck.quack();
        duck.fly();
        duck.setQuack(new NoQuack());
        duck.quack();
        Assert.assertEquals("","");
    }
}
