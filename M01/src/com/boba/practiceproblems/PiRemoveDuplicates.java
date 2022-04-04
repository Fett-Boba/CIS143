package com.boba.practiceproblems;
import java.util.ArrayList;

public class PiRemoveDuplicates {

	/* Write a method removeDuplicates that takes as a parameter a sorted ArrayList of Strings and that 
	eliminates any duplicates from the list. For example, suppose that a variable called list contains the 
	following values: 

	{"be", "be", "is", "not", "or", "question", "that", "the", "to", "to"} 

	After calling removeDuplicates(list); the list should store the following values: 

	{"be", "is", "not", "or", "question", "that", "the", "to"}

	Because the values will be sorted, all of the duplicates will be grouped together.
	 */

	public static void main(String[] args) {

		ArrayList<String> arrlist = new ArrayList<String>();
		arrlist.add("be");
		arrlist.add("be");
		arrlist.add("is");
		arrlist.add("not");
		arrlist.add("or");
		arrlist.add("question");
		arrlist.add("that");
		arrlist.add("the");
		arrlist.add("to");
		arrlist.add("to");
		removeDuplicates(arrlist);
	}

	public static void removeDuplicates(ArrayList<String> list) {

		if (list.size() != 0) {

			ArrayList<String> newList = new ArrayList<String>();

			String element = list.get(0);  // priming read of first array element 
			newList.add(element);

			for (int i = 1; i < list.size(); i++) {
				if (element != list.get(i)) {
					newList.add(list.get(i));
					element = list.get(i);
				}
			}
			list.clear();
			list.addAll(newList);
			System.out.println(list);
			
		}
	}
}
