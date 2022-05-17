package com.boba.practiceproblems;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CreatePhoneNumbersTest {

	@Test
	  public void tests() {
	    assertEquals("(123) 456-7890", CreatePhoneNumbers.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
	  }

}



