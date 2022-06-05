package com.olympic.cis143.touche;

import java.util.ArrayList;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		
		Tournament tournament = new Tournament();
		tournament.setNumFencers(4);
		tournament.setTournamentName("My little tournament");
		System.out.println(tournament.toString());

		// Create an array of fencers based on how many are in in the tournament

		List <Fencer> fencers = new ArrayList<>();
		
		for (int i = 0; i < tournament.getNumFencers(); i++) {
			
			Fencer f = new Fencer();
			f.setFencerNum(i + 1);
			f.setName("Fencer" + (i+1) );
			
			// Initialize touches scored and touches received array lists to blanks for scores
		
			List <String> ts = new ArrayList<>();
			List <String> tr = new ArrayList<>();
			for (int j = 0; j < tournament.getNumFencers(); j++) {
				ts.add("");
				tr.add("");
			}
			f.setBoutsTouchesScored(ts);
			f.setBoutsTouchesReceived(tr);
			fencers.add(f);
		}
		System.out.println(fencers);
		
	}

}
