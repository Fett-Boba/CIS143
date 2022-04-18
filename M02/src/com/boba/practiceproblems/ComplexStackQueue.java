package com.boba.practiceproblems;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ComplexStackQueue {

	public static void main(String[] args) {

		// Create a method removeAll that removes the letter a from the given q
		Queue<String> q = new LinkedList<>();
		q.add("a");
		q.add("a");
		q.add("b");
		q.add("c");
		q.add("a");
		q.add("c");
		q.add("a");
		q.add("b");
		q.add("a");
		q.add("a");
		System.out.println(q);
		removeAll(q, "a");
		System.out.println(q);
		
		// Create a method isSorted that accepts a stack of ints and returns 
		// true if sorted, false if not.  DO NOT DESTROY THE STACK
		
		Stack<Integer> s1 = new Stack<>();
		s1.push(50);
		s1.push(40);
		s1.push(30);
		s1.push(20);
		s1.push(10);
		System.out.println(s1);
		System.out.println(isSorted(s1));
		System.out.println(s1);
		System.out.println();
		
		Stack<Integer> s2 = new Stack<>();
		s2.push(5);
		s2.push(2);
		s2.push(6);
		s2.push(4);
		s2.push(1);
		System.out.println(s2);
		System.out.println(isSorted(s2));
		System.out.println(s2);
		System.out.println();
	}

	public static boolean isSorted(Stack<Integer> stack) {
		// check if stack is empty first.
		if (stack.isEmpty()) {
			return true;
		}
		
		// now check pairs of each number and compare previous to next
		// Do a priming pop.  Also save off a backup.
		
		Stack<Integer> backup = new Stack<>();
		int prev = stack.pop();
		backup.push(prev);
		boolean sorted = true;
		
		while (! stack.isEmpty() && sorted) {
			// if the top of the stack is less than prev we are not sorted. Set flag
			// for use after we restore our stack back to the orig
			if (stack.peek() < prev) {
				sorted = false;  
			} else {
				prev = stack.pop();
				backup.push(prev);
			}
		}
		// all vals checked, we are sorted, but we need to restore the orig stack first
		while (! backup.isEmpty()) {
			stack.push(backup.pop());
		}
		return sorted;    // default was sorted = true...
	}
	
	public static void removeAll(Queue<String> q, String s) {
		int size = q.size();
		for (int i = 0; i < size; i++) {
			String element = q.remove();
			if (! element.equals(s) ) {
				q.add(element);
			}
		}

	}
}
