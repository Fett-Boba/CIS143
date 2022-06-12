package com.olympic.cis143.touche;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FencerTest {
	
	@Test
	void testCalculateVictories() {
		
		Fencer f1 = new Fencer();
		
		List <Integer> ts = new ArrayList<>();
		ts.add(5);
		ts.add(2);
		ts.add(5);

		List <Integer> tr = new ArrayList<>();
		tr.add(1);
		tr.add(5);
		tr.add(0);
		
		f1.setAlTs(ts);
		f1.setAlTr(tr);
		assertEquals(2, f1.calculateVictories());
	}

	@Test
	void testCalculateTouchesScored() {
		
		Fencer f2 = new Fencer();
		List <Integer> ts = new ArrayList<>();
		ts.add(5);
		ts.add(2);
		ts.add(5);
		
		f2.setAlTs(ts);
		assertEquals(12, f2.calculateTouchesScored());
	}

	@Test
	void testCalculateTouchesReceived() {
		
		Fencer f3 = new Fencer();

		List <Integer> tr = new ArrayList<>();
		tr.add(1);
		tr.add(5);
		tr.add(0);

		f3.setAlTr(tr);
		assertEquals(6, f3.calculateTouchesReceived());
	}

	@Test
	void testCalculateIndicator() {
		
		Fencer f4 = new Fencer();

		List <Integer> ts = new ArrayList<>();
		ts.add(5);
		ts.add(2);
		ts.add(5);

		List <Integer> tr = new ArrayList<>();
		tr.add(1);
		tr.add(5);
		tr.add(0);
		
		f4.setAlTs(ts);
		f4.setAlTr(tr);
		assertEquals(6, f4.calculateIndicator());
	}

	@Test
	void testToString() {

		Fencer f5 = new Fencer();

		List <Integer> ts = new ArrayList<>();
		ts.add(5);
		ts.add(2);
		ts.add(5);
		List <Integer> tr = new ArrayList<>();
		tr.add(1);
		tr.add(5);
		tr.add(0);

		f5.setFencerNum(3);
		f5.setName("Dread Pirate Roberts");
		f5.setAlTs(ts);
		f5.setAlTr(tr);
		f5.setTouchesScored(12);
		f5.setTouchesReceived(6);
		f5.setVictories(2);
		f5.setIndicator(6);
		f5.setPlace(2);

		assertEquals("Fencer [fencerNum=3, name=Dread Pirate Roberts, alTs=[5, 2, 5], alTr=[1, 5, 0], victories=2, touchesScored=12, touchesReceived=6, indicator=6, place=2]", f5.toString());
		
	}

}
