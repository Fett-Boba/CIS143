package com.olympic.cis143.lab1.add;

import java.util.ArrayList;
import java.util.List;

public class IntArrayAdd {

    private static List<Integer> list = new ArrayList<Integer>();
    
    // Initialize our list each time a new object is created
    public IntArrayAdd() {
    	list.clear();
    }

    // Use an array list which allows us to grow our data dynamically
	public void add(int value) {
    	list.add(value);		
    }
    
	// Return an the array of integers to the user
    public int[] getData() {
    	return populateArray();
    }
    
    // Populate an array from our ArrayList 
    private int[] populateArray() {
    	int [] data = new int[list.size()];
    	for (int i = 0; i < list.size(); i++) {
    		data[i] = list.get(i);
    	}
    	return data;
    }
}
