package com.olympic.cis143.student.touche.gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Main extends JFrame {
	
	 public static void main(String[] argv) throws Exception {
		    DefaultTableModel model = new DefaultTableModel();
		    JTable table = new JTable(model);

		    model.addColumn("Col1");
		    model.addColumn("Col2");
		    model.addColumn("col3");
		    
		    model.setNumRows(5);

		    JFrame f = new JFrame();
		    f.setSize(300, 300);
		    f.add(new JScrollPane(table));
		    f.setVisible(true);
		  }
	
}
