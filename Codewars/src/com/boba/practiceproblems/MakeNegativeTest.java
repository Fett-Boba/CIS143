package com.boba.practiceproblems;

import static org.junit.Assert.*;

import org.junit.Test;

public class MakeNegativeTest {
	  
	  @Test
	  public void test1() {
	    assertEquals(-5, MakeNegative.makeNegative(-5));
	  }
	  
	  @Test
	  public void test2() {
		  assertEquals(-1, MakeNegative.makeNegative(1));  
	  }
  
	  @Test
	  public void test3() {
		  assertEquals(0, MakeNegative.makeNegative(0));  
	  }
	  
}
