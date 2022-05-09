package com.boba.practiceproblems;

import static org.junit.Assert.*;

import org.junit.Test;

public class CwMakeNegativeTest {
	  
	  @Test
	  public void test1() {
	    assertEquals(-5, CwMakeNegative.makeNegative(-5));
	  }
	  
	  @Test
	  public void test2() {
		  assertEquals(-1, CwMakeNegative.makeNegative(1));  
	  }
  
	  @Test
	  public void test3() {
		  assertEquals(0, CwMakeNegative.makeNegative(0));  
	  }
	  
}
