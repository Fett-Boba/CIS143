package com.boba.practiceproblems;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CwEvenOrOddTest {
    @Test
    public void testEvenOrOdd() {
        //CwEvenOrOdd eoo = new CwEvenOrOdd();
        assertEquals("Even", CwEvenOrOdd.even_or_odd(6));
        assertEquals("Odd", CwEvenOrOdd.even_or_odd(7));   
        assertEquals("Even", CwEvenOrOdd.even_or_odd(0));
        assertEquals("Odd", CwEvenOrOdd.even_or_odd(-1)); 
    }
}
