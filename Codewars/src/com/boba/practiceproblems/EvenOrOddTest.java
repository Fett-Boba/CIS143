package com.boba.practiceproblems;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EvenOrOddTest {
    @Test
    public void testEvenOrOdd() {
        //CwEvenOrOdd eoo = new CwEvenOrOdd();
        assertEquals("Even", EvenOrOdd.even_or_odd(6));
        assertEquals("Odd", EvenOrOdd.even_or_odd(7));   
        assertEquals("Even", EvenOrOdd.even_or_odd(0));
        assertEquals("Odd", EvenOrOdd.even_or_odd(-1)); 
    }
}
