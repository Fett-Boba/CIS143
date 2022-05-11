package com.boba.practiceproblems;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareDigitTest {

	 @Test
	    public void test() {
	      assertEquals(811181, new SquareDigit().squareDigits(9119));
	      assertEquals(0, new SquareDigit().squareDigits(0));
	    }

}
