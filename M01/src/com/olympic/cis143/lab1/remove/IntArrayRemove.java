package com.olympic.cis143.lab1.remove;

import java.util.ArrayList;
import java.util.List;

public class IntArrayRemove {
	
    private List<Integer> list = new ArrayList<>();
    private int[] data;
    
    // Initialize our array, and clear our ArrayList
    public IntArrayRemove(int[] values) {
        if (values == null) {
            throw new RuntimeException("Values passed cannot be null");
        }
        this.list.clear();
        this.data = values;
    }      

    public int [] getData() {
    	return populateArray();
    }

    // Check array to see if it contains the value passed
    public void remove(int value) {
    	for (Integer element : data) {
    		if (element != value) {
   			 	list.add(element);
   		 	}
		}
    }
    
    // Populate the return array from our ArrayList 
    private int[] populateArray() {
    	int [] newData = new int[list.size()];
    	for (int i = 0; i < list.size(); i++) {
			newData[i] = list.get(i);
		}
    	return newData;
    }
    
}
