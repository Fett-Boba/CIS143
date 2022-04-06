package com.olympic.cis143.lab1.add;

import java.util.ArrayList;

public class IntArrayAdd {

    private int[] data;
    private ArrayList<Integer> list = new ArrayList<Integer>();
    
    public IntArrayAdd() {
        this.data = new int[0];   // I dont like this
    }

    public int[] getData() {
    	copyListToArray();
        return this.data;
    }

    /**
     * This method will need to add an element to the end of an array.
     *
     * @param value The value to be added.
     */
    public void add(int value) {
    	list.add(value);
    }
    
    private void copyListToArray() {
    	int [] tmpData = new int[list.size()];
    	for (int i = 0; i < list.size(); i++) {
    		tmpData[i] = list.get(i);
    	}
    	data = tmpData;
    }
}
