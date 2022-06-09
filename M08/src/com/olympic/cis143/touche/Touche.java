package com.olympic.cis143.touche;


/*
 *  Still brutishly brute forced and fugly, but now it is a little less
 *  hard coded.  
 *  
 *  Priorities: 
 *  
 *  1. Need to calculate the places.  Ridiculous that I don't have an immediate
 *  idea of how to approach.  Need to ponder a key/value hashmap or something 
 *  get out of array brain maybe. 
 *  
 *  2. Need to do something totally different with the button 
 *  listeners since they are identical except for two lines. There absolutely   
 *  is a better way.  I just need to research implementing listeners.
 *   
 *  3. Validity checks would be good too (i.e. isValid method)
 *  	- 0 <= score <= 5
 *  	- no empties
 *  	- no non numeric.
 *  
 *  4. Super nice to have would be to get rid of the individual calculate
 *  buttons, and automatically detect when a user has completed a row or column.
 *  Maybe I could use the action where it knows when a field has been entered 
 *  or exited and then check the whole row for valid scores.
 */


import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Touche {

	private JFrame frame;
	private JTextField txtTournamentName;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtName;
	private int numFencers;
	private JTextField [] txtFencers = new JTextField[8];
	private JTextField [][] txtGrid = new JTextField[8][8];
	private JTextField [][] txtCalcs = new JTextField[8][5];
	private List <Fencer> fencerList = new ArrayList<>();


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

	// Check if valid numerics entered for bouts.  Nice to have (time constraint).
	private boolean isValid(String s) {
		try {
			Integer.parseInt(s);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		// FRAME SETUP

		frame = new JFrame();
		frame.setBounds(100, 100, 832, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));


		// TOURNAMENT PANEL 

		JPanel pnlTournament = new JPanel();
		frame.getContentPane().add(pnlTournament, "tournament");
		pnlTournament.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		txtTournamentName = new JTextField();
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
		pnlHeader.setBounds(20, 11, 775, 56);
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
			txtGridColNums[i].setVisible(false);	// dont display it until we know how many fencers we have
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
			txtCalcColNames[i].setVisible(false);	// dont display it until we know how many fencers we have
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
		JLabel [] lblFencerNums = new JLabel[8];
		for (int i = 0; i < 8; i++) {			
			txtFencers[i] = new JTextField(15);
			txtFencers[i].setVisible(false);		// dont display it until we know how many fencers we have
			txtFencers[i].setText("Fencer" + (i+1));
			lblFencerNums[i] = new JLabel(""+ (i+1));
			lblFencerNums[i].setVisible(false); 	// dont display it until we know how many fencers we have
			pnlLeft.add(txtFencers[i]);
			pnlLeft.add(lblFencerNums[i]);
		}

		// Center subpanel (Grid)
		JPanel pnlCenter = new JPanel();
		pnlCenter.setBounds(226, 108, 233, 206);
		pnlScores.add(pnlCenter);
		pnlCenter.setLayout(new GridLayout(8, 8, 0, 0));
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				txtGrid[i][j] = new JTextField(3);
				txtGrid[i][j].setVisible(false);	// dont display it until we know how many fencers we have
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
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 5; j++) {
				txtCalcs[i][j] = new JTextField(3);
				txtCalcs[i][j].setVisible(false);	// dont display it until we know how many fencers we have
				pnlRight.add(txtCalcs[i][j]);
			}
		}

		// Calculate Indicator Button Panel
		JPanel pnlButtons = new JPanel();
		pnlButtons.setBounds(642, 108, 153, 206);
		pnlScores.add(pnlButtons);
		pnlButtons.setLayout(new GridLayout(8, 1, 0, 0));

		JButton btnF1 = new JButton("Calculate Indicator");
		pnlButtons.add(btnF1);

		JButton btnF2 = new JButton("Calculate Indicator");
		pnlButtons.add(btnF2);

		JButton btnF3 = new JButton("Calculate Indicator");
		pnlButtons.add(btnF3);

		JButton btnF4 = new JButton("Calculate Indicator");
		pnlButtons.add(btnF4);

		JButton btnF5 = new JButton("Calculate Indicator");
		btnF5.setVisible(false); 	// dont display it until we know how many fencers we have
		pnlButtons.add(btnF5);

		JButton btnF6 = new JButton("Calculate Indicator");
		btnF6.setVisible(false); 	// dont display it until we know how many fencers we have
		pnlButtons.add(btnF6);

		JButton btnF7 = new JButton("Calculate Indicator");
		btnF7.setVisible(false); 	// dont display it until we know how many fencers we have
		pnlButtons.add(btnF7);

		JButton btnF8 = new JButton("Calculate Indicator");
		btnF8.setVisible(false); 	// dont display it until we know how many fencers we have
		pnlButtons.add(btnF8);

		// Trailer Sub Panel

		JPanel pnlTrailer = new JPanel();
		pnlTrailer.setBounds(20, 323, 775, 81);
		pnlScores.add(pnlTrailer);

		JButton btnCompletePool = new JButton("Complete Pool");
		pnlTrailer.add(btnCompletePool);



		// LISTENER: Tournament panel OK button. 

		btnTournamentOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Generate Tournament object

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
				numFencers = tournament.getNumFencers();  
				pnlTournament.setVisible(false);
				pnlScores.setVisible(true);
				lblTournamentName.setText(tournament.getTournamentName());


				// Generate the tableau based on the number of fencers by setting fields visible

				for (int i = 0; i < tournament.getNumFencers(); i++) {
					txtGridColNums[i].setVisible(true);
					txtFencers[i].setVisible(true);
					lblFencerNums[i].setVisible(true);
					for (int j = 0; j < tournament.getNumFencers(); j++) {
						txtGrid[i][j].setVisible(true);
					}
				}
				// Probably could incorporate into above loop but I have a funky bug 
				// when # of fencers = 4 with the places column not displaying. Research later
				for (int i = 0; i < tournament.getNumFencers(); i++) {
					for (int j = 0; j <5; j++) {
						txtCalcs[i][j].setVisible(true);
						txtCalcColNames[j].setVisible(true);
					}
				}
				// Set buttons visible as needed when more than 4 fencers
				switch (tournament.getNumFencers()) {
				case 5: 
					btnF5.setVisible(true);	
					break;
				case 6: 
					btnF5.setVisible(true);	
					btnF6.setVisible(true);
					break;
				case 7: 
					btnF5.setVisible(true);	
					btnF6.setVisible(true);
					btnF7.setVisible(true);
					break;
				case 8: 
					btnF5.setVisible(true);
					btnF6.setVisible(true);
					btnF7.setVisible(true);
					btnF8.setVisible(true);
					break;
				default: 
					break;
				}
			}
		});














		// LISTENER: Calculate indicator buttons.  
		// Nice to have: make sure touches scored/received are completed, otherwise pop an error message. 
		// Right now there is no validity checks :(
		// And there MUST be a better way to do listeners than this.  Way too repetitive.  But later, if time permits

		btnF1.addActionListener(new ActionListener()  {
			public void actionPerformed(ActionEvent e) {
				List <Integer> scoresRow = new ArrayList<>();
				List <Integer> scoresCol = new ArrayList<>();
				Fencer f = new Fencer();
				f.setFencerNum(1);
				f.setName(txtFencers[f.getFencerNum() - 1].getText());

				// probably a crafter way to get touches scored and touches rec'd 
				// in one for loop but need time to ponder flipping the row/col... Doing it with 2 loops for now
				for (int col = 0; col < numFencers; col++) {
					int row = f.getFencerNum()-1;
					int score = 0;
					if (! (row == col)) {
						score = Integer.parseInt(txtGrid[row][col].getText());
						scoresRow.add(score);
					}
				}
				for (int row = 0; row < numFencers; row++) {
					int col = f.getFencerNum()-1;
					int score = 0;
					if (! (row == col)) {
						score = Integer.parseInt(txtGrid[row][col].getText());
						scoresCol.add(score);
					}
				}

				// populate the Fencer obj
				f.setAlTs(scoresRow);
				f.setAlTr(scoresCol);
				f.setVictories(f.calculateVictories());
				f.setTouchesScored(f.calculateTouchesScored());
				f.setTouchesReceived(f.calculateTouchesReceived());
				f.setIndicator(f.calculateIndicator());
				fencerList.add(f);		// add fencer object to an array list of fencers for later


				// populate the calculations for indicators
				for (int col = 0; col < 5; col++) {
					int row = 0;
					switch (col) {
					case 0:	txtCalcs[row][col].setText(String.valueOf(f.getVictories())); break; 
					case 1:	txtCalcs[row][col].setText(String.valueOf(f.getTouchesScored())); break;
					case 2:	txtCalcs[row][col].setText(String.valueOf(f.getTouchesReceived())); break;
					case 3:	txtCalcs[row][col].setText(String.valueOf(f.getIndicator())); break;
					default: txtCalcs[row][col].setText(""); break;
					}
				}

			}
		});

		btnF2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				List <Integer> scoresRow = new ArrayList<>();
				List <Integer> scoresCol = new ArrayList<>();
				Fencer f = new Fencer();
				f.setFencerNum(2);
				f.setName(txtFencers[f.getFencerNum() - 1].getText());

				// probably a craftier way to get touches scored and touches rec'd 
				// in one for loop but need time to ponder flipping the row/col... Doing it with 2 loops for now
				for (int col = 0; col < numFencers; col++) {
					int row = f.getFencerNum()-1;
					int score = 0;
					if (! (row == col)) {
						score = Integer.parseInt(txtGrid[row][col].getText());
						scoresRow.add(score);
					}
				}
				for (int row = 0; row < numFencers; row++) {
					int col = f.getFencerNum()-1;
					int score = 0;
					if (! (row == col)) {
						score = Integer.parseInt(txtGrid[row][col].getText());
						scoresCol.add(score);
					}
				}

				// populate the Fencer obj
				f.setAlTs(scoresRow);
				f.setAlTr(scoresCol);
				f.setVictories(f.calculateVictories());
				f.setTouchesScored(f.calculateTouchesScored());
				f.setTouchesReceived(f.calculateTouchesReceived());
				f.setIndicator(f.calculateIndicator());
				fencerList.add(f);		// add fencer object to an array list of fencers for later

				// population the calculations for indicators
				for (int col = 0; col < 5; col++) {
					int row = 1;
					switch (col) {
					case 0:	txtCalcs[row][col].setText(String.valueOf(f.getVictories())); break; 
					case 1:	txtCalcs[row][col].setText(String.valueOf(f.getTouchesScored())); break;
					case 2:	txtCalcs[row][col].setText(String.valueOf(f.getTouchesReceived())); break;
					case 3:	txtCalcs[row][col].setText(String.valueOf(f.getIndicator())); break;
					default: txtCalcs[row][col].setText(""); break;
					}
				}

			}
		});

		btnF3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				List <Integer> scoresRow = new ArrayList<>();
				List <Integer> scoresCol = new ArrayList<>();
				Fencer f = new Fencer();
				f.setFencerNum(3);
				f.setName(txtFencers[f.getFencerNum() - 1].getText());

				// probably a craftier way to get touches scored and touches rec'd 
				// in one for loop but need time to ponder flipping the row/col... Doing it with 2 loops for now
				for (int col = 0; col < numFencers; col++) {
					int row = f.getFencerNum()-1;
					int score = 0;
					if (! (row == col)) {
						score = Integer.parseInt(txtGrid[row][col].getText());
						scoresRow.add(score);
					}
				}
				for (int row = 0; row < numFencers; row++) {
					int col = f.getFencerNum()-1;
					int score = 0;
					if (! (row == col)) {
						score = Integer.parseInt(txtGrid[row][col].getText());
						scoresCol.add(score);
					}
				}

				// populate the Fencer obj
				f.setAlTs(scoresRow);
				f.setAlTr(scoresCol);
				f.setVictories(f.calculateVictories());
				f.setTouchesScored(f.calculateTouchesScored());
				f.setTouchesReceived(f.calculateTouchesReceived());
				f.setIndicator(f.calculateIndicator());
				fencerList.add(f);		// add fencer object to an array list of fencers for later

				// population the calculations for indicators
				for (int col = 0; col < 5; col++) {
					int row = 2;
					switch (col) {
					case 0:	txtCalcs[row][col].setText(String.valueOf(f.getVictories())); break; 
					case 1:	txtCalcs[row][col].setText(String.valueOf(f.getTouchesScored())); break;
					case 2:	txtCalcs[row][col].setText(String.valueOf(f.getTouchesReceived())); break;
					case 3:	txtCalcs[row][col].setText(String.valueOf(f.getIndicator())); break;
					default: txtCalcs[row][col].setText(""); break;
					}
				}


			}
		});

		btnF4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				List <Integer> scoresRow = new ArrayList<>();
				List <Integer> scoresCol = new ArrayList<>();
				Fencer f = new Fencer();
				f.setFencerNum(4);
				f.setName(txtFencers[f.getFencerNum() - 1].getText());

				// probably a craftier way to get touches scored and touches rec'd 
				// in one for loop but need time to ponder flipping the row/col... Doing it with 2 loops for now
				for (int col = 0; col < numFencers; col++) {
					int row = f.getFencerNum()-1;
					int score = 0;
					if (! (row == col)) {
						score = Integer.parseInt(txtGrid[row][col].getText());
						scoresRow.add(score);
					}
				}
				for (int row = 0; row < numFencers; row++) {
					int col = f.getFencerNum()-1;
					int score = 0;
					if (! (row == col)) {
						score = Integer.parseInt(txtGrid[row][col].getText());
						scoresCol.add(score);
					}
				}

				// populate the Fencer obj
				f.setAlTs(scoresRow);
				f.setAlTr(scoresCol);
				f.setVictories(f.calculateVictories());
				f.setTouchesScored(f.calculateTouchesScored());
				f.setTouchesReceived(f.calculateTouchesReceived());
				f.setIndicator(f.calculateIndicator());
				fencerList.add(f);		// add fencer object to an array list of fencers for later

				// population the calculations for indicators
				for (int col = 0; col < 5; col++) {
					int row = 3;
					switch (col) {
					case 0:	txtCalcs[row][col].setText(String.valueOf(f.getVictories())); break; 
					case 1:	txtCalcs[row][col].setText(String.valueOf(f.getTouchesScored())); break;
					case 2:	txtCalcs[row][col].setText(String.valueOf(f.getTouchesReceived())); break;
					case 3:	txtCalcs[row][col].setText(String.valueOf(f.getIndicator())); break;
					default: txtCalcs[row][col].setText(""); break;
					}
				}


			}
		});

		btnF5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				List <Integer> scoresRow = new ArrayList<>();
				List <Integer> scoresCol = new ArrayList<>();
				Fencer f = new Fencer();
				f.setFencerNum(5);
				f.setName(txtFencers[f.getFencerNum() - 1].getText());

				// probably a craftier way to get touches scored and touches rec'd 
				// in one for loop but need time to ponder flipping the row/col... Doing it with 2 loops for now
				for (int col = 0; col < numFencers; col++) {
					int row = f.getFencerNum()-1;
					int score = 0;
					if (! (row == col)) {
						score = Integer.parseInt(txtGrid[row][col].getText());
						scoresRow.add(score);
					}
				}
				for (int row = 0; row < numFencers; row++) {
					int col = f.getFencerNum()-1;
					int score = 0;
					if (! (row == col)) {
						score = Integer.parseInt(txtGrid[row][col].getText());
						scoresCol.add(score);
					}
				}

				// populate the Fencer obj
				f.setAlTs(scoresRow);
				f.setAlTr(scoresCol);
				f.setVictories(f.calculateVictories());
				f.setTouchesScored(f.calculateTouchesScored());
				f.setTouchesReceived(f.calculateTouchesReceived());
				f.setIndicator(f.calculateIndicator());
				fencerList.add(f);		// add fencer object to an array list of fencers for later

				// population the calculations for indicators
				for (int col = 0; col < 5; col++) {
					int row = 4;
					switch (col) {
					case 0:	txtCalcs[row][col].setText(String.valueOf(f.getVictories())); break; 
					case 1:	txtCalcs[row][col].setText(String.valueOf(f.getTouchesScored())); break;
					case 2:	txtCalcs[row][col].setText(String.valueOf(f.getTouchesReceived())); break;
					case 3:	txtCalcs[row][col].setText(String.valueOf(f.getIndicator())); break;
					default: txtCalcs[row][col].setText(""); break;
					}
				}


			}
		});

		btnF6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				List <Integer> scoresRow = new ArrayList<>();
				List <Integer> scoresCol = new ArrayList<>();
				Fencer f = new Fencer();
				f.setFencerNum(6);
				f.setName(txtFencers[f.getFencerNum() - 1].getText());

				// probably a craftier way to get touches scored and touches rec'd 
				// in one for loop but need time to ponder flipping the row/col... Doing it with 2 loops for now
				for (int col = 0; col < numFencers; col++) {
					int row = f.getFencerNum()-1;
					int score = 0;
					if (! (row == col)) {
						score = Integer.parseInt(txtGrid[row][col].getText());
						scoresRow.add(score);
					}
				}
				for (int row = 0; row < numFencers; row++) {
					int col = f.getFencerNum()-1;
					int score = 0;
					if (! (row == col)) {
						score = Integer.parseInt(txtGrid[row][col].getText());
						scoresCol.add(score);
					}
				}

				// populate the Fencer obj
				f.setAlTs(scoresRow);
				f.setAlTr(scoresCol);
				f.setVictories(f.calculateVictories());
				f.setTouchesScored(f.calculateTouchesScored());
				f.setTouchesReceived(f.calculateTouchesReceived());
				f.setIndicator(f.calculateIndicator());
				fencerList.add(f);		// add fencer object to an array list of fencers for later

				// population the calculations for indicators
				for (int col = 0; col < 5; col++) {
					int row = 5;
					switch (col) {
					case 0:	txtCalcs[row][col].setText(String.valueOf(f.getVictories())); break; 
					case 1:	txtCalcs[row][col].setText(String.valueOf(f.getTouchesScored())); break;
					case 2:	txtCalcs[row][col].setText(String.valueOf(f.getTouchesReceived())); break;
					case 3:	txtCalcs[row][col].setText(String.valueOf(f.getIndicator())); break;
					default: txtCalcs[row][col].setText(""); break;
					}
				}

			}
		});

		btnF7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List <Integer> scoresRow = new ArrayList<>();
				List <Integer> scoresCol = new ArrayList<>();
				Fencer f = new Fencer();
				f.setFencerNum(7);
				f.setName(txtFencers[f.getFencerNum() - 1].getText());

				// probably a craftier way to get touches scored and touches rec'd 
				// in one for loop but need time to ponder flipping the row/col... Doing it with 2 loops for now
				for (int col = 0; col < numFencers; col++) {
					int row = f.getFencerNum()-1;
					int score = 0;
					if (! (row == col)) {
						score = Integer.parseInt(txtGrid[row][col].getText());
						scoresRow.add(score);
					}
				}
				for (int row = 0; row < numFencers; row++) {
					int col = f.getFencerNum()-1;
					int score = 0;
					if (! (row == col)) {
						score = Integer.parseInt(txtGrid[row][col].getText());
						scoresCol.add(score);
					}
				}

				// populate the Fencer obj
				f.setAlTs(scoresRow);
				f.setAlTr(scoresCol);
				f.setVictories(f.calculateVictories());
				f.setTouchesScored(f.calculateTouchesScored());
				f.setTouchesReceived(f.calculateTouchesReceived());
				f.setIndicator(f.calculateIndicator());
				fencerList.add(f);		// add fencer object to an array list of fencers for later

				// population the calculations for indicators
				for (int col = 0; col < 5; col++) {
					int row = 6;
					switch (col) {
					case 0:	txtCalcs[row][col].setText(String.valueOf(f.getVictories())); break; 
					case 1:	txtCalcs[row][col].setText(String.valueOf(f.getTouchesScored())); break;
					case 2:	txtCalcs[row][col].setText(String.valueOf(f.getTouchesReceived())); break;
					case 3:	txtCalcs[row][col].setText(String.valueOf(f.getIndicator())); break;
					default: txtCalcs[row][col].setText(""); break;
					}
				}

			}
		});

		btnF8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List <Integer> scoresRow = new ArrayList<>();
				List <Integer> scoresCol = new ArrayList<>();
				Fencer f = new Fencer();
				f.setFencerNum(8);
				f.setName(txtFencers[f.getFencerNum() - 1].getText());


				// probably a craftier way to get touches scored and touches rec'd 
				// in one for loop but need time to ponder flipping the row/col... Doing it with 2 loops for now
				for (int col = 0; col < numFencers; col++) {
					int row = f.getFencerNum()-1;
					int score = 0;
					if (! (row == col)) {
						score = Integer.parseInt(txtGrid[row][col].getText());
						scoresRow.add(score);
					}
				}
				for (int row = 0; row < numFencers; row++) {
					int col = f.getFencerNum()-1;
					int score = 0;
					if (! (row == col)) {
						score = Integer.parseInt(txtGrid[row][col].getText());
						scoresCol.add(score);
					}
				}

				// populate the Fencer obj
				f.setAlTs(scoresRow);
				f.setAlTr(scoresCol);
				f.setVictories(f.calculateVictories());
				f.setTouchesScored(f.calculateTouchesScored());
				f.setTouchesReceived(f.calculateTouchesReceived());
				f.setIndicator(f.calculateIndicator());
				fencerList.add(f);		// add fencer object to an array list of fencers for later

				// populate the calculations for indicators
				for (int col = 0; col < 5; col++) {
					int row = 7;
					switch (col) {
					case 0:	txtCalcs[row][col].setText(String.valueOf(f.getVictories())); break; 
					case 1:	txtCalcs[row][col].setText(String.valueOf(f.getTouchesScored())); break;
					case 2:	txtCalcs[row][col].setText(String.valueOf(f.getTouchesReceived())); break;
					case 3:	txtCalcs[row][col].setText(String.valueOf(f.getIndicator())); break;
					default: txtCalcs[row][col].setText(""); break;
					}
				}

			}
		});


		btnCompletePool.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Collections.sort(fencerList, 
					Comparator.comparingInt(Fencer::getVictories)
					.thenComparingInt(Fencer::getIndicator).reversed());

				for (int i = 0; i < numFencers; i++) {
					fencerList.get(i).setPlace(i + 1);  // update the objects with place
				}
				
				for (int i = 0; i < numFencers; i++) {
					int fencerNum = fencerList.get(i).getFencerNum();
					txtCalcs[fencerNum - 1][4].setText(String.valueOf(fencerList.get(i).getPlace()));
				}
			}
		});

	}
}
