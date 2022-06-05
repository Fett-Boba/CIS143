package com.olympic.cis143.touche;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelFencers extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtFencer1;
	private JTextField txtFencer2;
	private JTextField txtFencer3;
	private JTextField txtFencer4;

	public PanelFencers() {
		
		txtFencer1 = new JTextField();
		add(txtFencer1);
		txtFencer1.setColumns(10);
		
		txtFencer2 = new JTextField();
		add(txtFencer2);
		txtFencer2.setColumns(10);
		
		txtFencer3 = new JTextField();
		add(txtFencer3);
		txtFencer3.setColumns(10);
		
		txtFencer4 = new JTextField();
		add(txtFencer4);
		txtFencer4.setColumns(10);
		
		JButton btnAddFencers = new JButton("Add Fencers");
		add(btnAddFencers);

		btnAddFencers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("HI FENCERS");
			}
		});

	}
}
