package com.olympic.cis143.lab1.remove;

import com.olympic.cis143.lab1.equals.IntArrayEquals;

public class IntArrayRemoveTest {

    public static void main(String[] args) {
        IntArrayRemoveTest intArrayRemoveTest = new IntArrayRemoveTest();
        intArrayRemoveTest.testNoValuesRemovedSinceTheyDoNotExist();
        intArrayRemoveTest.testValueRemoved();
    }

    public void testNoValuesRemovedSinceTheyDoNotExist() {
        IntArrayRemove intArrayRemove = new IntArrayRemove(new int[] {1, 2, 3});
        intArrayRemove.remove(4);
        IntArrayEquals intArrayEquals = new IntArrayEquals(new int[] {1, 2 ,3});
        if (!intArrayEquals.equals(intArrayRemove.getData())) {
            throw new RuntimeException("The method removed something");
        }
        System.out.println(">> testNoValuesRemovedSinceTheyDoNotExist passed");
    }

    public void testValueRemoved() {
        IntArrayRemove intArrayRemove = new IntArrayRemove(new int[] {1, 2, 3});
        intArrayRemove.remove(2);
        IntArrayEquals intArrayEquals = new IntArrayEquals(new int[] {1 ,3});
        if (!intArrayEquals.equals(intArrayRemove.getData())) {
            throw new RuntimeException("The method  did not remove the element 2.");
        }
        System.out.println(">> testValueRemoved passed");
    }
}
