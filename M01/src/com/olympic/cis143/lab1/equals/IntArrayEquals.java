package com.olympic.cis143.lab1.equals;

public class IntArrayEquals {

    private int[] data;

    public IntArrayEquals(int[] values) {
    	if (values == null) {
            throw new RuntimeException("Values passed cannot be null");
        }
        this.data = values;
    }

    // Compare two arrays
    public boolean equals(int[] compareMe) {
       
    	if (compareMe == null) {
    		return false;
    	} 
    	if (compareMe.length != data.length) {
    		return false;
    	} 
    	// now that we know the arrays are equal lengths, we can check for equality
    	for (int i = 0; i < compareMe.length; i++) {
    		if (compareMe[i] != data[i]) {
    			return false;
    		}
    	}
    	return true;
    }
}
