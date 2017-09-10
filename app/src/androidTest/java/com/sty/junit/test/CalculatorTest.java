package com.sty.junit.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/9/5/0005.
 */
public class CalculatorTest {
    private Calculator mCalculator;

    @Before
    public void setUp() throws Exception {
        mCalculator = new Calculator();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void sum() throws Exception {
        assertEquals(7, mCalculator.sum(3, 4));
    }

    @Test
    public void sum2() throws Exception{
        assertEquals(6, mCalculator.sum(3, 4));
    }

}