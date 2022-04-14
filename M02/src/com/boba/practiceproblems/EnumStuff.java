package com.boba.practiceproblems;

import java.util.Stack;

public class EnumStuff {

	public static void main(String[] args) {

		
		Stack<DaysOfWeekEnum> sDays = new Stack<>();
		
		for (DaysOfWeekEnum day : DaysOfWeekEnum.values()) {
			//System.out.println(day);
			sDays.push(day);
		}
		
		// expected result = saturday
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
