package com.olympic.cis143.touche;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
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
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class Touche extends JPanel implements ActionListener {
	
	final static String TOURNAMENT = "Tournament";
	final static String FENCERS = "Fencers";
	final static String TABLEAU = "Tableau";
	final static int MAX_FENCERS = 8;
	final static int MIN_FENCERS = 4;
	
	private int numFencers = 0;
	private JTabbedPane tabbedPane = new JTabbedPane();
	private ButtonGroup buttonGroup = new ButtonGroup();
	private List<Fencer> alFencers = new ArrayList<>();
	
	public void addComponentToPane(Container pane) {
		
		// ----------------------COMPONENTS----------------------
		
		// Tournament Card - basic info about the tournament
		JPanel card1 = new JPanel();
		
		JTextField txtTournamentName = new JTextField(20);
		JTextField txtTournamentDate = new JTextField(20);
		
		JRadioButton btnRad4 = new JRadioButton("4");
		buttonGroup.add(btnRad4);
		btnRad4.setSelected(true);
		
		JRadioButton btnRad5 = new JRadioButton("5");
		buttonGroup.add(btnRad5);
	
		JRadioButton btnRad6 = new JRadioButton("6");
		buttonGroup.add(btnRad6);
	
		JRadioButton btnRad7 = new JRadioButton("7");
		buttonGroup.add(btnRad7);
	
		JRadioButton btnRad8 = new JRadioButton("8");
		buttonGroup.add(btnRad8);

		JButton btnTournamentOK = new JButton("OK");
		
		card1.add(txtTournamentName);
		card1.add(txtTournamentDate);
		card1.add(btnRad4);
		card1.add(btnRad5);
		card1.add(btnRad6);
		card1.add(btnRad7);
		card1.add(btnRad8);
		card1.add(btnTournamentOK);
		
		
		
		// Fencer card - build out empty fields for 8 fencers, and set to not visible 
		JPanel card2 = new JPanel();
		
		card2.setLayout(new GridBagLayout());
		GridBagConstraints gbc2 = new GridBagConstraints();
		gbc2.fill = GridBagConstraints.HORIZONTAL;
		gbc2.weighty = 0;   
		gbc2.insets = new Insets(10,10,0,0);  // padding
		gbc2.gridwidth = 1;   
		gbc2.gridheight = 1;
		
		JTextField [] txtFencers  = new JTextField[MAX_FENCERS] ;
		JLabel [] lbl = new JLabel[MAX_FENCERS];
		
		for (int i = 0; i < MAX_FENCERS; i++) {			
			lbl[i] = new JLabel(); 
			lbl[i].setText("Fencer" + (i+1) + ":");
			lbl[i].setVisible(false);
			gbc2.gridx = 0;
			gbc2.gridy = i;
			card2.add(lbl[i], gbc2);
			
			txtFencers[i] = new JTextField(20);
			txtFencers[i].setVisible(false);
			gbc2.gridx = 1;
			gbc2.gridy = i;       
			card2.add(txtFencers[i], gbc2);
		}
		JButton btnFencerOK = new JButton("OK");
		gbc2.gridy = 9;
		card2.add(btnFencerOK, gbc2);

		// Tableau card - build out empty 8x8 tableau (fencers and scores)

		
		
		
		
		JPanel card3 = new JPanel();
		
		
		
		JLabel [] lblFencers = new JLabel[MAX_FENCERS];
		JTextField [][] txtScores = new JTextField[MAX_FENCERS][MAX_FENCERS];
		
		for (int i = 0; i < MAX_FENCERS; i++) {
			// empty labels to house fencer names
			lblFencers[i] = new JLabel();
			lblFencers[i].setVisible(false);
			card3.add(lblFencers[i]);
			// empty grid for scores
			for (int j = 0; j < MAX_FENCERS; j++) {
				txtScores[i][j] = new JTextField(2);
				txtScores[i][j].setVisible(true);
				txtScores[i][j].setHorizontalAlignment(JTextField.CENTER);
				card3.add(txtScores[i][j]);
			}
		}
		JButton btnCalculate = new JButton("Calcuate");
		card3.add(btnCalculate);
		
		
		// Add the cards to the tabbed pane
		tabbedPane.addTab(TOURNAMENT, card1);
		tabbedPane.addTab(FENCERS, card2);
		tabbedPane.addTab(TABLEAU, card3);
		pane.add(tabbedPane, BorderLayout.CENTER);	
		
		
		
		// ----------------------ACTIONS----------------------
		
		// Tournament - OK Button Listener
		btnTournamentOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				tabbedPane.setSelectedIndex(1);
				
				if (btnRad4.isSelected()) {
					numFencers = 4;
				} else if (btnRad5.isSelected()) {
					numFencers = 5;
				} else if (btnRad6.isSelected()) {
					numFencers = 6;
				} else if (btnRad7.isSelected()) {
					numFencers = 7;
				} else {
					numFencers = 8;
				}

				// Populate the tournament obj
				Tournament myTournament = new Tournament(txtTournamentName.getText(), txtTournamentDate.getText(), numFencers);
				
				// Make labels and  textfields on fencer tab visible based on # fencers in the tournament
				for (int i = 0; i < numFencers; i++) {
					lbl[i].setVisible(true);
					txtFencers[i].setVisible(true);
				}
			}
		});
	
		
		
		// Fencers - OK button listener 
		btnFencerOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Put user entered fencer objects into arraylist of fencers.
				for (int i = 0; i < numFencers; i++) {
					lblFencers[i].setVisible(true);
					if (txtFencers[i].getText().isEmpty()) {
						alFencers.add(new Fencer(i + 1, "Fencer" + (i+1)));
						lblFencers[i].setText( "Fencer" + (i+1) );
						card3.add(lblFencers[i]);
					} else {
						alFencers.add(new Fencer(i + 1, txtFencers[i].getText()));
						lblFencers[i].setText( txtFencers[i].getText() );
						card3.add(lblFencers[i]);
					}
					
					
					
					
					
					// Create the grid of scores	
					for (int j = 0; j < numFencers; j++) {
						txtScores[i][j].setVisible(true);
						if (i == j) {
							txtScores[i][j].setEditable(false);
							txtScores[i][j].setBackground(Color.BLACK);
						}
					}
					
					
					
					
					
				}
				tabbedPane.setSelectedIndex(2);
			}
		});

		// Tableau - Calculate scores button Listener
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
			/**
			  	
			Check entire grid has values
			
			FENCER1: Check row1 / col1 that all are populated:
			
			i,j against j,i: 
				if i,j > j,i --> victory
				add up i=1, j=1-3 --> Touches scored
				add up j=1, i=1-3 --> Touches received
				row i TS - TR  --> Indicator
				 
			*/
			
			
			
			}
		});
		
	}

	private static void createAndShowGUI() {
		JFrame frame = new JFrame("Touche");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Touche window = new Touche();
		window.addComponentToPane(frame.getContentPane());
		frame.pack();
		frame.setVisible(true);
		frame.setBounds(100, 100, 800, 600);
		frame.setResizable(false);
		
	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	}
}