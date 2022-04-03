package com.olympic.cis143.lab1.contains;

public class IntArrayContainsTest {

    public static void main(String[] args) {
        IntArrayContainsTest intArrayContainsTest = new IntArrayContainsTest();
        intArrayContainsTest.testDoesContain();
        intArrayContainsTest.testDoesNotContain();
    }

    public void testDoesContain() {
        IntArrayContains intArrayContains = new IntArrayContains(new int[] {1, 2, 3});
        if (!intArrayContains.contains(2)) {
            throw new RuntimeException("Should have the element 2 in the array.");
        }
        System.out.println(">> testDoesContain passed");
    }

    public void testDoesNotContain() {
        IntArrayContains intArrayContains = new IntArrayContains(new int[] {1, 2, 3});
        if (intArrayContains.contains(4)) {
            throw new RuntimeException("Should NOT have the element 4 in the array.");
        }
        System.out.println(">> testDoesContain passed");
    }
}
