package com.izavasconcelos.cloud.poc;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PocTest {
    private int x;
    private int y;
    private String hello;

    @Before
    public void inputTest(){
        x = 1;
        y = 2;
        hello = "Hello World!";
    }
    @Test
    public void sumTest() {
        int sum = x + y;
        assertTrue(sum == 3);
    }

    @Test
    public void helloTest() {
        assertEquals("Hello World!", hello);
    }

}
