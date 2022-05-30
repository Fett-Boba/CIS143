package com.boba.practiceproblems;

import java.util.ArrayList;
import java.util.List;

public class NeverGonna2 {

	public static List<String> music(List<Integer> numbers){
		
	
		  List <String> chorus = new ArrayList<>();
		  chorus.add("Never gonna give you up");
		  chorus.add("Never gonna let you down");
		  chorus.add("Never gonna run around and desert you");
		  chorus.add("Never gonna make you cry");
		  chorus.add("Never gonna say goodbye");
		  chorus.add("Never gonna tell a lie and hurt you");
		  
		  List <String> newChorus = new ArrayList<>();

		  for (int i = 0; i < numbers.size(); i++) {
			  if  (i % 2 == 0 ) {
				  newChorus.add(chorus.get(numbers.get(i))) ;
			  } else {
				  newChorus.add(chorus.get(numbers.get(i)).replace("Never gonna", "NEVER GONNA"));
			  }
		  }
		  return newChorus;
		
	}
}
