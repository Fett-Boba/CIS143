package com.olympic.cis143.touchemvc.model;

import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

public class FencerTable extends AbstractTableModel {

	private final List<Fencer> fencerList;
	private final String []columnNames = new String [] {
			"Name                   ", 
			"#", 
			"1", 
			"2", 
			"3", 
			"4", 
			"V", 
			"TS", 
			"TR", 
			"Ind", 
			"Pl"};
	private final Class []columnClass = new Class[] {
			String.class, 
			String.class,
			String.class,
			String.class,
			String.class,
			String.class,
			String.class,
			String.class,
			String.class,
			String.class,
			String.class};

	
	public FencerTable(List<Fencer> fencerList) {
		this.fencerList = fencerList;
	}

	public String getColumnName(int column) {
		return columnNames[column];
	}

	public Class<?> getColumnClass (int columnIndex) {
		return columnClass[columnIndex];
	}
	
	public List<Fencer> getFencerList() {
		return fencerList;
	}

	public String[] getColumnNames() {
		return columnNames;
	}

	public Class[] getColumnClass() {
		return columnClass;
	}

	@Override
	public int getRowCount() {
		return fencerList.size();
	}

	@Override
	public int getColumnCount() {
		return columnNames.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		
		Fencer row = fencerList.get(rowIndex);
		
		if (columnIndex == 0) {
			return row.getName();
		} else if (columnIndex == 1) {
			return row.getNumber();
		} else if (columnIndex == 2) {
			return row.getColumn1();
		} else if (columnIndex == 3) {
			return row.getColumn2();
		} else if (columnIndex == 4) {
			return row.getColumn3();
		} else if (columnIndex == 5) {
			return row.getColumn4();
		} else if (columnIndex == 6) {
			return  row.getVictories();
		} else if (columnIndex == 7) {
			return row.getTouchesScored();
		} else if (columnIndex == 8) {
			return row.getTouchesReceived();
		} else if (columnIndex == 9) {
			return row.getIndicator();
		} else if (columnIndex == 10) {
			return row.getPlace();
		}
		return null;
	}
	
	
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		
		Fencer row = fencerList.get(rowIndex);
		
		if (columnIndex == 0 && isValidNumeric(aValue)) {
			row.setName( (String) aValue );
		} else if (columnIndex == 1 && isValidNumeric(aValue)) {
			row.setNumber( (String) aValue );
		} else if (columnIndex == 2 && isValidNumeric(aValue)) {
			row.setColumn1( (String) aValue );
		} else if (columnIndex == 3 && isValidNumeric(aValue)) {
			row.setColumn2( (String) aValue );
		} else if (columnIndex == 4 && isValidNumeric(aValue)) {
			row.setColumn3( (String) aValue );
		} else if (columnIndex == 5 && isValidNumeric(aValue)) {
			row.setColumn4( (String) aValue );
		} else if (columnIndex == 6 && isValidNumeric(aValue)) {
			row.setVictories( (String) aValue );
		} else if (columnIndex == 7 && isValidNumeric(aValue)) {
			row.setTouchesScored( (String) aValue );
		} else if (columnIndex == 8 && isValidNumeric(aValue)) {
			row.setTouchesReceived( (String) aValue );
		} else if (columnIndex == 9 && isValidNumeric(aValue)) {
			row.setIndicator( (String) aValue );
		} else if (columnIndex == 10 && isValidNumeric(aValue)) {
			row.setPlace( (String) aValue );
		} else {
			JOptionPane.showMessageDialog(null, "Please enter a valid score", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public boolean isValidNumeric(Object aValue) {
		try {
			int num = Integer.parseInt((String) aValue);  
			return num >=0 ? true  : false;
		} catch (NumberFormatException e) {
			return false;
		}
	}
	
	public boolean isCellEditable (int rowIndex, int colIndex) {
		return true;
	}
}
