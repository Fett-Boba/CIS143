package com.olympic.cis143.hw1.fizzbuzz;

public class FizzBuzzConverter {

	public int[] data;

	public FizzBuzzConverter(int[] values) { 
		if (values == null) {
			throw new RuntimeException("Values passed cannot be null");
		}
		this.data = values;
	}

	/**
     For this method, you will need to iterate through a list of ints and populate a return array with the correct 
     values according to the rules of FizzBuzz. FizzBuzz is a common practice algorithm used when screening candidates. 

     The rules are as follows:

	 If the int is a multiples of three print â€œFizzâ€�
     If the int is a multiples of five print â€œBuzzâ€�
     If the int is a multiple of three and five print "FizzBuzz"

     For example, if the array sent into the method contains the following ints [ 0, 1, 2, 3, 5, 10, 15, 7, 16], the 
     returned Object array will be [0, 1, 2, "Fizz", "Buzz", "Buzz", "FizzBuzz", 7, 16]

     Note that the method should accept an int array int[] data, and return an object array Object[].
	 */

	public Object[] convertToFizzBuzz() {

		Object[] fbObj = new Object[data.length];

		for (int i = 0; i < data.length; i++) {
			if (data[i] == 0) {
				fbObj[i] = data[i];
			} else if ((data[i] % 3 == 0)  && (data[i] % 5 == 0)) {
				fbObj[i] = "FizzBuzz";
			} else if (data[i] % 5 == 0) {
				fbObj[i] = "Buzz";
			} else if (data[i] % 3 == 0) {
				fbObj[i] = "Fizz";
			} else {
				fbObj[i] = data[i];
			}
		}

		return fbObj;
	}
}
