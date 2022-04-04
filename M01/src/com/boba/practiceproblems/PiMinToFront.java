package com.boba.practiceproblems;
import java.util.ArrayList;


/* Write a method minToFront that takes an ArrayList of ints as a parameter and 
   that moves the minimum value in the list to the front, otherwise preserving 
   the order of the elements. 

   For example, if a variable called list stores the following values: 
   {3, 8, 92, 4, 2, 17, 9} and you make this call: minToFront(list); 
   it should store the following values after the call: {2, 3, 8, 92, 4, 17, 9}. 
   You may assume that the list stores at least one value. */


public class PiMinToFront {

	public static void main (String [] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
//		list.add(3);
//		list.add(8);
//		list.add(92);
//		list.add(4);
//		list.add(2);
//		list.add(17);
//		list.add(9);
		
		list.add(6);
		list.add(1);
		list.add(4);
		list.add(-2);
		
		System.out.println(minToFront(list));
	}

	private static ArrayList<Integer> minToFront(ArrayList<Integer> lst) {
		int min = lst.get(0);
		int indexOfMin = 0;
		for (int i = 1; i < lst.size(); i++) {
			if (lst.get(i) < min) {
				min = lst.get(i);
				indexOfMin = i;
			}
		}
		lst.add(0, min);
		lst.remove(indexOfMin + 1);
		return lst;
	}
}
