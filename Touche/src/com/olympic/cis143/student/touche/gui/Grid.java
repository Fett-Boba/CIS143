package com.olympic.cis143.student.touche.gui;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Grid extends JFrame {

	public Grid() {
	
		setVisible(true);
		setSize(650, 400);
		setTitle("Touche");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		Container canvas = getContentPane();
		
		JLabel lblTournamentName = new JLabel("Tournament Name");
		JLabel lblNumberFencers = new JLabel("Number of fencers in Pool");
		JLabel lblFencers = new JLabel("Enter opponents in same order as the bout sheet");
		
		JTextField txtTournamentName = new JTextField(20);
		JTextField txtNumberFencers = new JTextField(20);
		JTextField txtFencer1 = new JTextField(20);
		JTextField txtFencer2 = new JTextField(20);
		JTextField txtFencer3 = new JTextField(20);
		JTextField txtFencer4 = new JTextField(20);
		JTextField txtFencer5 = new JTextField(20);
		JTextField txtFencer6 = new JTextField(20);
		JTextField txtFencer7 = new JTextField(20);
		JTextField txtFencer8 = new JTextField(20);		
		
		
		
	}
	
	public static void main (String [] args) {
		
		new Grid();
		
	}
	
}
