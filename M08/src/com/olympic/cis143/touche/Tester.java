package com.olympic.cis143.touche;

import java.util.ArrayList;
import java.util.List;

public class Tester {

	public static void main(String[] args) {

		// tournament
		Tournament t = new Tournament();
		t.setTournamentName("My Little Tourney");
		t.setNumFencers(4);
		
		// Array of fencer objects (same one three times for purpooses of testing)
		List <Fencer> fencerList = new ArrayList<>();
		
		for (int i = 0; i < t.getNumFencers(); i++ ) {
			
			Fencer f = new Fencer();
			
			// fake scores - 3 victories, 15 touches scored, 3 touches recd, indicator 12
			List <Integer> fts = new ArrayList<>();
			fts.add(5);
			fts.add(5);
			fts.add(5);
			List <Integer> ftr = new ArrayList<>();
			ftr.add(1);
			ftr.add(1);
			ftr.add(1);
			
			// The object
			f.setName("Tami");
			f.setFencerNum(i+1);
			f.setAlTs(fts);
			f.setAlTr(ftr);
			f.setVictories(f.calculateVictories());
			f.setTouchesScored(f.calculateTouchesScored());
			f.setTouchesReceived(f.calculateTouchesReceived());
			f.setIndicator(f.calculateIndicator());
			
			fencerList.add(f);
			//System.out.println(f.toString());
		}

		// How do I get at the objects in the array now???
		
//		System.out.println(fencerList.get(0).toString());
		System.out.println(fencerList.get(3).getFencerNum());
		
				
		
		
		//System.out.println(fencerList);
	}

}
