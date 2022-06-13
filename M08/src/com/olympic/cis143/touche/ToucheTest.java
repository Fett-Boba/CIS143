package com.olympic.cis143.touche;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class ToucheTest {

	@Test
	void testToStringTournament() {
		Tournament t = new Tournament();
		t.setTournamentName("Orion Invitational");
		t.setNumFencers(7);
		assertEquals("NAME: Orion Invitational NUM FENCERS: 7", t.toString());
	}
	
	@Test
	void testCalculateVictories() {
		Fencer f1 = new Fencer();
		List <Integer> ts = new ArrayList<>(Arrays.asList(5,2,5));
		List <Integer> tr = new ArrayList<>(Arrays.asList(1,5,0));
		f1.setAlTs(ts);
		f1.setAlTr(tr);
		assertEquals(2, f1.calculateVictories());
	}

	@Test
	void testCalculateTouchesScored() {
		Fencer f2 = new Fencer();
		List <Integer> ts = new ArrayList<>(Arrays.asList(5,2,5));
		f2.setAlTs(ts);
		assertEquals(12, f2.calculateTouchesScored());
	}

	@Test
	void testCalculateTouchesReceived() {
		Fencer f3 = new Fencer();
		List <Integer> tr = new ArrayList<>(Arrays.asList(1,5,0));
		f3.setAlTr(tr);
		assertEquals(6, f3.calculateTouchesReceived());
	}

	@Test
	void testCalculateIndicator() {
		Fencer f4 = new Fencer();
		List <Integer> ts = new ArrayList<>(Arrays.asList(5,2,5));
		List <Integer> tr = new ArrayList<>(Arrays.asList(1,5,0));		
		f4.setAlTs(ts);
		f4.setAlTr(tr);
		assertEquals(6, f4.calculateIndicator());
	}

	@Test
	void testToStringFencer() {
		Fencer f5 = new Fencer();
		List <Integer> ts = new ArrayList<>(Arrays.asList(5,2,5));
		List <Integer> tr = new ArrayList<>(Arrays.asList(1,5,0));
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

	@Test
	void testIsValidScore() {
		Touche touche = new Touche();
		String s1 = "0";
		assertEquals(true, touche.isValidScore(s1));
		String s2 = "5";
		assertEquals(true, touche.isValidScore(s2));
		String s3 = "7";
		assertEquals(false, touche.isValidScore(s3));
		String s4 = "-2";
		assertEquals(false, touche.isValidScore(s4));
	}

}
