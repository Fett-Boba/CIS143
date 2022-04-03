package com.olympic.cis143.lab1.equals;

public class IntArrayEqualsTest {

    public static void main(String[] args) {
	// write your code here
        IntArrayEqualsTest iatest = new IntArrayEqualsTest();
        iatest.testNullArray();
        iatest.testWrongSizedArray();
        iatest.testWrongElementsInArray();
        iatest.testArraysAreEqual();
    }

    /**
     * This tests that the a null array, passed to the IntArray.equals() method returns false.
     */
    public void testNullArray(){
        IntArrayEquals iarray = new IntArrayEquals(new int[] {1});
        if (iarray.equals(null) ){
            throw new RuntimeException("Should not equal as its null");
        }
        System.out.println(">> testNullArray passed");
    }

    public void testWrongSizedArray () {
        IntArrayEquals iarray = new IntArrayEquals(new int[] {1,2});
        if (iarray.equals(new int[] {1}) ){
            throw new RuntimeException("Should fail as arrays are not the same size.");
        }
        System.out.println(">> testWrongSizedArray passed");
    }

    public void testWrongElementsInArray() {
        IntArrayEquals iarray = new IntArrayEquals(new int[] {1});
        if (iarray.equals(new int[] {2}) ){
            throw new RuntimeException("Should fail as arrays are the same size but have different elements");
        }
        System.out.println(">> testWrongElementsInArray passed");
    }

    public void testArraysAreEqual() {
        IntArrayEquals iarray = new IntArrayEquals(new int[] {1});
        if (!iarray.equals(new int[] {1}) ){
            throw new RuntimeException("Should pass as arrays are equal");
        }
        System.out.println(">> testArraysAreEqual passed");
    }
}
