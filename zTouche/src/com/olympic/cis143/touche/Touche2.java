package com.olympic.cis143.touche;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class Touche2 {
	
	static final int MAX_FENCERS = 8;
	static final int MIN_FENCERS = 4;
	static final int PX_25 = 25;
	static final int PX_35 = 35;
	static final int PX_38 = 38;
	static final int PX_50 = 50;
	static final int PX_70 = 70;

	private JFrame frame;
	private JTextField txtTournamentName;
	private JTextField txtTournamentDate;
	private List <Fencer> fencers = new ArrayList<>();
	private int ID = 1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Touche2 window = new Touche2();
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
	public Touche2() {
		initialize();
	}

	/**
	 * Init.
	 */
	private void initialize() {

		// SETUP FRAME

		frame = new JFrame();
		frame.setTitle("Touche");
		frame.setBounds(100, 100, 1049, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		
		
		// TOURNAMENT PANEL

		JPanel pnlTournament = new JPanel();
		pnlTournament.setBounds(0, 0, 238, 213);
		frame.getContentPane().add(pnlTournament);
		pnlTournament.setLayout(null);

		JLabel lblNewLabel = new JLabel("Tournament Name");
		lblNewLabel.setBounds(23, 28, 186, 14);
		pnlTournament.add(lblNewLabel);

		txtTournamentName = new JTextField();
		txtTournamentName.setBounds(23, 46, 186, 20);
		pnlTournament.add(txtTournamentName);
		txtTournamentName.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Tournament Date");
		lblNewLabel_1.setBounds(23, 77, 186, 14);
		pnlTournament.add(lblNewLabel_1);

		txtTournamentDate = new JTextField();
		txtTournamentDate.setBounds(23, 94, 186, 20);
		pnlTournament.add(txtTournamentDate);
		txtTournamentDate.setColumns(10);

		JButton btnTournamentOK = new JButton("OK");
		btnTournamentOK.setBounds(23, 131, 89, 23);
		pnlTournament.add(btnTournamentOK);

		
		
		// FENCER PANEL

		JPanel pnlFencers = new JPanel();
		pnlFencers.setBounds(0, 212, 238, 313);
		frame.getContentPane().add(pnlFencers);
		pnlFencers.setLayout(null);

		JTextPane txtpnEnterFencersNames = new JTextPane();
		txtpnEnterFencersNames.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtpnEnterFencersNames.setText("Enter fencer's names in the same order they appear on the pool sheet.");
		txtpnEnterFencersNames.setBounds(22, 10, 185, 50);
		pnlFencers.add(txtpnEnterFencersNames);

		JButton btnFencersOK = new JButton("OK");
		btnFencersOK.setBounds(22, 279, 89, 23);
		pnlFencers.add(btnFencersOK);

		JTextField[] txt = new JTextField[MAX_FENCERS];
		int z = PX_70;
		for (int i = 0; i < MAX_FENCERS; i++) {					
			txt[i] = new JTextField();
			txt[i].setColumns(20);
			txt[i].setBounds(20,z,190,20);
			pnlFencers.setVisible(false);
			pnlFencers.add(txt[i]);
			z = z + PX_25;
		}
		
		// SCORE FENCERS PANEL
		
		// SCORE TABLEAU PANEL
		
		JPanel pnlScoresTableau = new JPanel();
		pnlScoresTableau.setBounds(242, 0, 565, 399);
		frame.getContentPane().add(pnlScoresTableau);
		pnlScoresTableau.setLayout(null);
		pnlScoresTableau.setVisible(true);
		pnlScoresTableau.setBackground(Color.WHITE);
		
		JButton btnCalcScore = new JButton("Calculate");
		btnCalcScore.setBounds(466, 11, 89, 23);
		pnlScoresTableau.add(btnCalcScore);

		// Build 8x8 tableau
		JTextField[][] txtTab = new JTextField[MAX_FENCERS][MAX_FENCERS];
		int x = PX_50;
		int y = PX_50; 
		for (int i = 0; i < MAX_FENCERS; i++) {					
			for (int j = 0; j < MAX_FENCERS; j++) {
				txtTab[i][j] = new JTextField();
				txtTab[i][j].setBounds(x, y, PX_35, PX_35);
				txtTab[i][j].setHorizontalAlignment(JTextField.CENTER);
				txtTab[i][j].setVisible(false);
				if (i == j) { 
					txtTab[i][j].setBackground(Color.BLACK);
					txtTab[i][j].setEditable(false);
				}
				pnlScoresTableau.add(txtTab[i][j]);
				x += PX_38;
			}
			x = PX_50;
			y += PX_38;
		}
		
		// ACTIONS

		// Tournament "OK" button listener
		btnTournamentOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnlFencers.setVisible(true);
				Tournament myTournament = new Tournament(txtTournamentName.getText(), txtTournamentDate.getText());
				System.out.println(myTournament.toString());
			}
		});

		// Fencers "OK" button listener
		btnFencersOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < MAX_FENCERS; i++) {		
					if (! txt[i].getText().isEmpty()) {
						fencers.add(new Fencer(ID, txt[i].getText()));
						ID++;
					}
				}
				if (fencers.size() < MIN_FENCERS) {
					JOptionPane.showMessageDialog(null, "There must be 4 to 8 fencers in a pool.","ERROR", JOptionPane.ERROR_MESSAGE);
				}
				System.out.println(fencers.toString());				
				
				for (int i = 0; i < fencers.size(); i++) {	
					for (int j = 0; j < fencers.size(); j++) {
						txtTab[i][j].setVisible(true);
					}
				}
			
				
			}
		});

		// Calculate scores
		btnCalcScore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
			
			
			}
		});

		

	}
}
