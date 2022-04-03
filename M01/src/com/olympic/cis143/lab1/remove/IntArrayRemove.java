package com.olympic.cis143.lab1.remove;

import com.olympic.cis143.lab1.contains.IntArrayContains;

public class IntArrayRemove {

    private int[] data;

    public IntArrayRemove(int[] values) {
        if (values == null) {
            throw new RuntimeException("Values passed cannot be null");
        }
        this.data = values;
    }

    public int[] getData() {
        return this.data;
    }

    /**
     * This method will remove the value passed to it. If the value does not exist in the array, nothing is done.s
     *
     * Note that, for this exercise, a value can only exist, at a maximum, one time within an array.
     *
     * @param value The value to remove.
     */
    public void remove(int value) {
       
    	
    	
    	
    }
}
