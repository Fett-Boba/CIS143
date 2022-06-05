package com.olympic.cis143.touche;

public class Tournament {

	private String TournamentName;
	private int NumFencers;
	
	public Tournament() {
		
	}
	
	public Tournament(String tournamentName, int numFencers) {
		TournamentName = tournamentName;
		NumFencers = numFencers;
	}

	public String getTournamentName() {
		return TournamentName;
	}

	public void setTournamentName(String tournamentName) {
		TournamentName = tournamentName;
	}

	public int getNumFencers() {
		return NumFencers;
	}

	public void setNumFencers(int numFencers) {
		NumFencers = numFencers;
	}
	
	public String toString() {
		return "NAME: " + getTournamentName() + " NUM FENCERS: " + getNumFencers();
	}
	
}
