package com.olympic.cis143.touche;

import java.util.List;

public class Fencer {

	private int fencerNum;
	private String name;
	private List <Integer> alTs;	//list of bouts touches scored
	private List <Integer> alTr;	//list of bouts touches received
	private int victories;
	private int touchesScored;
	private int touchesReceived;
	private int indicator;
	private int place;
	
	public Fencer() {
		
	}
	
	public Fencer(int fencerNum, String name, List<Integer> alTs, List<Integer> alTr, int victories,
			int touchesScored, int touchesReceived, int indicator, int place) {
		this.fencerNum = fencerNum;
		this.name = name;
		this.alTs = alTs;
		this.alTr = alTr;
		this.victories = victories;
		this.touchesScored = touchesScored;
		this.touchesReceived = touchesReceived;
		this.indicator = indicator;
		this.place = place;
	}

	public int calculateVictories() {
		int v = 0;
		for (int i = 0; i < alTs.size(); i++) {
			if (alTs.get(i) > alTr.get(i)) {
				v++;
			}
		}
		return v;
	}
	
	public int calculateTouchesScored() {
		int ts = 0;
		for (Integer touch : alTs) {
			ts += touch;
		} 
		return ts;
	}
	
	public int calculateTouchesReceived() {
		int tr = 0;
		for (Integer touch : alTr) {
			tr += touch;
		}
		return tr;
	}
	
	public int calculateIndicator() {
		return calculateTouchesScored() - calculateTouchesReceived();
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

	public List<Integer> getAlTs() {
		return alTs;
	}

	public void setAlTs(List<Integer> alTs) {
		this.alTs = alTs;
	}

	public List<Integer> getAlTr() {
		return alTr;
	}

	public void setAlTr(List<Integer> alTr) {
		this.alTr = alTr;
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

	@Override
	public String toString() {
		return "Fencer [fencerNum=" + fencerNum + ", name=" + name + ", alTs=" + alTs + ", alTr=" + alTr
				+ ", victories=" + victories + ", touchesScored=" + touchesScored + ", touchesReceived="
				+ touchesReceived + ", indicator=" + indicator + ", place=" + place + "]";
	}

}
