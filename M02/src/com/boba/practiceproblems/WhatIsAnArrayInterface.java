package com.boba.practiceproblems;

import java.util.ArrayDeque;
import java.util.Collection;

public class WhatIsAnArrayInterface {

	// When we do this, we need to add all the method signatures from Collection.
	//public class MyArrayDeque implements Collection {
	//		
	//}
	
	// This is an interface, but doesn't do much until some class tries to implement it.
	// If a class implements nameable, then it must have a name method that returns a string
	public interface Nameable {
		String name();
	}
	
	// Cats have names.  And implements nameable.  Cat must implement.  We need to add all the methods. 
	public class Cat implements Nameable {

		@Override
		public String name() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	
	public class Country implements Nameable {

		@Override
		public String name() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
		
	// Now we can have an arrayDeque of Nameable obects.  They can be cats or countries etc.
	public static void main(String[] args) {
		ArrayDeque a = new ArrayDeque();
		
		
		
		
	}

}
