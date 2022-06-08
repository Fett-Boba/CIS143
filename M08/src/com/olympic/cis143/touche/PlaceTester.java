package com.olympic.cis143.touche;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PlaceTester {

	public static void main(String[] args) {
		
		// array list of fencer objects
		List <Fencer> fencerList = new ArrayList<>(); 
		
		// create pool of 4 and fill array of fencer objects. create a tie on victories
		// fencer 1 and 2 have 1 win
		// fencer 3 and 4 have 2 wins
		for (int i = 0; i < 4; i++) {
			Fencer f = new Fencer();
			f.setFencerNum(i+1);
			f.setName("Fencer" + (i+1));
			switch (i) {
			case 0: 
				f.setVictories(1);
				f.setIndicator(1);
				break;
			case 1: 
				f.setVictories(1);
				f.setIndicator(-6);
				break;
			case 2: 
				f.setVictories(2);
				f.setIndicator(0);
				break;
			case 3: 
				f.setVictories(2);
				f.setIndicator(5);
				break;
			default:
				break;
			}
			fencerList.add(f);
		}

		// place only by victories
		//Collections.sort(fencerList, Comparator.comparingInt(Fencer::getVictories).reversed());
		
		// tie on victories, drill down into indicator (Yasssss. It works)
		Collections.sort(fencerList, 
				Comparator.comparingInt(Fencer::getVictories)
					.thenComparingInt(Fencer::getIndicator).reversed()
					);
		
		for (int i = 0; i < 4; i++) {
			//System.out.println(fencerList.get(i));
			System.out.println((i+1) + ". " + fencerList.get(i).getName());
			fencerList.get(i).setPlace(i + 1);  // update the object with place
		}
		
		System.out.println("-------------------");
		// make sure the obj updated!
		for (int i = 0; i < 4; i++) {
			System.out.println(fencerList.get(i));
		}
		
		
		
		
		
	}

}
