package com.olympic.cis143.touche;

public class Score {

	private String fencer;
	private int fencerID;
	
	private int victories;
	private int touchesScored;
	private int touchesReceived;
	private int indicators;
	private int place;
	
	public Score(String fencer, int fencerID) {
		this.fencer = fencer;
		this.fencerID = fencerID;
	}

	public String getFencer() {
		return fencer;
	}

	public void setFencer(String fencer) {
		this.fencer = fencer;
	}

	public int getFencerID() {
		return fencerID;
	}

	public void setFencerID(int fencerID) {
		this.fencerID = fencerID;
	}

	public int getVictories() {
		return victories;
	}

	public void setVictories(int victories) {
		this.victories = victories;
	}

	public int getTouchesScored() {
		return touchesScored;
	}

	public void setTouchesScored(int touchesScored) {
		this.touchesScored = touchesScored;
	}

	public int getTouchesReceived() {
		return touchesReceived;
	}

	public void setTouchesReceived(int touchesReceived) {
		this.touchesReceived = touchesReceived;
	}

	public int getIndicators() {
		return indicators;
	}

	public void setIndicators(int indicators) {
		this.indicators = indicators;
	}

	public int getPlace() {
		return place;
	}

	public void setPlace(int place) {
		this.place = place;
	}
		
}
