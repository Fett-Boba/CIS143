package com.olympic.cis143.student.touche.gui;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.SwingConstants;

public class Touche {

	private JFrame frame;
	private JTextField txtTournamentName;
	private JTextField txtTournamentDate;
	private JTextField txtFencer1;
	private JTextField txtFencer2;
	private JTextField txtFencer3;
	private JTextField txtFencer4;
	private JTextField txtFencer5;
	private JTextField txtFencer6;
	private JTextField txtFencer7;
	private JTextField txtFencer8;
	private final ButtonGroup buttonGroup = new ButtonGroup();

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
		btnTournamentOK.setBounds(79, 512, 89, 23);
		pnlTournamentInfo.add(btnTournamentOK);
		
		JButton btnTournamentClear = new JButton("CLEAR");
		btnTournamentClear.setBounds(198, 512, 89, 23);
		pnlTournamentInfo.add(btnTournamentClear);
		
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
		
		txtTournamentName = new JTextField();
		txtTournamentName.setBounds(42, 199, 278, 30);
		pnlTournamentInfo.add(txtTournamentName);
		txtTournamentName.setColumns(10);
		
		txtTournamentDate = new JTextField();
		txtTournamentDate.setBounds(42, 291, 278, 30);
		pnlTournamentInfo.add(txtTournamentDate);
		txtTournamentDate.setColumns(10);
		
		JRadioButton rb4Fencers = new JRadioButton("4");
		rb4Fencers.setBackground(Color.WHITE);
		buttonGroup.add(rb4Fencers);
		rb4Fencers.setSelected(true);
		rb4Fencers.setBounds(42, 372, 39, 23);
		pnlTournamentInfo.add(rb4Fencers);
		
		JRadioButton rb5Fencers = new JRadioButton("5");
		rb5Fencers.setBackground(Color.WHITE);
		buttonGroup.add(rb5Fencers);
		rb5Fencers.setBounds(83, 372, 39, 23);
		pnlTournamentInfo.add(rb5Fencers);
		
		JRadioButton rb6Fencers = new JRadioButton("6");
		rb6Fencers.setBackground(Color.WHITE);
		buttonGroup.add(rb6Fencers);
		rb6Fencers.setBounds(124, 372, 39, 23);
		pnlTournamentInfo.add(rb6Fencers);
		
		JRadioButton rb7Fencers = new JRadioButton("7");
		rb7Fencers.setBackground(Color.WHITE);
		buttonGroup.add(rb7Fencers);
		rb7Fencers.setBounds(165, 372, 39, 23);
		pnlTournamentInfo.add(rb7Fencers);
		
		JRadioButton rb8Fencers = new JRadioButton("8");
		rb8Fencers.setBackground(Color.WHITE);
		buttonGroup.add(rb8Fencers);
		rb8Fencers.setBounds(206, 372, 39, 23);
		pnlTournamentInfo.add(rb8Fencers);
		
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
		txtFencer1.setBounds(237, 58, 288, 29);
		pnlFencers.add(txtFencer1);
		
		txtFencer2 = new JTextField();
		txtFencer2.setBounds(237, 114, 288, 29);
		pnlFencers.add(txtFencer2);
		
		txtFencer3 = new JTextField();
		txtFencer3.setBounds(237, 164, 288, 29);
		pnlFencers.add(txtFencer3);
		
		txtFencer4 = new JTextField();
		txtFencer4.setBounds(237, 214, 288, 29);
		pnlFencers.add(txtFencer4);
		
		txtFencer5 = new JTextField();
		txtFencer5.setBounds(237, 264, 288, 29);
		pnlFencers.add(txtFencer5);
		
		txtFencer6 = new JTextField();
		txtFencer6.setBounds(237, 314, 288, 29);
		pnlFencers.add(txtFencer6);
		
		txtFencer7 = new JTextField();
		txtFencer7.setBounds(237, 364, 288, 29);
		pnlFencers.add(txtFencer7);
		
		txtFencer8 = new JTextField();
		txtFencer8.setBounds(237, 414, 288, 29);
		pnlFencers.add(txtFencer8);
		
		JCheckBox chckbxFencer1 = new JCheckBox("Is this you?");
		chckbxFencer1.setBackground(Color.WHITE);
		chckbxFencer1.setBounds(538, 61, 99, 23);
		pnlFencers.add(chckbxFencer1);
		
		JCheckBox chckbxFencer2 = new JCheckBox("Is this you?");
		chckbxFencer2.setBackground(Color.WHITE);
		chckbxFencer2.setBounds(538, 117, 99, 23);
		pnlFencers.add(chckbxFencer2);
		
		JCheckBox chckbxFencer3 = new JCheckBox("Is this you?");
		chckbxFencer3.setBackground(Color.WHITE);
		chckbxFencer3.setBounds(538, 167, 99, 23);
		pnlFencers.add(chckbxFencer3);
		
		JCheckBox chckbxFencer4 = new JCheckBox("Is this you?");
		chckbxFencer4.setBackground(Color.WHITE);
		chckbxFencer4.setBounds(538, 217, 99, 23);
		pnlFencers.add(chckbxFencer4);
		
		JCheckBox chckbxFencer5 = new JCheckBox("Is this you?");
		chckbxFencer5.setBackground(Color.WHITE);
		chckbxFencer5.setBounds(538, 267, 99, 23);
		pnlFencers.add(chckbxFencer5);
		
		JCheckBox chckbxFencer6 = new JCheckBox("Is this you?");
		chckbxFencer6.setBackground(Color.WHITE);
		chckbxFencer6.setBounds(538, 317, 99, 23);
		pnlFencers.add(chckbxFencer6);
		
		JCheckBox chckbxFencer7 = new JCheckBox("Is this you?");
		chckbxFencer7.setBackground(Color.WHITE);
		chckbxFencer7.setBounds(538, 367, 99, 23);
		pnlFencers.add(chckbxFencer7);
		
		JCheckBox chckbxFencer8 = new JCheckBox("Is this you?");
		chckbxFencer8.setBackground(Color.WHITE);
		chckbxFencer8.setBounds(538, 417, 99, 23);
		pnlFencers.add(chckbxFencer8);
		
		JPanel pnlScores = new JPanel();
		pnlScores.setBackground(new Color(204, 255, 255));
		pnlMain.add(pnlScores, "name_320158152710800");
		pnlScores.setLayout(null);
		
		JButton btnScoresNewPool = new JButton("NEW POOL");
		btnScoresNewPool.setBounds(282, 511, 89, 23);
		pnlScores.add(btnScoresNewPool);
		
		JButton btnScoresExit = new JButton("EXIT");
		btnScoresExit.setBounds(398, 511, 89, 23);
		pnlScores.add(btnScoresExit);
		
		JLabel lblScoresName = new JLabel("NAME");
		lblScoresName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblScoresName.setBounds(49, 113, 125, 14);
		pnlScores.add(lblScoresName);
		
		JLabel lblScoresFencer1 = new JLabel("New label");
		lblScoresFencer1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblScoresFencer1.setBounds(49, 148, 125, 14);
		pnlScores.add(lblScoresFencer1);
		
		JLabel lblScoresFencer2 = new JLabel("New label");
		lblScoresFencer2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblScoresFencer2.setBounds(49, 183, 125, 14);
		pnlScores.add(lblScoresFencer2);
		
		JLabel lblScoresFencer3 = new JLabel("New label");
		lblScoresFencer3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblScoresFencer3.setBounds(49, 218, 125, 14);
		pnlScores.add(lblScoresFencer3);
		
		JLabel lblScoresFencer4 = new JLabel("New label");
		lblScoresFencer4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblScoresFencer4.setBounds(49, 253, 125, 14);
		pnlScores.add(lblScoresFencer4);
		
		JLabel lblScoresFencer5 = new JLabel("New label");
		lblScoresFencer5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblScoresFencer5.setBounds(49, 288, 125, 14);
		pnlScores.add(lblScoresFencer5);
		
		JLabel lblScoresFencer6 = new JLabel("New label");
		lblScoresFencer6.setHorizontalAlignment(SwingConstants.RIGHT);
		lblScoresFencer6.setBounds(49, 323, 125, 14);
		pnlScores.add(lblScoresFencer6);
		
		JLabel lblScoresFencer7 = new JLabel("New label");
		lblScoresFencer7.setHorizontalAlignment(SwingConstants.RIGHT);
		lblScoresFencer7.setBounds(49, 358, 125, 14);
		pnlScores.add(lblScoresFencer7);
		
		JLabel lblScoresFencer8 = new JLabel("New label");
		lblScoresFencer8.setHorizontalAlignment(SwingConstants.RIGHT);
		lblScoresFencer8.setBounds(49, 393, 125, 14);
		pnlScores.add(lblScoresFencer8);
		
		

		
		// ACTIONS
		
		// Tournament screen: OK clicked
		btnTournamentOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (rb4Fencers.isSelected()) {

					lblFencer5.setVisible(false);
					txtFencer5.setVisible(false);
					chckbxFencer5.setVisible(false);
					
					lblFencer6.setVisible(false);
					txtFencer6.setVisible(false);
					chckbxFencer6.setVisible(false);
					
					lblFencer7.setVisible(false);
					txtFencer7.setVisible(false);
					chckbxFencer7.setVisible(false);

					lblFencer8.setVisible(false);
					txtFencer8.setVisible(false);
					chckbxFencer8.setVisible(false);
					
				} else if (rb5Fencers.isSelected()) {
					
					lblFencer6.setVisible(false);
					txtFencer6.setVisible(false);
					chckbxFencer6.setVisible(false);
					
					lblFencer7.setVisible(false);
					txtFencer7.setVisible(false);
					chckbxFencer7.setVisible(false);

					lblFencer8.setVisible(false);
					txtFencer8.setVisible(false);
					chckbxFencer8.setVisible(false);
					
				} else if (rb6Fencers.isSelected()) {
					
					lblFencer7.setVisible(false);
					txtFencer7.setVisible(false);
					chckbxFencer7.setVisible(false);

					lblFencer8.setVisible(false);
					txtFencer8.setVisible(false);
					chckbxFencer8.setVisible(false);
					
				} else if (rb7Fencers.isSelected()) {
					
					lblFencer8.setVisible(false);
					txtFencer8.setVisible(false);
					chckbxFencer8.setVisible(false);
				} 
				
				pnlTournament.setVisible(false);
				pnlFencers.setVisible(true);
				pnlScores.setVisible(false);
			}
		});

		// Tournament screen: CLEAR clicked
		btnTournamentClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtTournamentName.setText("");
				txtTournamentDate.setText("");
			}
		});
	
		
		// Fencers screen: OK clicked.  Make sure they have clicked the check box indicating who they are so they can be highlighted in the score sheet
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
					JOptionPane.showMessageDialog(frame, "Please select which fencer is you.", "Error", JOptionPane.ERROR_MESSAGE);
				} else {
					// If user did not enter any names default them
					if (txtFencer1.getText().isEmpty()) txtFencer1.setText("Fencer1");
					if (txtFencer2.getText().isEmpty()) txtFencer2.setText("Fencer2");
					if (txtFencer3.getText().isEmpty()) txtFencer3.setText("Fencer3");
					if (txtFencer4.getText().isEmpty()) txtFencer4.setText("Fencer4");
					if (txtFencer5.getText().isEmpty()) txtFencer5.setText("Fencer5");
					if (txtFencer6.getText().isEmpty()) txtFencer6.setText("Fencer6");
					if (txtFencer7.getText().isEmpty()) txtFencer7.setText("Fencer7");
					if (txtFencer8.getText().isEmpty()) txtFencer8.setText("Fencer8");
					
					lblScoresFencer1.setText(txtFencer1.getText());
					lblScoresFencer2.setText(txtFencer2.getText());
					lblScoresFencer3.setText(txtFencer3.getText());
					lblScoresFencer4.setText(txtFencer4.getText());
					lblScoresFencer5.setText(txtFencer5.getText());
					lblScoresFencer6.setText(txtFencer6.getText());
					lblScoresFencer7.setText(txtFencer7.getText());
					lblScoresFencer8.setText(txtFencer8.getText());
					
					pnlTournament.setVisible(false);
					pnlFencers.setVisible(false);
					pnlScores.setVisible(true);
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
