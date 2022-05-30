package com.olympic.cis143.touche;

public class Fencer {

	private int fencerID;
	private String fencer;
	
	public Fencer(int fencerID, String fencer) {
		this.fencerID = fencerID;
		this.fencer = fencer;
	}

	public int getFencerID() {
		return fencerID;
	}

	public void setFencerID(int fencerID) {
		this.fencerID = fencerID;
	}

	public String getFencer() {
		return fencer;
	}

	public void setFencer(String fencer) {
		this.fencer = fencer;
	}

	public String toString() {
		return "ID: " + fencerID +  " Fencer: " + fencer;
	}
	
}
