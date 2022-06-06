package com.olympic.cis143.touche;

import java.util.ArrayList;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		
		Tournament tournament = new Tournament();
		tournament.setNumFencers(4);
		tournament.setTournamentName("My little tournament");
		System.out.println(tournament.toString());

		// Create an array of fencer objects based on how many are in in the tournament
		List <Fencer> fencers = new ArrayList<>();
		
		for (int i = 0; i < tournament.getNumFencers(); i++) {
			Fencer f = new Fencer();
			f.setFencerNum(i+1);
			f.setName("Fencer" + (i+1));
			fencers.add(f);
		}
		//System.out.println(fencers);
		
		Fencer f1 = fencers.get(0);
		f1.setTs2(5);
		f1.setTs3(5);
		f1.setTs4(5);
		f1.setTr2(1);
		f1.setTr3(1);
		f1.setTr4(1);
		System.out.println(f1);		
		
	}
}
