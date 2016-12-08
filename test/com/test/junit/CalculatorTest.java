package com.test.junit;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: Devin     Date: 2016/12/8 17:15
 * More wonderful content please pay attention to -> http://zhangchuzhao.site
 */

public class CalculatorTest {
    Calculator calculator;
    @org.junit.Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        calculator = null;
    }

    @org.junit.Test
    public void add() throws Exception {
        assertThat(calculator.add(1,2), is(3));
    }

    @org.junit.Test
    public void subtact() throws Exception {
        assertThat(calculator.subtact(3, 1), is(2));
    }

    @org.junit.Test
    public void multiply() throws Exception {
        assertThat(calculator.multiply(2, 3), is(5));
    }

    @org.junit.Test//(expected = RuntimeException.class)
    public void divide() throws Exception {
        calculator.divide(3, 0);
    }
}