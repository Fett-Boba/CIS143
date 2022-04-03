package com.olympic.cis143.lab1.add;

import com.olympic.cis143.lab1.equals.IntArrayEquals;

public class IntArrayAddTest {

    public static void main(String[] args) {
        IntArrayAddTest intArrayAddTest = new IntArrayAddTest();
        intArrayAddTest.testAddOneValue();
        intArrayAddTest.testAddMultiple();
    }

    public void testAddOneValue() {
        IntArrayAdd iadd = new IntArrayAdd();
        iadd.add(1);
        IntArrayEquals intArrayEquals = new IntArrayEquals(new int[] {1});
        if (!intArrayEquals.equals(iadd.getData())) {
            throw new RuntimeException("The add method was implemented incorrectly. Should have 1 element with the value of 1.");
        }
        System.out.println(">> testAddOneValue passed");
    }
    public void testAddMultiple() {
        IntArrayAdd iadd = new IntArrayAdd();
        iadd.add(1);
        iadd.add(2);
        iadd.add(3);
        IntArrayEquals intArrayEquals = new IntArrayEquals(new int[] {1, 2, 3});
        if (!intArrayEquals.equals(iadd.getData())) {
            throw new RuntimeException("The add method was implemented incorrectly. Should have 3 element with the value of 1, 2, and 3.");
        }
        System.out.println(">> testAddMultiple passed");
    }
}
