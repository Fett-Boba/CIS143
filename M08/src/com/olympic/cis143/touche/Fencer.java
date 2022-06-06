package com.olympic.cis143.touche;

import java.util.List;

public class Fencer {

	private int fencerNum;
	private String name;
	
	private int ts1;
	private int ts2;
	private int ts3;
	private int ts4;
	private int ts5;
	private int ts6;
	private int ts7;
	private int ts8;

	private int tr1;
	private int tr2;
	private int tr3;
	private int tr4;
	private int tr5;
	private int tr6;
	private int tr7;
	private int tr8;
	
	private int victories;
	private int totalTouchesScored;
	private int totalTouchesReceived;
	private int indicator;
	private int place;
	
	public Fencer() {
	
	}

	public Fencer(int fencerNum, String name, int ts1, int ts2, int ts3, int ts4, int ts5, int ts6, int ts7, int ts8,
			int tr1, int tr2, int tr3, int tr4, int tr5, int tr6, int tr7, int tr8, int victories,
			int totalTouchesScored, int totalTouchesReceived, int indicator, int place) {
		this.fencerNum = fencerNum;
		this.name = name;
		this.ts1 = ts1;
		this.ts2 = ts2;
		this.ts3 = ts3;
		this.ts4 = ts4;
		this.ts5 = ts5;
		this.ts6 = ts6;
		this.ts7 = ts7;
		this.ts8 = ts8;
		this.tr1 = tr1;
		this.tr2 = tr2;
		this.tr3 = tr3;
		this.tr4 = tr4;
		this.tr5 = tr5;
		this.tr6 = tr6;
		this.tr7 = tr7;
		this.tr8 = tr8;
		this.victories = victories;
		this.totalTouchesScored = totalTouchesScored;
		this.totalTouchesReceived = totalTouchesReceived;
		this.indicator = indicator;
		this.place = place;
	}
	
	public int calculateVictories() {
		int v = 0;
		if (ts1 > tr1) v++;
		if (ts2 > tr2) v++;
		if (ts3 > tr3) v++;
		if (ts4 > tr4) v++;
		if (ts5 > tr5) v++;
		if (ts6 > tr6) v++;
		if (ts7 > tr7) v++;
		if (ts8 > tr8) v++;
		return v;
	}
	
	public int calculateTouchesScored() {
		return ts1 + ts2 + ts3 + ts4 + ts5 + ts6 + ts7 + ts8;
	}
	
	public int calculateTouchesReceived() {
		return tr1 + tr2 + tr3 + tr4 + tr5 + tr6 + tr7 + tr8;
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

	public int getTs1() {
		return ts1;
	}

	public void setTs1(int ts1) {
		this.ts1 = ts1;
	}

	public int getTs2() {
		return ts2;
	}

	public void setTs2(int ts2) {
		this.ts2 = ts2;
	}

	public int getTs3() {
		return ts3;
	}

	public void setTs3(int ts3) {
		this.ts3 = ts3;
	}

	public int getTs4() {
		return ts4;
	}

	public void setTs4(int ts4) {
		this.ts4 = ts4;
	}

	public int getTs5() {
		return ts5;
	}

	public void setTs5(int ts5) {
		this.ts5 = ts5;
	}

	public int getTs6() {
		return ts6;
	}

	public void setTs6(int ts6) {
		this.ts6 = ts6;
	}

	public int getTs7() {
		return ts7;
	}

	public void setTs7(int ts7) {
		this.ts7 = ts7;
	}

	public int getTs8() {
		return ts8;
	}

	public void setTs8(int ts8) {
		this.ts8 = ts8;
	}

	public int getTr1() {
		return tr1;
	}

	public void setTr1(int tr1) {
		this.tr1 = tr1;
	}

	public int getTr2() {
		return tr2;
	}

	public void setTr2(int tr2) {
		this.tr2 = tr2;
	}

	public int getTr3() {
		return tr3;
	}

	public void setTr3(int tr3) {
		this.tr3 = tr3;
	}

	public int getTr4() {
		return tr4;
	}

	public void setTr4(int tr4) {
		this.tr4 = tr4;
	}

	public int getTr5() {
		return tr5;
	}

	public void setTr5(int tr5) {
		this.tr5 = tr5;
	}

	public int getTr6() {
		return tr6;
	}

	public void setTr6(int tr6) {
		this.tr6 = tr6;
	}

	public int getTr7() {
		return tr7;
	}

	public void setTr7(int tr7) {
		this.tr7 = tr7;
	}

	public int getTr8() {
		return tr8;
	}

	public void setTr8(int tr8) {
		this.tr8 = tr8;
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
		return "\n#"+ getFencerNum() + 
				" NAME: " + getName() + "\n" +
				" Row (TS): " + ts1 + ", " + ts2 + ", "+ ts3 + ", "+ ts4 + ", "+ ts5 + ", "+ ts6 + ", "+ ts7 + ", "+ ts8 + "\n" +
				" Col (TR): " + tr1 + ", " + tr2 + ", "+ tr3 + ", "+ tr4 + ", "+ tr5 + ", "+ tr6 + ", "+ tr7 + ", "+ tr8 + "\n" +
				" V: " + getVictories() + 
				" TS: " + getTotalTouchesScored() + 
				" TR: " + getTotalTouchesReceived() + 
				" INDICATOR: " + getIndicator() + 
				" PLACE: " + getPlace();
	}
}