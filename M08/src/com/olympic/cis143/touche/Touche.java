package com.olympic.cis143.touche;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Touche {

	private JFrame frame;
	private JTextField txtTournamentName;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Touche window = new Touche();
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
	public Touche() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		// FRAME SETUP
		
		frame = new JFrame();
		frame.setBounds(100, 100, 679, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		
		// TOURNAMENT PANEL 
		
		JPanel pnlTournament = new JPanel();
		frame.getContentPane().add(pnlTournament, "tournament");
		pnlTournament.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		txtTournamentName = new JTextField();
		//txtTournamentName.setBorder(new EmptyBorder(0, 0, 0, 0));
		txtTournamentName.setText("My Tournament");
		pnlTournament.add(txtTournamentName);
		txtTournamentName.setColumns(20);
		
		JRadioButton rb4 = new JRadioButton("4");
		buttonGroup.add(rb4);
		rb4.setSelected(true);
		pnlTournament.add(rb4);
		
		JRadioButton rb5 = new JRadioButton("5");
		buttonGroup.add(rb5);
		pnlTournament.add(rb5);
		
		JRadioButton rb6 = new JRadioButton("6");
		buttonGroup.add(rb6);
		pnlTournament.add(rb6);
		
		JRadioButton rb7 = new JRadioButton("7");
		buttonGroup.add(rb7);
		pnlTournament.add(rb7);
		
		JRadioButton rb8 = new JRadioButton("8");
		buttonGroup.add(rb8);
		pnlTournament.add(rb8);
		
		JButton btnTournamentOK = new JButton("OK");
		pnlTournament.add(btnTournamentOK);
		
		
		// SCORES PANEL 
		
		JPanel pnlScores = new JPanel();
		frame.getContentPane().add(pnlScores, "scores");
		pnlScores.setLayout(null);
		
		
		// Header subpanel
		JPanel pnlHeader = new JPanel();
		pnlHeader.setBounds(20, 11, 612, 56);
		pnlScores.add(pnlHeader);
		pnlHeader.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblTournamentName = new JLabel("");
		lblTournamentName.setFont(new Font("Tahoma", Font.BOLD, 15));
		pnlHeader.add(lblTournamentName);

		// Subpanel for "Names" text field
		JPanel pnlName = new JPanel();
		pnlName.setBounds(20, 78, 196, 26);
		pnlScores.add(pnlName);
		
		txtName = new JTextField();
		txtName.setEditable(false);
		txtName.setText("Name");
		txtName.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtName.setColumns(6);
		txtName.setBorder(new EmptyBorder(0, 0, 0, 0));
		pnlName.add(txtName);

		// Subpanel for Grid column numbers
		JPanel pnlGridNums = new JPanel();
		pnlGridNums.setBounds(226, 78, 233, 26);
		pnlScores.add(pnlGridNums);
		pnlGridNums.setLayout(new GridLayout(0, 8, 0, 0));
		
		JTextField [] txtGridColNums = new JTextField[8];
		for (int i = 0; i < 8; i++) {
			txtGridColNums[i] = new JTextField(3);
			txtGridColNums[i].setText("" + (i+1));
			txtGridColNums[i].setFont(new Font("Tahoma", Font.BOLD, 11));
			txtGridColNums[i].setEditable(false);
			txtGridColNums[i].setHorizontalAlignment(JTextField.CENTER);
			txtGridColNums[i].setBorder(new EmptyBorder(0, 0, 0, 0));
			txtGridColNums[i].setVisible(true);
			pnlGridNums.add(txtGridColNums[i]);
		}
		
		
		// Subpanel for calculations column names
		JPanel pnlScoreCalcs = new JPanel();
		pnlScoreCalcs.setBounds(467, 78, 165, 26);
		pnlScores.add(pnlScoreCalcs);
		pnlScoreCalcs.setLayout(new GridLayout(0, 5, 0, 0));
		
		JTextField[] txtCalcColNames = new JTextField[5];
		for (int i = 0; i < 5; i++) {
			txtCalcColNames[i] = new JTextField(3);
			txtCalcColNames[i].setFont(new Font("Tahoma", Font.BOLD, 11));
			txtCalcColNames[i].setEditable(false);
			txtCalcColNames[i].setHorizontalAlignment(JTextField.CENTER);
			txtCalcColNames[i].setBorder(new EmptyBorder(0, 0, 0, 0));
			txtCalcColNames[i].setVisible(true);
			if (i == 0) txtCalcColNames[i].setText("V");
			if (i == 1) txtCalcColNames[i].setText("TS");
			if (i == 2) txtCalcColNames[i].setText("TR");
			if (i == 3) txtCalcColNames[i].setText("Ind");
			if (i == 4) txtCalcColNames[i].setText("Pl");
			pnlScoreCalcs.add(txtCalcColNames[i]);
		}
		
		
		// Left subpanel (Fencer names and numbers)
		JPanel pnlLeft = new JPanel();
		pnlLeft.setBounds(20, 108, 196, 206);
		pnlScores.add(pnlLeft);

		JTextField [] txtFencers  = new JTextField[8] ;
		JLabel [] lblFencerNums = new JLabel[8];
		for (int i = 0; i < 8; i++) {			
			txtFencers[i] = new JTextField(15);
			txtFencers[i].setVisible(true);
			txtFencers[i].setText("Fencer" + (i+1));
			lblFencerNums[i] = new JLabel(""+ (i+1));
			pnlLeft.add(txtFencers[i]);
			pnlLeft.add(lblFencerNums[i]);
		}
		
		// Center subpanel (Grid)
		JPanel pnlCenter = new JPanel();
		pnlCenter.setBounds(226, 108, 233, 206);
		pnlScores.add(pnlCenter);
		pnlCenter.setLayout(new GridLayout(8, 8, 0, 0));

		JTextField [][] txtGrid = new JTextField[8][8];
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				txtGrid[i][j] = new JTextField(3);
				txtGrid[i][j].setVisible(true);
				txtGrid[i][j].setHorizontalAlignment(JTextField.CENTER);
				if (i == j) {
					txtGrid[i][j].setBackground(Color.BLACK);
					txtGrid[i][j].setEditable(false);
				}
				pnlCenter.add(txtGrid[i][j]);
			}
		}

		
		// Right Subpanel (Calculations)
		JPanel pnlRight = new JPanel();
		pnlRight.setBounds(469, 108, 163, 206);
		pnlScores.add(pnlRight);
		pnlRight.setLayout(new GridLayout(8, 5, 0, 0));

		JTextField [][] txtCalcs = new JTextField[8][5];
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 5; j++) {
				txtCalcs[i][j] = new JTextField(3);
				txtCalcs[i][j].setVisible(true);
				pnlRight.add(txtCalcs[i][j]);
			}
		}

		
		// LISTENER: Tournament panel OK button. 
		
		btnTournamentOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Generate Tournament obj
				
				Tournament tournament = new Tournament();
				tournament.setTournamentName(txtTournamentName.getText());

				if (rb4.isSelected()) {
					tournament.setNumFencers(4);
				} else if (rb5.isSelected()) {
					tournament.setNumFencers(5);
				} else if (rb6.isSelected()) {
					tournament.setNumFencers(6);
				} else if (rb7.isSelected()) {
					tournament.setNumFencers(7);
				} else {
					tournament.setNumFencers(8);
				}
				
				System.out.println(tournament.toString());
				pnlTournament.setVisible(false);
				pnlScores.setVisible(true);
				lblTournamentName.setText(tournament.getTournamentName());
				
				
			}
		});
		
	}
}
