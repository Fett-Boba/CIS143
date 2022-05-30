package com.olympic.cis143.touchemvc.model;

public class Fencer {
	
	private String name;
	private String number;
	private String column1;
	private String column2;
	private String column3;
	private String column4;
	private String victories;
	private String touchesScored;
	private String touchesReceived;
	private String indicator;
	private String place;
	
	public Fencer(String name, String number, String column1, String column2, String column3, String column4, String victories,
			String touchesScored, String touchesReceived, String indicator, String place) {
		this.name = name;
		this.number = number;
		this.column1 = column1;
		this.column2 = column2;
		this.column3 = column3;
		this.column4 = column4;
		this.victories = victories;
		this.touchesScored = touchesScored;
		this.touchesReceived = touchesReceived;
		this.indicator = indicator;
		this.place = place;
	}
	
	public Fencer() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getColumn1() {
		return column1;
	}

	public void setColumn1(String column1) {
		this.column1 = column1;
	}

	public String getColumn2() {
		return column2;
	}

	public void setColumn2(String column2) {
		this.column2 = column2;
	}

	public String getColumn3() {
		return column3;
	}

	public void setColumn3(String column3) {
		this.column3 = column3;
	}

	public String getColumn4() {
		return column4;
	}

	public void setColumn4(String column4) {
		this.column4 = column4;
	}

	public String getVictories() {
		return victories;
	}

	public void setVictories(String victories) {
		this.victories = victories;
	}

	public String getTouchesScored() {
		return touchesScored;
	}

	public void setTouchesScored(String touchesScored) {
		this.touchesScored = touchesScored;
	}

	public String getTouchesReceived() {
		return touchesReceived;
	}

	public void setTouchesReceived(String touchesReceived) {
		this.touchesReceived = touchesReceived;
	}

	public String getIndicator() {
		return indicator;
	}

	public void setIndicator(String indicator) {
		this.indicator = indicator;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

}
