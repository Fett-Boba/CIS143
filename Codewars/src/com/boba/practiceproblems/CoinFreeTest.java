package com.boba.practiceproblems;

import static org.junit.Assert.*;

import org.junit.Test;


public class CoinFreeTest {
    private int[] coins1={1,5,10,25};
    private int[] coins2={1,2,5,10,20,50};
      
    @Test
    public void basicTests() {
        assertEquals("75 is 25+25+25",3,CoinFree.solve(75,coins1));
        assertEquals("123 is 25+25+25+25+10+10+1+1",9,CoinFree.solve(123,coins1));
        assertEquals("75 is 50+20+5",3,CoinFree.solve(75,coins2));
        assertEquals("123 is 50+50+20+2+1",5,CoinFree.solve(123,coins2));
       
    }
}