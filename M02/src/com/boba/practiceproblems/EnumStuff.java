package com.boba.practiceproblems;

import java.util.Stack;

// How does an enum work???

public class EnumStuff {

	public static void main(String[] args) {
		
		Stack<DaysOfWeekEnum> sDays = new Stack<>();
		
		// push the days of the week onto the stack
		for (DaysOfWeekEnum day : DaysOfWeekEnum.values()) {
			sDays.push(day);
		}
		
		// expected result = saturday (last thing to go onto the stack)
		System.out.println(sDays.pop());
		
	}
	
	public enum DaysOfWeekEnum {
	    SUNDAY,
	    MONDAY,
	    TUESDAY, 
	    WEDNESDAY, 
	    THURSDAY, 
	    FRIDAY, 
	    SATURDAY
	}

}
