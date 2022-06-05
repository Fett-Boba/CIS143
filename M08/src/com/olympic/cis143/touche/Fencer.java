package com.olympic.cis143.touche;

import java.util.List;

public class Fencer {

	private int fencerNum;
	private String name;
	private List <String> boutsTouchesScored;
	private List <String> boutsTouchesReceived;
	private int victories;
	private int totalTouchesScored;
	private int totalTouchesReceived;
	private int indicator;
	private int place;
	
	public Fencer() {
		
	}

	public Fencer(int fencerNum, String name, List<String> boutsTouchesScored, List<String> boutsTouchesReceived) {
		this.fencerNum = fencerNum;
		this.name = name;
		this.boutsTouchesScored = boutsTouchesScored;
		this.boutsTouchesReceived = boutsTouchesReceived;
	}

	
	
	public int calculateVictories() {
		return 0;
	}
	
	public int calculateTotalTouchesScored() {
		return 0;
	}
	
	public int calculateTotalTouchesReceived() {
		return 0;
	}
	
	public int calculateIndicator() {
		return 0;
	}
	
	public int calculatePlate() {
		return 0;
	}
	
	
	
	public int getFencerNum() {
		return fencerNum;
	}

	public void setFencerNum(int fencerNum) {
		this.fencerNum = fencerNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getBoutsTouchesScored() {
		return boutsTouchesScored;
	}

	public void setBoutsTouchesScored(List<String> boutsTouchesScored) {
		this.boutsTouchesScored = boutsTouchesScored;
	}

	public List<String> getBoutsTouchesReceived() {
		return boutsTouchesReceived;
	}

	public void setBoutsTouchesReceived(List<String> boutsTouchesReceived) {
		this.boutsTouchesReceived = boutsTouchesReceived;
	}

	public int getVictories() {
		return victories;
	}

	public void setVictories(int victories) {
		this.victories = victories;
	}

	public int getTotalTouchesScored() {
		return totalTouchesScored;
	}

	public void setTotalTouchesScored(int totalTouchesScored) {
		this.totalTouchesScored = totalTouchesScored;
	}

	public int getTotalTouchesReceived() {
		return totalTouchesReceived;
	}

	public void setTotalTouchesReceived(int totalTouchesReceived) {
		this.totalTouchesReceived = totalTouchesReceived;
	}

	public int getIndicator() {
		return indicator;
	}

	public void setIndicator(int indicator) {
		this.indicator = indicator;
	}

	public int getPlace() {
		return place;
	}

	public void setPlace(int place) {
		this.place = place;
	}
	
	public String toString() {
		return "Hello from Fencer class";
	}
}
