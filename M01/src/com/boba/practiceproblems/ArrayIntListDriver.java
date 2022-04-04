package com.boba.practiceproblems;
public class ArrayIntListDriver {

	public static void main (String []args ) {
		
		
		// Q: What is the radio example from lecture ??? (last page of M01 ArrayIntList
		//    toString and clear)
		
		
		// We do not have an add() method yet in ArrayIntList.  
		// I guess I was supposed to make my own?
		
		ArrayIntList list = new ArrayIntList();
		list.add(4);
		list.add(7);
		list.add(-3);
		System.out.println("list1: " + list.toString());

		// Try out the clear method
		list.clear();
		System.out.println("list1 after clear" + list.toString());
		
		// Try the boundary of empty
		ArrayIntList list2 = new ArrayIntList();
		System.out.println("list2: " + list2);
	
		// Try the boundary of more than 10 ... we have array out of bounds and it fails.  
		// Added capacity so the user can control it.  They can now make it 20 (or whatever).
		ArrayIntList list3 = new ArrayIntList(20);
		list3.add(1);
		list3.add(2);
		list3.add(3);
		list3.add(4);
		list3.add(5);
		list3.add(6);
		list3.add(7);
		list3.add(8);
		list3.add(9);
		list3.add(10);
		list3.add(11);
		System.out.println("list3: " + list3);
		
		// printInversion from Practice-It
		System.out.println("-------------- printInversion() ----------------");
		ArrayIntList list4 = new ArrayIntList();
		list4.add(4);
		list4.add(3);
		list4.add(2);
		list4.add(1);
		list4.printInversions();
		
		// printInversion from Practice-It
		System.out.println("-------------- printInversion() ----------------");
		ArrayIntList list5 = new ArrayIntList();
		list5.add(1);
		list5.add(2);
		list5.add(3);
		list5.add(4);
		list5.printInversions();

		// runningTotal from Practice-It
		System.out.println("-------------- runningTotal() ----------------");
		ArrayIntList list6 = new ArrayIntList();
		list6.add(2);
		list6.add(3);
		list6.add(5);
		list6.add(4);
		list6.add(7);
		list6.add(15);
		list6.add(20);
		list6.add(7);
		System.out.println(list6.runningTotal().toString());
		
		// runningTotal from Practice-It
		System.out.println("-------------- runningTotal() ----------------");
		ArrayIntList list7 = new ArrayIntList();
		System.out.println(list7.runningTotal().toString());
	
		
		
		
		
	}
}
