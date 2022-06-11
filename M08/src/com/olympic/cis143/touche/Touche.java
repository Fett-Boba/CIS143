package com.olympic.cis143.touche;


/*
 *  TO DO (time permitting)
 *  
 *  1. Validity check to make sure there is never a tie
 *  
 *  2. Super nice to have would be to get rid of the individual calculate
 *  buttons, and automatically detect when a user has completed a row or column.
 *  
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
import javax.swing.ImageIcon;

public class Touche implements ActionListener {

	private JFrame frame;
	private JTextField txtTournamentName;
	
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rb4 = new JRadioButton("4");
	private JRadioButton rb5 = new JRadioButton("5");
	private JRadioButton rb6 = new JRadioButton("6");
	private JRadioButton rb7 = new JRadioButton("7");
	private JRadioButton rb8 = new JRadioButton("8");
	
	private JPanel pnlTournament  = new JPanel();
	private JPanel pnlScores = new JPanel();
	
	private JTextField [] txtGridColNums = new JTextField[8];
	private JLabel [] lblFencerNums = new JLabel[8];
	private JTextField [] txtCalcColNames = new JTextField[5];
	
	private JButton btnF1 = new JButton("Fencer1 Indicator");
	private JButton btnF2 = new JButton("Fencer2 Indicator");
	private JButton btnF3 = new JButton("Fencer3 Indicator");
	private JButton btnF4 = new JButton("Fencer4 Indicator");
	private JButton btnF5 = new JButton("Fencer5 Indicator");
	private JButton btnF6 = new JButton("Fencer6 Indicator");
	private JButton btnF7 = new JButton("Fencer7 Indicator");
	private JButton btnF8 = new JButton("Fencer8 Indicator");

	private JLabel lblTournamentName = new JLabel("");
	private JTextField txtName;
	private int numFencers;
	private JTextField [] txtFencers = new JTextField[8];
	private JTextField [][] txtGrid = new JTextField[8][8];
	private JTextField [][] txtCalcs = new JTextField[8][5];
	private List <Fencer> fencerList = new ArrayList<>();
	private final JPanel pnlImage = new JPanel();
	private final JPanel pnlTournamentInfo = new JPanel();
	private final JLabel lblTname = new JLabel("Tournament Name:");
	private final JLabel lblNFencers = new JLabel("Number of fencers in pool:");
	private final JLabel lblFencerImage = new JLabel("");
	private final JPanel pnlImageLogo = new JPanel();
	private final JLabel lblLogo = new JLabel("");

//	List <Integer> scoresRow = new ArrayList<>();
//	List <Integer> scoresCol = new ArrayList<>();
	Tournament tournament = new Tournament();

	
	/**
	 * Setup the contents of the frame.
	 */
	private void initialize() {

		// CONTENT: FRAME
		
		frame = new JFrame("Touche");
		frame.setResizable(false);
		frame.setBounds(100, 100, 832, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));

		
		// CONTENT: TOURNAMENT PANEL
		
		frame.getContentPane().add(pnlTournament, "tournament");
		pnlTournament.setLayout(null);
		pnlTournament.setBackground(Color.WHITE);
		pnlImage.setBounds(53, 29, 478, 248);
		pnlImage.setBackground(Color.WHITE);
		
		pnlTournament.add(pnlImage);
		pnlImage.setLayout(null);
		lblFencerImage.setBounds(39, 5, 400, 245);
		lblFencerImage.setIcon(new ImageIcon(Touche.class.getResource("/com/olympic/cis143/touche/img/fencer400x245.png")));
		
		pnlImage.add(lblFencerImage);
		pnlTournamentInfo.setBounds(541, 29, 197, 224);
		
		pnlTournament.add(pnlTournamentInfo);
		pnlTournamentInfo.setLayout(new GridLayout(9, 1, 0, 0));
		pnlTournamentInfo.setBackground(Color.WHITE);
		
		pnlTournamentInfo.add(lblTname);
		
		txtTournamentName = new JTextField();
		pnlTournamentInfo.add(txtTournamentName);
		txtTournamentName.setText("My Tournament");
		txtTournamentName.setColumns(20);
				
		pnlTournamentInfo.add(lblNFencers);
		buttonGroup.add(rb4);
		rb4.setBackground(Color.WHITE);
		pnlTournamentInfo.add(rb4);
		rb4.setSelected(true);
		rb5.setBackground(Color.WHITE);
		pnlTournamentInfo.add(rb5);
		buttonGroup.add(rb5);
		rb6.setBackground(Color.WHITE);
		pnlTournamentInfo.add(rb6);
		buttonGroup.add(rb6);
		rb7.setBackground(Color.WHITE);
		pnlTournamentInfo.add(rb7);
		buttonGroup.add(rb7);
		rb8.setBackground(Color.WHITE);
		pnlTournamentInfo.add(rb8);
		buttonGroup.add(rb8);
						
		JButton btnTournamentOK = new JButton("OK");
		pnlTournamentInfo.add(btnTournamentOK);
		pnlImageLogo.setBackground(Color.WHITE);
		pnlImageLogo.setBounds(53, 281, 685, 100);
		
		pnlTournament.add(pnlImageLogo);
		lblLogo.setIcon(new ImageIcon(Touche.class.getResource("/com/olympic/cis143/touche/img/Touche.png")));
		
		pnlImageLogo.add(lblLogo);
		btnTournamentOK.addActionListener(this);
		pnlScores.setBackground(Color.WHITE);


		// CONTENT: SCORES PANEL (split out into multiple subpanels to manage the tableau)
		
		frame.getContentPane().add(pnlScores, "scores");
		pnlScores.setLayout(null);

		
		// SCORES PANEL: Header subpanel
		
		JPanel pnlHeader = new JPanel();
		pnlHeader.setBackground(Color.WHITE);
		pnlHeader.setBounds(20, 11, 775, 56);
		pnlScores.add(pnlHeader);
		pnlHeader.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		lblTournamentName.setFont(new Font("Tahoma", Font.BOLD, 15));
		pnlHeader.add(lblTournamentName);

		
		// SCORES PANEL: Subpanel for "Names" text field
		
		JPanel pnlName = new JPanel();
		pnlName.setBackground(Color.WHITE);
		pnlName.setBounds(20, 78, 196, 26);
		pnlScores.add(pnlName);
		
		txtName = new JTextField();
		txtName.setBackground(Color.WHITE);
		txtName.setEditable(false);
		txtName.setText("Name");
		txtName.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtName.setColumns(6);
		txtName.setBorder(new EmptyBorder(0, 0, 0, 0));
		pnlName.add(txtName);

		
		// SCORES PANEL: Subpanel for Grid column numbers
		
		JPanel pnlGridNums = new JPanel();
		pnlGridNums.setBackground(Color.WHITE);
		pnlGridNums.setBounds(226, 78, 233, 26);
		pnlScores.add(pnlGridNums);
		pnlGridNums.setLayout(new GridLayout(0, 8, 0, 0));

		for (int i = 0; i < 8; i++) {
			txtGridColNums[i] = new JTextField(3);
			txtGridColNums[i].setText("" + (i+1));
			txtGridColNums[i].setFont(new Font("Tahoma", Font.BOLD, 11));
			txtGridColNums[i].setBackground(Color.WHITE);
			txtGridColNums[i].setEditable(false);
			txtGridColNums[i].setHorizontalAlignment(JTextField.CENTER);
			txtGridColNums[i].setBorder(new EmptyBorder(0, 0, 0, 0));
			txtGridColNums[i].setVisible(false);	// dont display it until we know how many fencers we have
			pnlGridNums.add(txtGridColNums[i]);
		}

		
		// SCORES PANEL: Subpanel for calculations column names
		
		JPanel pnlScoreCalcs = new JPanel();
		pnlScoreCalcs.setBackground(Color.WHITE);
		pnlScoreCalcs.setBounds(467, 78, 165, 26);
		pnlScores.add(pnlScoreCalcs);
		pnlScoreCalcs.setLayout(new GridLayout(0, 5, 0, 0));

		for (int i = 0; i < 5; i++) {
			txtCalcColNames[i] = new JTextField(3);
			txtCalcColNames[i].setFont(new Font("Tahoma", Font.BOLD, 11));
			txtCalcColNames[i].setBackground(Color.WHITE);
			txtCalcColNames[i].setEditable(false);
			txtCalcColNames[i].setHorizontalAlignment(JTextField.CENTER);
			txtCalcColNames[i].setBorder(new EmptyBorder(0, 0, 0, 0));
			txtCalcColNames[i].setVisible(false);	// dont display it until we know how many fencers we have
			if (i == 0) txtCalcColNames[i].setText(" V");
			if (i == 1) txtCalcColNames[i].setText("TS");
			if (i == 2) txtCalcColNames[i].setText("TR");
			if (i == 3) txtCalcColNames[i].setText("Ind");
			if (i == 4) txtCalcColNames[i].setText("Pl");
			pnlScoreCalcs.add(txtCalcColNames[i]);
		}


		// SCORES PANEL: Left subpanel (Fencer names and numbers)
		
		JPanel pnlLeft = new JPanel();
		pnlLeft.setBackground(Color.WHITE);
		pnlLeft.setBounds(20, 108, 196, 206);
		pnlScores.add(pnlLeft);
		
		for (int i = 0; i < 8; i++) {			
			txtFencers[i] = new JTextField(15);
			txtFencers[i].setVisible(false);		// dont display it until we know how many fencers we have
			txtFencers[i].setText("Fencer" + (i+1));
			lblFencerNums[i] = new JLabel(""+ (i+1));
			lblFencerNums[i].setVisible(false); 	// dont display it until we know how many fencers we have
			pnlLeft.add(txtFencers[i]);
			pnlLeft.add(lblFencerNums[i]);
		}

		
		// SCORES PANEL: Center subpanel (Grid)
		
		JPanel pnlCenter = new JPanel();
		pnlCenter.setBackground(Color.WHITE);
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

		
		// SCORES PANEL: Right Subpanel (Calculations)
		
		JPanel pnlRight = new JPanel();
		pnlRight.setBackground(Color.WHITE);
		pnlRight.setBounds(469, 108, 163, 206);
		pnlScores.add(pnlRight);
		pnlRight.setLayout(new GridLayout(8, 5, 0, 0));
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 5; j++) {
				txtCalcs[i][j] = new JTextField(3);
				txtCalcs[i][j].setHorizontalAlignment(JTextField.CENTER);
				txtCalcs[i][j].setVisible(false);	// dont display it until we know how many fencers we have
				pnlRight.add(txtCalcs[i][j]);
			}
		}

		
		// SCORES PANEL: Indicator Button Panel
		
		JPanel pnlButtons = new JPanel();
		pnlButtons.setBackground(Color.WHITE);
		pnlButtons.setBounds(642, 108, 153, 206);
		pnlScores.add(pnlButtons);
		pnlButtons.setLayout(new GridLayout(8, 1, 0, 0));
		
		btnF1.addActionListener(this);
		pnlButtons.add(btnF1);
		
		btnF2.addActionListener(this);
		pnlButtons.add(btnF2);
		
		btnF3.addActionListener(this);
		pnlButtons.add(btnF3);
		
		btnF4.addActionListener(this);
		pnlButtons.add(btnF4);
		
		btnF5.addActionListener(this);
		btnF5.setVisible(false); 	// dont display it until we know how many fencers we have
		pnlButtons.add(btnF5);
		
		btnF6.addActionListener(this);
		btnF6.setVisible(false); 	// dont display it until we know how many fencers we have
		pnlButtons.add(btnF6);
		
		btnF7.addActionListener(this);
		btnF7.setVisible(false); 	// dont display it until we know how many fencers we have
		pnlButtons.add(btnF7);
		
		btnF8.addActionListener(this);
		btnF8.setVisible(false); 	// dont display it until we know how many fencers we have
		pnlButtons.add(btnF8);

		
		// SCORES PANEL: Trailer Sub Panel
		
		JPanel pnlTrailer = new JPanel();
		pnlTrailer.setBackground(Color.WHITE);
		pnlTrailer.setBounds(20, 323, 775, 81);
		pnlScores.add(pnlTrailer);
		
		JButton btnCompletePool = new JButton("Complete Pool");
		btnCompletePool.addActionListener(this);
		pnlTrailer.add(btnCompletePool);

	}

	
	// ACTIONS: Button Listener 
	
	@Override
	public void actionPerformed(ActionEvent e) {

		String buttonString = e.getActionCommand();
		
		if (buttonString.equals("Fencer1 Indicator")) {
			calculateIndicator(1);
		} else if (buttonString.equals("Fencer2 Indicator")) {
			calculateIndicator(2);
		}  else if (buttonString.equals("Fencer3 Indicator")) {
			calculateIndicator(3);
		} else if (buttonString.equals("Fencer4 Indicator")) {
			calculateIndicator(4);
		} else if (buttonString.equals("Fencer5 Indicator")) {
			calculateIndicator(5);
		} else if (buttonString.equals("Fencer6 Indicator")) {
			calculateIndicator(6);
		} else if (buttonString.equals("Fencer7 Indicator")) {
			calculateIndicator(7);
		} else if (buttonString.equals("Fencer8 Indicator")){
			calculateIndicator(8);
		} else if (buttonString.equals("Complete Pool")) {
			if (isValidTableau()) {
				fencerList.clear(); //create fresh objs in case a score changed
				for (int i = 0; i < numFencers; i++) {
					calculateIndicator(i +1);
				}
				calculatePlace();
			} else {
				JOptionPane.showMessageDialog(frame, "Score must be 0 to 5.", "Error", JOptionPane.ERROR_MESSAGE);
				return;
			}
		} else if (buttonString.equals("OK")) {
			buildTableau();
		}
	}
	
	
	// ACTIONS: create tableau based on the number of fencers
	
	public void buildTableau() {
		
		// Generate Tournament object
		Tournament tournament = new Tournament();
		tournament.setTournamentName(txtTournamentName.getText());
		

		// Collect number of fencers so we can adjust the size of the Tableau
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

		// Generate the tableau setting fields visible based on number of fencers
		for (int i = 0; i < tournament.getNumFencers(); i++) {
			txtGridColNums[i].setVisible(true);
			txtFencers[i].setVisible(true);
			lblFencerNums[i].setVisible(true);
			for (int j = 0; j < tournament.getNumFencers(); j++) {
				txtGrid[i][j].setVisible(true);
			}
		}
		// Build out the calculation side of the tableau.
		// Probably could incorporate into above loop but I have a funky bug 
		// when # of fencers = 4 with the places column not displaying. 
		// Research/resolve if time permitting
		for (int i = 0; i < tournament.getNumFencers(); i++) {
			for (int j = 0; j <5; j++) {
				txtCalcs[i][j].setVisible(true);
				txtCalcs[i][j].setEditable(false);		// Dont let user update the calculations :)
				txtCalcs[i][j].setBackground(Color.WHITE);
				txtCalcColNames[j].setVisible(true);
			}
		}
		// Set buttons visible as needed when more than 4 fencers
		switch (numFencers) {
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
	
	
	// ACTION: Calculate indicator
	public void calculateIndicator(int fNum) {

		System.out.println("In calculateIndicator ");
		
		List <Integer> scoresRow = new ArrayList<>();
		List <Integer> scoresCol = new ArrayList<>();
		
		Fencer f = new Fencer();
		f.setFencerNum(fNum);
		f.setName(txtFencers[f.getFencerNum() - 1].getText());

		// Validate touches scored for this fencer
		for (int j = 0; j < numFencers; j++) {
			if (fNum-1 != j) {
				if (isValidScore(txtGrid[(fNum-1)][j].getText())) {
					scoresRow.add(Integer.parseInt(txtGrid[(fNum-1)][j].getText()));
				} else {
					JOptionPane.showMessageDialog(frame, "Score must be 0 to 5.", "Error", JOptionPane.ERROR_MESSAGE);
					return;
				}
			}
		}
		
		// Validate touches received for this fencer
		for (int i = 0; i < numFencers; i++) {
			if (i != fNum-1) {
				if (isValidScore(txtGrid[i][(fNum-1)].getText())) {
					scoresCol.add(Integer.parseInt(txtGrid[i][(fNum-1)].getText()));
				} else {
					JOptionPane.showMessageDialog(frame, "Score must be 0 to 5.", "Error", JOptionPane.ERROR_MESSAGE);
					return;
				}
			}
		}
		
		// populate the Fencer obj
		f.setAlTs(scoresRow);
		f.setAlTr(scoresCol);
		f.setVictories(f.calculateVictories());
		f.setTouchesScored(f.calculateTouchesScored());
		f.setTouchesReceived(f.calculateTouchesReceived());
		f.setIndicator(f.calculateIndicator());
		fencerList.add(f);		// save fencer object off in a list for calculating "place" at end of pools

		// populate the calculations for indicators
		for (int col = 0; col < 5; col++) {
			int row = f.getFencerNum() - 1;
			switch (col) {
			case 0:	txtCalcs[row][col].setText(String.valueOf(f.getVictories())); break; 
			case 1:	txtCalcs[row][col].setText(String.valueOf(f.getTouchesScored())); break;
			case 2:	txtCalcs[row][col].setText(String.valueOf(f.getTouchesReceived())); break;
			case 3:	txtCalcs[row][col].setText(String.valueOf(f.getIndicator())); break;
			default: txtCalcs[row][col].setText(""); break;
			}
		}
	}
	
	
	// ACTION: Calculate what place the fencer is in.
	// If the entire tableau is filled out and all indicators calculated, determine what 
	// place the fencers came in. There is a minor bug that I have not resolved yet.  If 
	// two (or more) fencers have the same number of victories and indicators, they are 
	// supposed to tie for that place, and the next place is skipped. 
	// Will try to fix, time permitting.
	
	public void calculatePlace() {
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

	public boolean isValidTableau() {
		System.out.println("In isValidTableau()");
		int tallyGoodScores = 0;
		for (int i = 0; i < numFencers; i++) {
			for (int j = 0; j < numFencers; j++) {
				if (i != j && isValidScore(txtGrid[i][j].getText())) {
					tallyGoodScores++;
					System.out.println("[" + i+ "]" + "[" + j + "] = " + txtGrid[i][j].getText());
				}
			}
		} 
		return (tallyGoodScores == (numFencers * numFencers - numFencers)) ? true : false;
	}

	
	
	public boolean isValidScore(String s) {
		try {
			int score = Integer.parseInt(s);
			return  score >= 0  && score <= 5 ? true : false;
		} catch (NumberFormatException nfe) {
			//JOptionPane.showMessageDialog(frame, "Score must be 0 to 5.", "Error", JOptionPane.ERROR_MESSAGE);
			return false;
		}
	}
	
	/**
	 * 	Main Driver
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
	 * Create the GUI.
	 */
	public Touche() {
		initialize();
	}
}
