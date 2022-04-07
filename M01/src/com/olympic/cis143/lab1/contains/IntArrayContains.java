package com.olympic.cis143.lab1.contains;

public class IntArrayContains {

    private int[] data;

    public IntArrayContains(int[] values) {
        if (values == null) {
            throw new RuntimeException("Values passed cannot be null");
        }
        this.data = values;
    }

    // Check if array contains passed value
    public boolean contains(int value) {
    	for (int element : data) {
			if (element == value) {
				return true;
			}
		}
		return false;
    }
}
