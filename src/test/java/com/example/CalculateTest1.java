package com.example;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

public class CalculateTest1 {

    private Calculate calculate;
    @Before
    public void setUp() throws Exception {
        calculate = new Calculate();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void divide() {
        int result = calculate.divide(4,2);
        assertEquals("期待输出：",1,result,0);
    }
}
