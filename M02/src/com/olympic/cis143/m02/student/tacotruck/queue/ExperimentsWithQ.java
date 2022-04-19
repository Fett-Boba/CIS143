package com.olympic.cis143.m02.student.tacotruck.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ExperimentsWithQ {

	public static void main(String[] args) {
		
		Deque<Integer> q = new ArrayDeque<>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		System.out.println(q);
		
		// Front and back of line.
		System.out.println("front of line: " + q.getFirst());
		System.out.println("back of line: " + q.getLast());
		
		System.out.println(q.removeFirst());
//		System.out.println(q);
//		
//		System.out.println(q.removeLast());
//		System.out.println(q);
//		
//		System.out.println(q.size());
		
	}
}
