package com.olympic.cis143.student.touche.gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class DynamicJTable {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private int numFencers = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DynamicJTable window = new DynamicJTable();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DynamicJTable() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */

	private void initialize() {

		// COMPONENTS ----------------------------------------------------------

		frame = new JFrame();
		frame.setBounds(100, 100, 749, 547);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		frame.getContentPane().setLayout(null);

		// PANEL 1 ---------------------------------
		
		JPanel panel1 = new JPanel();
		panel1.setBounds(28, 22, 137, 447);
		frame.getContentPane().add(panel1);

		JRadioButton rad4 = new JRadioButton("4");
		rad4.setSelected(true);
		buttonGroup.add(rad4);
		panel1.add(rad4);

		JRadioButton rad5 = new JRadioButton("5");
		buttonGroup.add(rad5);
		panel1.add(rad5);

		JRadioButton rad6 = new JRadioButton("6");
		buttonGroup.add(rad6);
		panel1.add(rad6);

		JRadioButton rad7 = new JRadioButton("7");
		buttonGroup.add(rad7);
		panel1.add(rad7);

		JRadioButton rad8 = new JRadioButton("8");
		buttonGroup.add(rad8);
		panel1.add(rad8);

		JButton btnBuildGrid = new JButton("Build Grid");
		panel1.add(btnBuildGrid);

		// PANEL 2 ---------------------------------
		
		JPanel panel2 = new JPanel();
		panel2.setBounds(190, 22, 518, 447);
		frame.getContentPane().add(panel2);
		panel2.setLayout(null);
		
		DefaultTableModel model = new DefaultTableModel(); 			//tstest
	    JTable table = new JTable(model);							//tstest
	    //ListSelectionModel listModel = table.getSelectionModel();	//tstest
	    
		table.setBounds(116, 71, 297, 291);
		table.setRowHeight(35);
		panel2.add(table);

		// ACTIONS -------------------------------------------------------------
		
		btnBuildGrid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// See how many fencers in pool
				if (rad4.isSelected()) numFencers = 4; 
				else if (rad5.isSelected()) numFencers = 5; 
				else if (rad6.isSelected()) numFencers = 6; 
				else if (rad7.isSelected()) numFencers = 7; 
				else numFencers = 8;
				// Build the score grid based on the # of fencers dynamically and build 35x35 px cells
				model.setNumRows(numFencers);
				model.setColumnCount(numFencers);
				for (int i = 0; i < numFencers; i++) {
					table.getColumnModel().getColumn(i).setMaxWidth(35);;
				}
			}
		});

//	    listModel.addListSelectionListener(new ListSelectionListener() {
//			@Override
//			public void valueChanged(ListSelectionEvent e) {
//				if (! listModel.isSelectionEmpty()) {
//					int selectedRow = listModel.getMinSelectionIndex();
//					System.out.println(selectedRow);
//				}
//			}
//		});

		
	    
		
	}
}
