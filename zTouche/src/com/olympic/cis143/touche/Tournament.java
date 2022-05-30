package com.olympic.cis143.touche;

public class Tournament {

	private String tournamentName;
	private String tournamentDate;
	private int numFencers;
	
	public Tournament(String tournamentName, String tournamentDate, int numFencers) {
		this.tournamentName = tournamentName;
		this.tournamentDate = tournamentDate;
		this.numFencers = numFencers;
	}

	public String getTournamentName() {
		return tournamentName;
	}

	public void setTournamentName(String tournamentName) {
		this.tournamentName = tournamentName;
	}

	public String getTournamentDate() {
		return tournamentDate;
	}

	public void setTournamentDate(String tournamentDate) {
		this.tournamentDate = tournamentDate;
	}

	public int getNumFencers() {
		return numFencers;
	}

	public void setNumFencers(int numFencers) {
		this.numFencers = numFencers;
	}

	public String toString() {
		return "Tournament Name: " + tournamentName +  " Tournament Date: " + tournamentDate + " Number Fencers: " + numFencers;
	}
	
}
