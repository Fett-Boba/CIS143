package com.olympic.cis143.touchemvc.view;

import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

import com.olympic.cis143.touchemvc.model.Fencer;
import com.olympic.cis143.touchemvc.model.FencerTable;

public class ToucheMVC extends JFrame {

	public ToucheMVC() {
		
		// Create empty default table
		Fencer row1 = new Fencer();
		Fencer row2 = new Fencer();
		Fencer row3 = new Fencer();
		Fencer row4 = new Fencer();
		
		// Build the list of fencers
		List<Fencer> fencerList = new ArrayList<>();
		fencerList.add(row1);
		fencerList.add(row2);
		fencerList.add(row3);
		fencerList.add(row4);
		
		// Create the model and table
		FencerTable model = new FencerTable(fencerList);
		JTable table = new JTable(model);
		table.setCellSelectionEnabled(true);
		table.setValueAt("5", 0,0);
		
		// Add table to the frame
		add(new JScrollPane(table));
		setTitle("Touche MVC");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	
	}


	
	
	public static void main(String[] args) {
		new ToucheMVC();
	}

}
