package com.boba.practiceproblems;

import java.util.ArrayList;
import java.util.List;

public class PiMaxAndRemoveEvens {

	public static void main(String[] args) {
		
		// Practice-It max
		int [] myArr = {12, 7, -1, 25, 3, 9};
		int maxVal = max(myArr);
		System.out.println(maxVal);
		
		// Practice-It removeEvenLength.  Write a method removeEvenLength that takes an 
		// ArrayList of Strings as a parameter and that removes all of the strings of even 
		// length from the list.
		
		List<String> list = new ArrayList<>();
		list.add("Did");
		list.add("you");
		list.add("solve");
		list.add("it");
		list.add("or");
		list.add("what?");
		System.out.println(removeEvenLength(list));
		
		
	}
	
	public static int max(int [] arr) {
		int maxVal = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > maxVal) {
				maxVal = arr[i];
			}
		}
		return maxVal;
	}
	
	public static List<String> removeEvenLength(List<String> lst) {
		//for (int i = 0; i < lst.size(); i++) {
		  for (int i = lst.size() - 1; i >= 0; i--) {
			if (lst.get(i).length() % 2 == 0 ) {
				lst.remove(i);
			}
		}
		return lst;
	}
	
}
