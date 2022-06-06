package com.olympic.cis143.touche;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class Placement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fencer f1 = new Fencer();
		Fencer f2 = new Fencer();
		Fencer f3 = new Fencer();
		Fencer f4 = new Fencer();
		Fencer f5 = new Fencer();
		Fencer f6 = new Fencer();
		Fencer f7 = new Fencer();
		Fencer f8 = new Fencer();
		
		f1.setVictories(8);
		f2.setVictories(3);
		f3.setVictories(5);
		f4.setVictories(7);
		f5.setVictories(0);
		f6.setVictories(8);
		f7.setVictories(4);
		f8.setVictories(2);
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, f1.getVictories());
		map.put(2, f2.getVictories());
		map.put(3, f3.getVictories());
		map.put(4, f4.getVictories());
		map.put(5, f5.getVictories());
		map.put(6, f6.getVictories());
		map.put(7, f7.getVictories());
		map.put(8, f8.getVictories());
		
		// Using Collections.max() method returning max
        // value in HashMap and storing in a integer
        // variable
        int maxValueInMap = (Collections.max(map.values()));
		
		
		// Iterate through HashMap
        for (Entry <Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxValueInMap) {
                System.out.println(entry.getKey());
            }
        }
		
	}

}
