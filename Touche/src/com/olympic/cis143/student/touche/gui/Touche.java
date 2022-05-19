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
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField textField_49;
	private JTextField textField_50;
	private JTextField textField_51;
	private JTextField textField_52;
	private JTextField textField_53;
	private JTextField textField_54;
	private JTextField textField_55;
	private JTextField textField_56;
	private JTextField textField_57;
	private JTextField textField_58;
	private JTextField textField_59;
	private JTextField textField_60;
	private JTextField textField_61;
	private JTextField textField_62;
	private JTextField textField_63;

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
		
		JLabel lblScoresFencer1 = new JLabel("New label");
		lblScoresFencer1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblScoresFencer1.setBounds(49, 153, 125, 14);
		pnlScores.add(lblScoresFencer1);
		
		JLabel lblScoresFencer2 = new JLabel("New label");
		lblScoresFencer2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblScoresFencer2.setBounds(49, 187, 125, 14);
		pnlScores.add(lblScoresFencer2);
		
		JLabel lblScoresFencer3 = new JLabel("New label");
		lblScoresFencer3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblScoresFencer3.setBounds(49, 221, 125, 14);
		pnlScores.add(lblScoresFencer3);
		
		JLabel lblScoresFencer4 = new JLabel("New label");
		lblScoresFencer4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblScoresFencer4.setBounds(49, 255, 125, 14);
		pnlScores.add(lblScoresFencer4);
		
		JLabel lblScoresFencer5 = new JLabel("New label");
		lblScoresFencer5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblScoresFencer5.setBounds(49, 289, 125, 14);
		pnlScores.add(lblScoresFencer5);
		
		JLabel lblScoresFencer6 = new JLabel("New label");
		lblScoresFencer6.setHorizontalAlignment(SwingConstants.RIGHT);
		lblScoresFencer6.setBounds(49, 323, 125, 14);
		pnlScores.add(lblScoresFencer6);
		
		JLabel lblScoresFencer7 = new JLabel("New label");
		lblScoresFencer7.setHorizontalAlignment(SwingConstants.RIGHT);
		lblScoresFencer7.setBounds(49, 357, 125, 14);
		pnlScores.add(lblScoresFencer7);
		
		JLabel lblScoresFencer8 = new JLabel("New label");
		lblScoresFencer8.setHorizontalAlignment(SwingConstants.RIGHT);
		lblScoresFencer8.setBounds(49, 391, 125, 14);
		pnlScores.add(lblScoresFencer8);
		
		JLabel lblNewLabel_1 = new JLabel("1");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(184, 153, 26, 14);
		pnlScores.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("2");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(184, 187, 26, 14);
		pnlScores.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("3");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setBounds(184, 221, 26, 14);
		pnlScores.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("4");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setBounds(184, 255, 26, 14);
		pnlScores.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("5");
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4.setBounds(184, 289, 26, 14);
		pnlScores.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("6");
		lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5.setBounds(184, 323, 26, 14);
		pnlScores.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("7");
		lblNewLabel_1_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_6.setBounds(184, 357, 26, 14);
		pnlScores.add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("8");
		lblNewLabel_1_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_7.setBounds(184, 391, 26, 14);
		pnlScores.add(lblNewLabel_1_7);
		
		JLabel lblNewLabel_1_8 = new JLabel("1");
		lblNewLabel_1_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_8.setBounds(225, 126, 26, 14);
		pnlScores.add(lblNewLabel_1_8);
		
		JLabel lblNewLabel_1_9 = new JLabel("2");
		lblNewLabel_1_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_9.setBounds(265, 126, 26, 14);
		pnlScores.add(lblNewLabel_1_9);
		
		JLabel lblNewLabel_1_10 = new JLabel("3");
		lblNewLabel_1_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_10.setBounds(305, 126, 26, 14);
		pnlScores.add(lblNewLabel_1_10);
		
		JLabel lblNewLabel_1_11 = new JLabel("4");
		lblNewLabel_1_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_11.setBounds(345, 126, 26, 14);
		pnlScores.add(lblNewLabel_1_11);
		
		JLabel lblNewLabel_1_12 = new JLabel("5");
		lblNewLabel_1_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_12.setBounds(385, 126, 26, 14);
		pnlScores.add(lblNewLabel_1_12);
		
		JLabel lblNewLabel_1_13 = new JLabel("6");
		lblNewLabel_1_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_13.setBounds(425, 126, 26, 14);
		pnlScores.add(lblNewLabel_1_13);
		
		JLabel lblNewLabel_1_14 = new JLabel("7");
		lblNewLabel_1_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_14.setBounds(465, 126, 26, 14);
		pnlScores.add(lblNewLabel_1_14);
		
		JLabel lblNewLabel_1_15 = new JLabel("8");
		lblNewLabel_1_15.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_15.setBounds(505, 126, 26, 14);
		pnlScores.add(lblNewLabel_1_15);
		
		textField = new JTextField();
		textField.setBounds(220, 145, 36, 30);
		pnlScores.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(260, 145, 36, 30);
		pnlScores.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(300, 145, 36, 30);
		pnlScores.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(340, 145, 36, 30);
		pnlScores.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(380, 145, 36, 30);
		pnlScores.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(420, 145, 36, 30);
		pnlScores.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(460, 145, 36, 30);
		pnlScores.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(500, 145, 36, 30);
		pnlScores.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(220, 179, 36, 30);
		pnlScores.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(260, 179, 36, 30);
		pnlScores.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(300, 179, 36, 30);
		pnlScores.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(340, 179, 36, 30);
		pnlScores.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(380, 179, 36, 30);
		pnlScores.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(420, 179, 36, 30);
		pnlScores.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(460, 179, 36, 30);
		pnlScores.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(500, 179, 36, 30);
		pnlScores.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(220, 213, 36, 30);
		pnlScores.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(260, 213, 36, 30);
		pnlScores.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(300, 213, 36, 30);
		pnlScores.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(340, 213, 36, 30);
		pnlScores.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(380, 213, 36, 30);
		pnlScores.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(420, 213, 36, 30);
		pnlScores.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(460, 213, 36, 30);
		pnlScores.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(500, 213, 36, 30);
		pnlScores.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(220, 247, 36, 30);
		pnlScores.add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(260, 247, 36, 30);
		pnlScores.add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(300, 247, 36, 30);
		pnlScores.add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(340, 247, 36, 30);
		pnlScores.add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(380, 247, 36, 30);
		pnlScores.add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(420, 247, 36, 30);
		pnlScores.add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(460, 247, 36, 30);
		pnlScores.add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBounds(500, 247, 36, 30);
		pnlScores.add(textField_31);
		
		textField_32 = new JTextField();
		textField_32.setColumns(10);
		textField_32.setBounds(220, 281, 36, 30);
		pnlScores.add(textField_32);
		
		textField_33 = new JTextField();
		textField_33.setColumns(10);
		textField_33.setBounds(260, 281, 36, 30);
		pnlScores.add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setColumns(10);
		textField_34.setBounds(300, 281, 36, 30);
		pnlScores.add(textField_34);
		
		textField_35 = new JTextField();
		textField_35.setColumns(10);
		textField_35.setBounds(340, 281, 36, 30);
		pnlScores.add(textField_35);
		
		textField_36 = new JTextField();
		textField_36.setColumns(10);
		textField_36.setBounds(380, 281, 36, 30);
		pnlScores.add(textField_36);
		
		textField_37 = new JTextField();
		textField_37.setColumns(10);
		textField_37.setBounds(420, 281, 36, 30);
		pnlScores.add(textField_37);
		
		textField_38 = new JTextField();
		textField_38.setColumns(10);
		textField_38.setBounds(460, 281, 36, 30);
		pnlScores.add(textField_38);
		
		textField_39 = new JTextField();
		textField_39.setColumns(10);
		textField_39.setBounds(500, 281, 36, 30);
		pnlScores.add(textField_39);
		
		textField_40 = new JTextField();
		textField_40.setColumns(10);
		textField_40.setBounds(220, 315, 36, 30);
		pnlScores.add(textField_40);
		
		textField_41 = new JTextField();
		textField_41.setColumns(10);
		textField_41.setBounds(260, 315, 36, 30);
		pnlScores.add(textField_41);
		
		textField_42 = new JTextField();
		textField_42.setColumns(10);
		textField_42.setBounds(300, 315, 36, 30);
		pnlScores.add(textField_42);
		
		textField_43 = new JTextField();
		textField_43.setColumns(10);
		textField_43.setBounds(340, 315, 36, 30);
		pnlScores.add(textField_43);
		
		textField_44 = new JTextField();
		textField_44.setColumns(10);
		textField_44.setBounds(380, 315, 36, 30);
		pnlScores.add(textField_44);
		
		textField_45 = new JTextField();
		textField_45.setColumns(10);
		textField_45.setBounds(420, 315, 36, 30);
		pnlScores.add(textField_45);
		
		textField_46 = new JTextField();
		textField_46.setColumns(10);
		textField_46.setBounds(460, 315, 36, 30);
		pnlScores.add(textField_46);
		
		textField_47 = new JTextField();
		textField_47.setColumns(10);
		textField_47.setBounds(500, 315, 36, 30);
		pnlScores.add(textField_47);
		
		textField_48 = new JTextField();
		textField_48.setColumns(10);
		textField_48.setBounds(220, 349, 36, 30);
		pnlScores.add(textField_48);
		
		textField_49 = new JTextField();
		textField_49.setColumns(10);
		textField_49.setBounds(260, 349, 36, 30);
		pnlScores.add(textField_49);
		
		textField_50 = new JTextField();
		textField_50.setColumns(10);
		textField_50.setBounds(300, 349, 36, 30);
		pnlScores.add(textField_50);
		
		textField_51 = new JTextField();
		textField_51.setColumns(10);
		textField_51.setBounds(340, 349, 36, 30);
		pnlScores.add(textField_51);
		
		textField_52 = new JTextField();
		textField_52.setColumns(10);
		textField_52.setBounds(380, 349, 36, 30);
		pnlScores.add(textField_52);
		
		textField_53 = new JTextField();
		textField_53.setColumns(10);
		textField_53.setBounds(420, 349, 36, 30);
		pnlScores.add(textField_53);
		
		textField_54 = new JTextField();
		textField_54.setColumns(10);
		textField_54.setBounds(460, 349, 36, 30);
		pnlScores.add(textField_54);
		
		textField_55 = new JTextField();
		textField_55.setColumns(10);
		textField_55.setBounds(500, 349, 36, 30);
		pnlScores.add(textField_55);
		
		textField_56 = new JTextField();
		textField_56.setColumns(10);
		textField_56.setBounds(220, 383, 36, 30);
		pnlScores.add(textField_56);
		
		textField_57 = new JTextField();
		textField_57.setColumns(10);
		textField_57.setBounds(260, 383, 36, 30);
		pnlScores.add(textField_57);
		
		textField_58 = new JTextField();
		textField_58.setColumns(10);
		textField_58.setBounds(300, 383, 36, 30);
		pnlScores.add(textField_58);
		
		textField_59 = new JTextField();
		textField_59.setColumns(10);
		textField_59.setBounds(340, 383, 36, 30);
		pnlScores.add(textField_59);
		
		textField_60 = new JTextField();
		textField_60.setColumns(10);
		textField_60.setBounds(380, 383, 36, 30);
		pnlScores.add(textField_60);
		
		textField_61 = new JTextField();
		textField_61.setColumns(10);
		textField_61.setBounds(420, 383, 36, 30);
		pnlScores.add(textField_61);
		
		textField_62 = new JTextField();
		textField_62.setColumns(10);
		textField_62.setBounds(460, 383, 36, 30);
		pnlScores.add(textField_62);
		
		textField_63 = new JTextField();
		textField_63.setColumns(10);
		textField_63.setBounds(500, 383, 36, 30);
		pnlScores.add(textField_63);
		
		

		
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
					// If user did not enter names default them
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
