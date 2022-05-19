package com.olympic.cis143.student.touche.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.CardLayout;
import javax.swing.JLayeredPane;
import java.awt.BorderLayout;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Touche {

	private JFrame frame;
	private JTextField txtName;
	private JTextField txtTournamentName;
	private JTextField txtTournamentDate;
	private JTextField txtNumFencers;
	private JTextField txtFencer1;
	private JTextField txtFencer2;
	private JTextField txtFencer3;
	private JTextField txtFencer4;
	private JTextField txtFencer5;
	private JTextField txtFencer6;
	private JTextField txtFencer7;
	private JTextField txtFencer8;

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
		frame = new JFrame();
		frame.setBackground(Color.WHITE);
		frame.getContentPane().setBackground(new Color(204, 204, 204));
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		
		// COMPONENTS
		
		JPanel pnlMain = new JPanel();
		pnlMain.setBackground(new Color(255, 204, 51));
		pnlMain.setBounds(0, 0, 788, 565);
		frame.getContentPane().add(pnlMain);
		pnlMain.setLayout(new CardLayout(0, 0));
		
		JPanel pnlTournament = new JPanel();
		pnlTournament.setBackground(new Color(255, 204, 255));
		pnlMain.add(pnlTournament, "name_320142717605500");
		pnlTournament.setLayout(null);
		
		JPanel pnlImage = new JPanel();
		pnlImage.setBackground(Color.WHITE);
		pnlImage.setBounds(0, 0, 400, 565);
		pnlTournament.add(pnlImage);
		pnlImage.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Touche.class.getResource("/com/olympic/cis143/student/touche/images/fencer400x245.png")));
		lblNewLabel.setBounds(0, 193, 400, 215);
		pnlImage.add(lblNewLabel);
		
		JPanel pnlTournamentInfo = new JPanel();
		pnlTournamentInfo.setBackground(Color.WHITE);
		pnlTournamentInfo.setBounds(400, 0, 400, 565);
		pnlTournament.add(pnlTournamentInfo);
		pnlTournamentInfo.setLayout(null);
		
		JButton btnTournamentOK = new JButton("OK");
		btnTournamentOK.setBounds(72, 476, 89, 23);
		pnlTournamentInfo.add(btnTournamentOK);
		
		JButton btnTournamentClear = new JButton("CLEAR");
		btnTournamentClear.setBounds(191, 476, 89, 23);
		pnlTournamentInfo.add(btnTournamentClear);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblName.setBounds(42, 86, 171, 14);
		pnlTournamentInfo.add(lblName);
		
		JLabel lblTournamentName = new JLabel("TOURNAMENT NAME");
		lblTournamentName.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTournamentName.setBounds(42, 174, 171, 14);
		pnlTournamentInfo.add(lblTournamentName);
		
		JLabel lblTournamentDate = new JLabel("TOURNAMENT DATE");
		lblTournamentDate.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTournamentDate.setBounds(42, 266, 171, 14);
		pnlTournamentInfo.add(lblTournamentDate);
		
		JLabel lblNumFencers = new JLabel("NUMBER OF FENCERS IN POOL");
		lblNumFencers.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNumFencers.setBounds(42, 351, 171, 14);
		pnlTournamentInfo.add(lblNumFencers);
		
		txtName = new JTextField();
		txtName.setBounds(42, 111, 278, 30);
		pnlTournamentInfo.add(txtName);
		txtName.setColumns(10);
		
		txtTournamentName = new JTextField();
		txtTournamentName.setBounds(42, 199, 278, 30);
		pnlTournamentInfo.add(txtTournamentName);
		txtTournamentName.setColumns(10);
		
		txtTournamentDate = new JTextField();
		txtTournamentDate.setBounds(42, 291, 278, 30);
		pnlTournamentInfo.add(txtTournamentDate);
		txtTournamentDate.setColumns(10);
		
		txtNumFencers = new JTextField();
		txtNumFencers.setBounds(42, 376, 278, 30);
		pnlTournamentInfo.add(txtNumFencers);
		txtNumFencers.setColumns(10);
		
		JPanel pnlFencers = new JPanel();
		pnlFencers.setBackground(new Color(255, 255, 255));
		pnlMain.add(pnlFencers, "name_320151444346100");
		pnlFencers.setLayout(null);
		
		JButton btnFencersOK = new JButton("OK");
		btnFencersOK.setBounds(257, 488, 89, 23);
		pnlFencers.add(btnFencersOK);
		
		JButton btnFencersClear = new JButton("CLEAR");
		btnFencersClear.setBounds(391, 488, 89, 23);
		pnlFencers.add(btnFencersClear);
		
		JLabel lblFencer1 = new JLabel("Fencer 1");
		lblFencer1.setBounds(164, 65, 63, 14);
		pnlFencers.add(lblFencer1);
		
		JLabel lblFencer2 = new JLabel("Fencer 2");
		lblFencer2.setBounds(164, 121, 63, 14);
		pnlFencers.add(lblFencer2);
		
		JLabel lblFencer3 = new JLabel("Fencer 3");
		lblFencer3.setBounds(164, 171, 63, 14);
		pnlFencers.add(lblFencer3);
		
		JLabel lblFencer4 = new JLabel("Fencer 4");
		lblFencer4.setBounds(164, 221, 63, 14);
		pnlFencers.add(lblFencer4);
		
		JLabel lblFencer5 = new JLabel("Fencer 5");
		lblFencer5.setBounds(164, 271, 63, 14);
		pnlFencers.add(lblFencer5);
		
		JLabel lblFencer6 = new JLabel("Fencer 6");
		lblFencer6.setBounds(164, 321, 63, 14);
		pnlFencers.add(lblFencer6);
		
		JLabel lblFencer7 = new JLabel("Fencer 7");
		lblFencer7.setBounds(164, 371, 63, 14);
		pnlFencers.add(lblFencer7);
		
		JLabel lblFencer8 = new JLabel("Fencer 8");
		lblFencer8.setBounds(164, 421, 63, 14);
		pnlFencers.add(lblFencer8);
		
		txtFencer1 = new JTextField();
		txtFencer1.setBounds(237, 58, 258, 29);
		pnlFencers.add(txtFencer1);
		txtFencer1.setColumns(10);
		
		txtFencer2 = new JTextField();
		txtFencer2.setColumns(10);
		txtFencer2.setBounds(237, 114, 258, 29);
		pnlFencers.add(txtFencer2);
		
		txtFencer3 = new JTextField();
		txtFencer3.setColumns(10);
		txtFencer3.setBounds(237, 164, 258, 29);
		pnlFencers.add(txtFencer3);
		
		txtFencer4 = new JTextField();
		txtFencer4.setColumns(10);
		txtFencer4.setBounds(237, 214, 258, 29);
		pnlFencers.add(txtFencer4);
		
		txtFencer5 = new JTextField();
		txtFencer5.setColumns(10);
		txtFencer5.setBounds(237, 264, 258, 29);
		pnlFencers.add(txtFencer5);
		
		txtFencer6 = new JTextField();
		txtFencer6.setColumns(10);
		txtFencer6.setBounds(237, 314, 258, 29);
		pnlFencers.add(txtFencer6);
		
		txtFencer7 = new JTextField();
		txtFencer7.setColumns(10);
		txtFencer7.setBounds(237, 364, 258, 29);
		pnlFencers.add(txtFencer7);
		
		txtFencer8 = new JTextField();
		txtFencer8.setColumns(10);
		txtFencer8.setBounds(237, 414, 258, 29);
		pnlFencers.add(txtFencer8);
		
		JCheckBox chckbxFencer1 = new JCheckBox("Is this you?");
		chckbxFencer1.setBounds(538, 61, 99, 23);
		pnlFencers.add(chckbxFencer1);
		
		JCheckBox chckbxFencer2 = new JCheckBox("Is this you?");
		chckbxFencer2.setBounds(538, 117, 99, 23);
		pnlFencers.add(chckbxFencer2);
		
		JCheckBox chckbxFencer3 = new JCheckBox("Is this you?");
		chckbxFencer3.setBounds(538, 167, 99, 23);
		pnlFencers.add(chckbxFencer3);
		
		JCheckBox chckbxFencer4 = new JCheckBox("Is this you?");
		chckbxFencer4.setBounds(538, 217, 99, 23);
		pnlFencers.add(chckbxFencer4);
		
		JCheckBox chckbxFencer5 = new JCheckBox("Is this you?");
		chckbxFencer5.setBounds(538, 267, 99, 23);
		pnlFencers.add(chckbxFencer5);
		
		JCheckBox chckbxFencer6 = new JCheckBox("Is this you?");
		chckbxFencer6.setBounds(538, 317, 99, 23);
		pnlFencers.add(chckbxFencer6);
		
		JCheckBox chckbxFencer7 = new JCheckBox("Is this you?");
		chckbxFencer7.setBounds(538, 367, 99, 23);
		pnlFencers.add(chckbxFencer7);
		
		JCheckBox chckbxFencer8 = new JCheckBox("Is this you?");
		chckbxFencer8.setBounds(538, 417, 99, 23);
		pnlFencers.add(chckbxFencer8);
		
		JPanel pnlScores = new JPanel();
		pnlScores.setBackground(new Color(204, 255, 255));
		pnlMain.add(pnlScores, "name_320158152710800");
		pnlScores.setLayout(null);
		
		JButton btnScoresNewPool = new JButton("NEW POOL");
		btnScoresNewPool.setBounds(149, 341, 89, 23);
		pnlScores.add(btnScoresNewPool);
		
		JButton btnScoresExit = new JButton("EXIT");
		btnScoresExit.setBounds(265, 341, 89, 23);
		pnlScores.add(btnScoresExit);

		
		// ACTIONS
		
		// Tournament screen: OK clicked
		btnTournamentOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnlTournament.setVisible(false);
				pnlFencers.setVisible(true);
				pnlScores.setVisible(false);
				System.out.println(txtName.getText());
				System.out.println(txtTournamentName. getText());
				System.out.println(txtTournamentDate.getText());
				System.out.println(txtNumFencers.getText());
			}
		});

		// Tournament screen: CLEAR clicked
		btnTournamentClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtName.setText("");
				txtTournamentName.setText("");
				txtTournamentDate.setText("");
				txtNumFencers.setText("");
			}
		});
	
		
		// Fencers screen: OK clicked.  Make sure they have clicked the check box indicating who they are so they can be highlighted in the scoresheet
		btnFencersOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (!chckbxFencer1.isSelected() &&
					!chckbxFencer2.isSelected() &&
					!chckbxFencer3.isSelected() &&
					!chckbxFencer4.isSelected() &&
					!chckbxFencer5.isSelected() &&
					!chckbxFencer6.isSelected() &&
					!chckbxFencer7.isSelected() &&
					!chckbxFencer8.isSelected() ) {
					System.out.println("YOU MUST PICK YOURSELF !!!!");
				} else {
					pnlTournament.setVisible(false);
					pnlFencers.setVisible(false);
					pnlScores.setVisible(true);
					//System.out.println(txtFencer1.getText());
					//System.out.println(txtFencer2.getText());
					//System.out.println(txtFencer3.getText());
					//System.out.println(txtFencer4.getText());
					//System.out.println(txtFencer5.getText());
					//System.out.println(txtFencer6.getText());
					//System.out.println(txtFencer7.getText());
					//System.out.println(txtFencer8.getText());
				}
			}
		});
		
		// Fencers screen: CLEAR clicked
		btnFencersClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFencer1.setText("");
				txtFencer2.setText("");
				txtFencer3.setText("");
				txtFencer4.setText("");
				txtFencer5.setText("");
				txtFencer6.setText("");
				txtFencer7.setText("");
				txtFencer8.setText("");
			}
		});
		

		// Checkbox listeners: Check if selected/deselected, and detect what number our fencer is 
		chckbxFencer1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (chckbxFencer1.isSelected()) {
					chckbxFencer2.setEnabled(false);
					chckbxFencer3.setEnabled(false);
					chckbxFencer4.setEnabled(false);
					chckbxFencer5.setEnabled(false);
					chckbxFencer6.setEnabled(false);
					chckbxFencer7.setEnabled(false);
					chckbxFencer8.setEnabled(false);
				} else {
					chckbxFencer2.setEnabled(true);
					chckbxFencer3.setEnabled(true);
					chckbxFencer4.setEnabled(true);
					chckbxFencer5.setEnabled(true);
					chckbxFencer6.setEnabled(true);
					chckbxFencer7.setEnabled(true);
					chckbxFencer8.setEnabled(true);
				}
			}
		});

		chckbxFencer2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (chckbxFencer2.isSelected()) {
					chckbxFencer1.setEnabled(false);
					chckbxFencer3.setEnabled(false);
					chckbxFencer4.setEnabled(false);
					chckbxFencer5.setEnabled(false);
					chckbxFencer6.setEnabled(false);
					chckbxFencer7.setEnabled(false);
					chckbxFencer8.setEnabled(false);
				} else {
					chckbxFencer1.setEnabled(true);
					chckbxFencer3.setEnabled(true);
					chckbxFencer4.setEnabled(true);
					chckbxFencer5.setEnabled(true);
					chckbxFencer6.setEnabled(true);
					chckbxFencer7.setEnabled(true);
					chckbxFencer8.setEnabled(true);
				}
			}
		});

		chckbxFencer3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (chckbxFencer3.isSelected()) {
					chckbxFencer1.setEnabled(false);
					chckbxFencer2.setEnabled(false);
					chckbxFencer4.setEnabled(false);
					chckbxFencer5.setEnabled(false);
					chckbxFencer6.setEnabled(false);
					chckbxFencer7.setEnabled(false);
					chckbxFencer8.setEnabled(false);
				} else {
					chckbxFencer1.setEnabled(true);
					chckbxFencer2.setEnabled(true);
					chckbxFencer4.setEnabled(true);
					chckbxFencer5.setEnabled(true);
					chckbxFencer6.setEnabled(true);
					chckbxFencer7.setEnabled(true);
					chckbxFencer8.setEnabled(true);
				}
			}
		});

		chckbxFencer4.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (chckbxFencer4.isSelected()) {
					chckbxFencer1.setEnabled(false);
					chckbxFencer2.setEnabled(false);
					chckbxFencer3.setEnabled(false);
					chckbxFencer5.setEnabled(false);
					chckbxFencer6.setEnabled(false);
					chckbxFencer7.setEnabled(false);
					chckbxFencer8.setEnabled(false);
				} else {
					chckbxFencer1.setEnabled(true);
					chckbxFencer2.setEnabled(true);
					chckbxFencer3.setEnabled(true);
					chckbxFencer5.setEnabled(true);
					chckbxFencer6.setEnabled(true);
					chckbxFencer7.setEnabled(true);
					chckbxFencer8.setEnabled(true);
				}
			}
		});

		chckbxFencer5.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (chckbxFencer5.isSelected()) {
					chckbxFencer1.setEnabled(false);
					chckbxFencer2.setEnabled(false);
					chckbxFencer3.setEnabled(false);
					chckbxFencer4.setEnabled(false);
					chckbxFencer6.setEnabled(false);
					chckbxFencer7.setEnabled(false);
					chckbxFencer8.setEnabled(false);
				} else {
					chckbxFencer1.setEnabled(true);
					chckbxFencer2.setEnabled(true);
					chckbxFencer3.setEnabled(true);
					chckbxFencer4.setEnabled(true);
					chckbxFencer6.setEnabled(true);
					chckbxFencer7.setEnabled(true);
					chckbxFencer8.setEnabled(true);
				}
			}
		});

		chckbxFencer6.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (chckbxFencer6.isSelected()) {
					chckbxFencer1.setEnabled(false);
					chckbxFencer2.setEnabled(false);
					chckbxFencer3.setEnabled(false);
					chckbxFencer4.setEnabled(false);
					chckbxFencer5.setEnabled(false);
					chckbxFencer7.setEnabled(false);
					chckbxFencer8.setEnabled(false);
				} else {
					chckbxFencer1.setEnabled(true);
					chckbxFencer2.setEnabled(true);
					chckbxFencer3.setEnabled(true);
					chckbxFencer4.setEnabled(true);
					chckbxFencer5.setEnabled(true);
					chckbxFencer7.setEnabled(true);
					chckbxFencer8.setEnabled(true);
				}
			}
		});

		chckbxFencer7.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (chckbxFencer7.isSelected()) {
					chckbxFencer1.setEnabled(false);
					chckbxFencer2.setEnabled(false);
					chckbxFencer3.setEnabled(false);
					chckbxFencer4.setEnabled(false);
					chckbxFencer5.setEnabled(false);
					chckbxFencer6.setEnabled(false);
					chckbxFencer8.setEnabled(false);
				} else {
					chckbxFencer1.setEnabled(true);
					chckbxFencer2.setEnabled(true);
					chckbxFencer3.setEnabled(true);
					chckbxFencer4.setEnabled(true);
					chckbxFencer5.setEnabled(true);
					chckbxFencer6.setEnabled(true);
					chckbxFencer8.setEnabled(true);
				}
			}
		});

		chckbxFencer8.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (chckbxFencer8.isSelected()) {
					chckbxFencer1.setEnabled(false);
					chckbxFencer2.setEnabled(false);
					chckbxFencer3.setEnabled(false);
					chckbxFencer4.setEnabled(false);
					chckbxFencer5.setEnabled(false);
					chckbxFencer6.setEnabled(false);
					chckbxFencer7.setEnabled(false);
				} else {
					chckbxFencer1.setEnabled(true);
					chckbxFencer2.setEnabled(true);
					chckbxFencer3.setEnabled(true);
					chckbxFencer4.setEnabled(true);
					chckbxFencer5.setEnabled(true);
					chckbxFencer6.setEnabled(true);
					chckbxFencer7.setEnabled(true);
				}
			}
		});
		
	}
}
