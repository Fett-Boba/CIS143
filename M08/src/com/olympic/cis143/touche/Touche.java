package com.olympic.cis143.touche;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Touche {

	private JFrame frame;
	private JTextField txtTournamentName;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	
	// START APP
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

	// INIT APP
	public Touche() {
		initialize();
	}

	// SETUP FRAME
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel pnlTournament = new JPanel();
		frame.getContentPane().add(pnlTournament, "tournament");
		
		JPanel pnlScores = new JPanel();
		frame.getContentPane().add(pnlScores, "scores");
		
		
		// CONTENT FOR TOURNAMENT PANEL
		
		JLabel lblTournamentName = new JLabel("Tournament Name:");
		pnlTournament.add(lblTournamentName);
		
		txtTournamentName = new JTextField();
		txtTournamentName.setText("My Tournament");
		pnlTournament.add(txtTournamentName);
		txtTournamentName.setColumns(10);
		
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
		
		
		// CREATE SCORE TABLEAU 
		
		
		
		
		
		
		
		
		
		
		
		// LISTENER: Tournament panel, get tournament info, set values in tournament class and move to next panel 
		
		btnTournamentOK.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
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
			}
		});

		
		
	}

}
