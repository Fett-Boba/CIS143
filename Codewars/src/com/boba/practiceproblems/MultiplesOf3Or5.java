package com.boba.practiceproblems;

public class MultiplesOf3Or5 {

	  public int solution(int number) {

	      int result = 0;
			  for (int i = 1; i < number; i++) {
				  if (i % 3 == 0 && i % 5 == 0) {
					  result += i;
				  } else if (i % 3 == 0 || i % 5 == 0) {
					  result += i;
				  }
			  }
			  return result;
		  }
}
