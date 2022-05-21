package com.olympic.cis143.student.touche.gui;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;

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
	private JTextField txt1_1;
	private JTextField txt1_2;
	private JTextField txt1_3;
	private JTextField txt1_4;
	private JTextField txt1_5;
	private JTextField txt1_6;
	private JTextField txt1_7;
	private JTextField txt1_8;
	private JTextField txt2_1;
	private JTextField txt2_2;
	private JTextField txt2_3;
	private JTextField txt2_4;
	private JTextField txt2_5;
	private JTextField txt2_6;
	private JTextField txt2_7;
	private JTextField txt2_8;
	private JTextField txt3_1;
	private JTextField txt3_2;
	private JTextField txt3_3;
	private JTextField txt3_4;
	private JTextField txt3_5;
	private JTextField txt3_6;
	private JTextField txt3_7;
	private JTextField txt3_8;
	private JTextField txt4_1;
	private JTextField txt4_2;
	private JTextField txt4_3;
	private JTextField txt4_4;
	private JTextField txt4_5;
	private JTextField txt4_6;
	private JTextField txt4_7;
	private JTextField txt4_8;
	private JTextField txt5_1;
	private JTextField txt5_2;
	private JTextField txt5_3;
	private JTextField txt5_4;
	private JTextField txt5_5;
	private JTextField txt5_6;
	private JTextField txt5_7;
	private JTextField txt5_8;
	private JTextField txt6_1;
	private JTextField txt6_2;
	private JTextField txt6_3;
	private JTextField txt6_4;
	private JTextField txt6_5;
	private JTextField txt6_6;
	private JTextField txt6_7;
	private JTextField txt6_8;
	private JTextField txt7_1;
	private JTextField txt7_2;
	private JTextField txt7_3;
	private JTextField txt7_4;
	private JTextField txt7_5;
	private JTextField txt7_6;
	private JTextField txt7_7;
	private JTextField txt7_8;
	private JTextField txt8_1;
	private JTextField txt8_2;
	private JTextField txt8_3;
	private JTextField txt8_4;
	private JTextField txt8_5;
	private JTextField txt8_6;
	private JTextField txt8_7;
	private JTextField txt8_8;

	
	private List<JTextField> arrTxtFencers = new ArrayList<>();
	private List<JLabel> arrLblFencers = new ArrayList<>();

	
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

		
		JLabel lblFencer1 = new JLabel("Fencer1");
		lblFencer1.setBounds(164, 65, 63, 14);
		pnlFencers.add(lblFencer1);
		
		JLabel lblFencer2 = new JLabel("Fencer2");
		lblFencer2.setBounds(164, 121, 63, 14);
		pnlFencers.add(lblFencer2);
		
		JLabel lblFencer3 = new JLabel("Fencer3");
		lblFencer3.setBounds(164, 171, 63, 14);
		pnlFencers.add(lblFencer3);
		
		JLabel lblFencer4 = new JLabel("Fencer4");
		lblFencer4.setBounds(164, 221, 63, 14);
		pnlFencers.add(lblFencer4);
		
		JLabel lblFencer5 = new JLabel("Fencer5");
		lblFencer5.setBounds(164, 271, 63, 14);
		pnlFencers.add(lblFencer5);
		
		JLabel lblFencer6 = new JLabel("Fencer6");
		lblFencer6.setBounds(164, 321, 63, 14);
		pnlFencers.add(lblFencer6);
		
		JLabel lblFencer7 = new JLabel("Fencer7");
		lblFencer7.setBounds(164, 371, 63, 14);
		pnlFencers.add(lblFencer7);
		
		JLabel lblFencer8 = new JLabel("Fencer8");
		lblFencer8.setBounds(164, 421, 63, 14);
		pnlFencers.add(lblFencer8);
		
		
		// User entered list of fencers.
		
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

		
		
		
		JCheckBox chkFencer1 = new JCheckBox("Is this you?");
		chkFencer1.setBackground(Color.WHITE);
		chkFencer1.setBounds(538, 61, 99, 23);
		pnlFencers.add(chkFencer1);
		
		JCheckBox chkFencer2 = new JCheckBox("Is this you?");
		chkFencer2.setBackground(Color.WHITE);
		chkFencer2.setBounds(538, 117, 99, 23);
		pnlFencers.add(chkFencer2);
		
		JCheckBox chkFencer3 = new JCheckBox("Is this you?");
		chkFencer3.setBackground(Color.WHITE);
		chkFencer3.setBounds(538, 167, 99, 23);
		pnlFencers.add(chkFencer3);
		
		JCheckBox chkFencer4 = new JCheckBox("Is this you?");
		chkFencer4.setBackground(Color.WHITE);
		chkFencer4.setBounds(538, 217, 99, 23);
		pnlFencers.add(chkFencer4);
		
		JCheckBox chkFencer5 = new JCheckBox("Is this you?");
		chkFencer5.setBackground(Color.WHITE);
		chkFencer5.setBounds(538, 267, 99, 23);
		pnlFencers.add(chkFencer5);
		
		JCheckBox chkFencer6 = new JCheckBox("Is this you?");
		chkFencer6.setBackground(Color.WHITE);
		chkFencer6.setBounds(538, 317, 99, 23);
		pnlFencers.add(chkFencer6);
		
		JCheckBox chkFencer7 = new JCheckBox("Is this you?");
		chkFencer7.setBackground(Color.WHITE);
		chkFencer7.setBounds(538, 367, 99, 23);
		pnlFencers.add(chkFencer7);
		
		JCheckBox chkFencer8 = new JCheckBox("Is this you?");
		chkFencer8.setBackground(Color.WHITE);
		chkFencer8.setBounds(538, 417, 99, 23);
		pnlFencers.add(chkFencer8);
		
		JPanel pnlScores = new JPanel();
		pnlScores.setBackground(Color.WHITE);
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
		
		txt1_1 = new JTextField();
		txt1_1.setEditable(false);
		txt1_1.setBackground(Color.BLACK);
		txt1_1.setBounds(220, 145, 36, 30);
		pnlScores.add(txt1_1);
		txt1_1.setColumns(10);
		
		txt1_2 = new JTextField();
		txt1_2.setColumns(10);
		txt1_2.setBounds(260, 145, 36, 30);
		pnlScores.add(txt1_2);
		
		txt1_3 = new JTextField();
		txt1_3.setColumns(10);
		txt1_3.setBounds(300, 145, 36, 30);
		pnlScores.add(txt1_3);
		
		txt1_4 = new JTextField();
		txt1_4.setColumns(10);
		txt1_4.setBounds(340, 145, 36, 30);
		pnlScores.add(txt1_4);
		
		txt1_5 = new JTextField();
		txt1_5.setColumns(10);
		txt1_5.setBounds(380, 145, 36, 30);
		pnlScores.add(txt1_5);
		
		txt1_6 = new JTextField();
		txt1_6.setColumns(10);
		txt1_6.setBounds(420, 145, 36, 30);
		pnlScores.add(txt1_6);
		
		txt1_7 = new JTextField();
		txt1_7.setColumns(10);
		txt1_7.setBounds(460, 145, 36, 30);
		pnlScores.add(txt1_7);
		
		txt1_8 = new JTextField();
		txt1_8.setColumns(10);
		txt1_8.setBounds(500, 145, 36, 30);
		pnlScores.add(txt1_8);
		
		txt2_1 = new JTextField();
		txt2_1.setColumns(10);
		txt2_1.setBounds(220, 179, 36, 30);
		pnlScores.add(txt2_1);
		
		txt2_2 = new JTextField();
		txt2_2.setEditable(false);
		txt2_2.setBackground(Color.BLACK);
		txt2_2.setColumns(10);
		txt2_2.setBounds(260, 179, 36, 30);
		pnlScores.add(txt2_2);
		
		txt2_3 = new JTextField();
		txt2_3.setColumns(10);
		txt2_3.setBounds(300, 179, 36, 30);
		pnlScores.add(txt2_3);
		
		txt2_4 = new JTextField();
		txt2_4.setColumns(10);
		txt2_4.setBounds(340, 179, 36, 30);
		pnlScores.add(txt2_4);
		
		txt2_5 = new JTextField();
		txt2_5.setColumns(10);
		txt2_5.setBounds(380, 179, 36, 30);
		pnlScores.add(txt2_5);
		
		txt2_6 = new JTextField();
		txt2_6.setColumns(10);
		txt2_6.setBounds(420, 179, 36, 30);
		pnlScores.add(txt2_6);
		
		txt2_7 = new JTextField();
		txt2_7.setColumns(10);
		txt2_7.setBounds(460, 179, 36, 30);
		pnlScores.add(txt2_7);
		
		txt2_8 = new JTextField();
		txt2_8.setColumns(10);
		txt2_8.setBounds(500, 179, 36, 30);
		pnlScores.add(txt2_8);
		
		txt3_1 = new JTextField();
		txt3_1.setColumns(10);
		txt3_1.setBounds(220, 213, 36, 30);
		pnlScores.add(txt3_1);
		
		txt3_2 = new JTextField();
		txt3_2.setColumns(10);
		txt3_2.setBounds(260, 213, 36, 30);
		pnlScores.add(txt3_2);
		
		txt3_3 = new JTextField();
		txt3_3.setEditable(false);
		txt3_3.setBackground(Color.BLACK);
		txt3_3.setColumns(10);
		txt3_3.setBounds(300, 213, 36, 30);
		pnlScores.add(txt3_3);
		
		txt3_4 = new JTextField();
		txt3_4.setColumns(10);
		txt3_4.setBounds(340, 213, 36, 30);
		pnlScores.add(txt3_4);
		
		txt3_5 = new JTextField();
		txt3_5.setColumns(10);
		txt3_5.setBounds(380, 213, 36, 30);
		pnlScores.add(txt3_5);
		
		txt3_6 = new JTextField();
		txt3_6.setColumns(10);
		txt3_6.setBounds(420, 213, 36, 30);
		pnlScores.add(txt3_6);
		
		txt3_7 = new JTextField();
		txt3_7.setColumns(10);
		txt3_7.setBounds(460, 213, 36, 30);
		pnlScores.add(txt3_7);
		
		txt3_8 = new JTextField();
		txt3_8.setColumns(10);
		txt3_8.setBounds(500, 213, 36, 30);
		pnlScores.add(txt3_8);
		
		txt4_1 = new JTextField();
		txt4_1.setColumns(10);
		txt4_1.setBounds(220, 247, 36, 30);
		pnlScores.add(txt4_1);
		
		txt4_2 = new JTextField();
		txt4_2.setColumns(10);
		txt4_2.setBounds(260, 247, 36, 30);
		pnlScores.add(txt4_2);
		
		txt4_3 = new JTextField();
		txt4_3.setColumns(10);
		txt4_3.setBounds(300, 247, 36, 30);
		pnlScores.add(txt4_3);
		
		txt4_4 = new JTextField();
		txt4_4.setBackground(Color.BLACK);
		txt4_4.setEditable(false);
		txt4_4.setColumns(10);
		txt4_4.setBounds(340, 247, 36, 30);
		pnlScores.add(txt4_4);
		
		txt4_5 = new JTextField();
		txt4_5.setColumns(10);
		txt4_5.setBounds(380, 247, 36, 30);
		pnlScores.add(txt4_5);
		
		txt4_6 = new JTextField();
		txt4_6.setColumns(10);
		txt4_6.setBounds(420, 247, 36, 30);
		pnlScores.add(txt4_6);
		
		txt4_7 = new JTextField();
		txt4_7.setColumns(10);
		txt4_7.setBounds(460, 247, 36, 30);
		pnlScores.add(txt4_7);
		
		txt4_8 = new JTextField();
		txt4_8.setColumns(10);
		txt4_8.setBounds(500, 247, 36, 30);
		pnlScores.add(txt4_8);
		
		txt5_1 = new JTextField();
		txt5_1.setColumns(10);
		txt5_1.setBounds(220, 281, 36, 30);
		pnlScores.add(txt5_1);
		
		txt5_2 = new JTextField();
		txt5_2.setColumns(10);
		txt5_2.setBounds(260, 281, 36, 30);
		pnlScores.add(txt5_2);
		
		txt5_3 = new JTextField();
		txt5_3.setColumns(10);
		txt5_3.setBounds(300, 281, 36, 30);
		pnlScores.add(txt5_3);
		
		txt5_4 = new JTextField();
		txt5_4.setColumns(10);
		txt5_4.setBounds(340, 281, 36, 30);
		pnlScores.add(txt5_4);
		
		txt5_5 = new JTextField();
		txt5_5.setBackground(Color.BLACK);
		txt5_5.setEditable(false);
		txt5_5.setColumns(10);
		txt5_5.setBounds(380, 281, 36, 30);
		pnlScores.add(txt5_5);
		
		txt5_6 = new JTextField();
		txt5_6.setColumns(10);
		txt5_6.setBounds(420, 281, 36, 30);
		pnlScores.add(txt5_6);
		
		txt5_7 = new JTextField();
		txt5_7.setColumns(10);
		txt5_7.setBounds(460, 281, 36, 30);
		pnlScores.add(txt5_7);
		
		txt5_8 = new JTextField();
		txt5_8.setColumns(10);
		txt5_8.setBounds(500, 281, 36, 30);
		pnlScores.add(txt5_8);
		
		txt6_1 = new JTextField();
		txt6_1.setColumns(10);
		txt6_1.setBounds(220, 315, 36, 30);
		pnlScores.add(txt6_1);
		
		txt6_2 = new JTextField();
		txt6_2.setColumns(10);
		txt6_2.setBounds(260, 315, 36, 30);
		pnlScores.add(txt6_2);
		
		txt6_3 = new JTextField();
		txt6_3.setColumns(10);
		txt6_3.setBounds(300, 315, 36, 30);
		pnlScores.add(txt6_3);
		
		txt6_4 = new JTextField();
		txt6_4.setColumns(10);
		txt6_4.setBounds(340, 315, 36, 30);
		pnlScores.add(txt6_4);
		
		txt6_5 = new JTextField();
		txt6_5.setColumns(10);
		txt6_5.setBounds(380, 315, 36, 30);
		pnlScores.add(txt6_5);
		
		txt6_6 = new JTextField();
		txt6_6.setBackground(Color.BLACK);
		txt6_6.setEditable(false);
		txt6_6.setColumns(10);
		txt6_6.setBounds(420, 315, 36, 30);
		pnlScores.add(txt6_6);
		
		txt6_7 = new JTextField();
		txt6_7.setColumns(10);
		txt6_7.setBounds(460, 315, 36, 30);
		pnlScores.add(txt6_7);
		
		txt6_8 = new JTextField();
		txt6_8.setColumns(10);
		txt6_8.setBounds(500, 315, 36, 30);
		pnlScores.add(txt6_8);
		
		txt7_1 = new JTextField();
		txt7_1.setColumns(10);
		txt7_1.setBounds(220, 349, 36, 30);
		pnlScores.add(txt7_1);
		
		txt7_2 = new JTextField();
		txt7_2.setColumns(10);
		txt7_2.setBounds(260, 349, 36, 30);
		pnlScores.add(txt7_2);
		
		txt7_3 = new JTextField();
		txt7_3.setColumns(10);
		txt7_3.setBounds(300, 349, 36, 30);
		pnlScores.add(txt7_3);
		
		txt7_4 = new JTextField();
		txt7_4.setColumns(10);
		txt7_4.setBounds(340, 349, 36, 30);
		pnlScores.add(txt7_4);
		
		txt7_5 = new JTextField();
		txt7_5.setColumns(10);
		txt7_5.setBounds(380, 349, 36, 30);
		pnlScores.add(txt7_5);
		
		txt7_6 = new JTextField();
		txt7_6.setColumns(10);
		txt7_6.setBounds(420, 349, 36, 30);
		pnlScores.add(txt7_6);
		
		txt7_7 = new JTextField();
		txt7_7.setBackground(Color.BLACK);
		txt7_7.setEditable(false);
		txt7_7.setColumns(10);
		txt7_7.setBounds(460, 349, 36, 30);
		pnlScores.add(txt7_7);
		
		txt7_8 = new JTextField();
		txt7_8.setColumns(10);
		txt7_8.setBounds(500, 349, 36, 30);
		pnlScores.add(txt7_8);
		
		txt8_1 = new JTextField();
		txt8_1.setColumns(10);
		txt8_1.setBounds(220, 383, 36, 30);
		pnlScores.add(txt8_1);
		
		txt8_2 = new JTextField();
		txt8_2.setColumns(10);
		txt8_2.setBounds(260, 383, 36, 30);
		pnlScores.add(txt8_2);
		
		txt8_3 = new JTextField();
		txt8_3.setColumns(10);
		txt8_3.setBounds(300, 383, 36, 30);
		pnlScores.add(txt8_3);
		
		txt8_4 = new JTextField();
		txt8_4.setColumns(10);
		txt8_4.setBounds(340, 383, 36, 30);
		pnlScores.add(txt8_4);
		
		txt8_5 = new JTextField();
		txt8_5.setColumns(10);
		txt8_5.setBounds(380, 383, 36, 30);
		pnlScores.add(txt8_5);
		
		txt8_6 = new JTextField();
		txt8_6.setColumns(10);
		txt8_6.setBounds(420, 383, 36, 30);
		pnlScores.add(txt8_6);
		
		txt8_7 = new JTextField();
		txt8_7.setColumns(10);
		txt8_7.setBounds(460, 383, 36, 30);
		pnlScores.add(txt8_7);
		
		txt8_8 = new JTextField();
		txt8_8.setBackground(Color.BLACK);
		txt8_8.setEditable(false);
		txt8_8.setColumns(10);
		txt8_8.setBounds(500, 383, 36, 30);
		pnlScores.add(txt8_8);
		
		

		
		// ACTIONS
		
		
		// Tournament screen: OK clicked
		btnTournamentOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (rb4Fencers.isSelected()) {

					lblFencer5.setVisible(false);
					txtFencer5.setVisible(false);
					chkFencer5.setVisible(false);
					
					lblFencer6.setVisible(false);
					txtFencer6.setVisible(false);
					chkFencer6.setVisible(false);
					
					lblFencer7.setVisible(false);
					txtFencer7.setVisible(false);
					chkFencer7.setVisible(false);

					lblFencer8.setVisible(false);
					txtFencer8.setVisible(false);
					chkFencer8.setVisible(false);
					
				} else if (rb5Fencers.isSelected()) {
					
					lblFencer6.setVisible(false);
					txtFencer6.setVisible(false);
					chkFencer6.setVisible(false);
					
					lblFencer7.setVisible(false);
					txtFencer7.setVisible(false);
					chkFencer7.setVisible(false);

					lblFencer8.setVisible(false);
					txtFencer8.setVisible(false);
					chkFencer8.setVisible(false);
					
				} else if (rb6Fencers.isSelected()) {
					
					lblFencer7.setVisible(false);
					txtFencer7.setVisible(false);
					chkFencer7.setVisible(false);

					lblFencer8.setVisible(false);
					txtFencer8.setVisible(false);
					chkFencer8.setVisible(false);
					
				} else if (rb7Fencers.isSelected()) {
					
					lblFencer8.setVisible(false);
					txtFencer8.setVisible(false);
					chkFencer8.setVisible(false);
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
				
				if (!chkFencer1.isSelected() &&
					!chkFencer2.isSelected() &&
					!chkFencer3.isSelected() &&
					!chkFencer4.isSelected() &&
					!chkFencer5.isSelected() &&
					!chkFencer6.isSelected() &&
					!chkFencer7.isSelected() &&
					!chkFencer8.isSelected() ) {
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
		chkFencer1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (chkFencer1.isSelected()) {
					chkFencer2.setEnabled(false);
					chkFencer3.setEnabled(false);
					chkFencer4.setEnabled(false);
					chkFencer5.setEnabled(false);
					chkFencer6.setEnabled(false);
					chkFencer7.setEnabled(false);
					chkFencer8.setEnabled(false);
				} else {
					chkFencer2.setEnabled(true);
					chkFencer3.setEnabled(true);
					chkFencer4.setEnabled(true);
					chkFencer5.setEnabled(true);
					chkFencer6.setEnabled(true);
					chkFencer7.setEnabled(true);
					chkFencer8.setEnabled(true);
				}
			}
		});

		chkFencer2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (chkFencer2.isSelected()) {
					chkFencer1.setEnabled(false);
					chkFencer3.setEnabled(false);
					chkFencer4.setEnabled(false);
					chkFencer5.setEnabled(false);
					chkFencer6.setEnabled(false);
					chkFencer7.setEnabled(false);
					chkFencer8.setEnabled(false);
				} else {
					chkFencer1.setEnabled(true);
					chkFencer3.setEnabled(true);
					chkFencer4.setEnabled(true);
					chkFencer5.setEnabled(true);
					chkFencer6.setEnabled(true);
					chkFencer7.setEnabled(true);
					chkFencer8.setEnabled(true);
				}
			}
		});

		chkFencer3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (chkFencer3.isSelected()) {
					chkFencer1.setEnabled(false);
					chkFencer2.setEnabled(false);
					chkFencer4.setEnabled(false);
					chkFencer5.setEnabled(false);
					chkFencer6.setEnabled(false);
					chkFencer7.setEnabled(false);
					chkFencer8.setEnabled(false);
				} else {
					chkFencer1.setEnabled(true);
					chkFencer2.setEnabled(true);
					chkFencer4.setEnabled(true);
					chkFencer5.setEnabled(true);
					chkFencer6.setEnabled(true);
					chkFencer7.setEnabled(true);
					chkFencer8.setEnabled(true);
				}
			}
		});

		chkFencer4.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (chkFencer4.isSelected()) {
					chkFencer1.setEnabled(false);
					chkFencer2.setEnabled(false);
					chkFencer3.setEnabled(false);
					chkFencer5.setEnabled(false);
					chkFencer6.setEnabled(false);
					chkFencer7.setEnabled(false);
					chkFencer8.setEnabled(false);
				} else {
					chkFencer1.setEnabled(true);
					chkFencer2.setEnabled(true);
					chkFencer3.setEnabled(true);
					chkFencer5.setEnabled(true);
					chkFencer6.setEnabled(true);
					chkFencer7.setEnabled(true);
					chkFencer8.setEnabled(true);
				}
			}
		});

		chkFencer5.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (chkFencer5.isSelected()) {
					chkFencer1.setEnabled(false);
					chkFencer2.setEnabled(false);
					chkFencer3.setEnabled(false);
					chkFencer4.setEnabled(false);
					chkFencer6.setEnabled(false);
					chkFencer7.setEnabled(false);
					chkFencer8.setEnabled(false);
				} else {
					chkFencer1.setEnabled(true);
					chkFencer2.setEnabled(true);
					chkFencer3.setEnabled(true);
					chkFencer4.setEnabled(true);
					chkFencer6.setEnabled(true);
					chkFencer7.setEnabled(true);
					chkFencer8.setEnabled(true);
				}
			}
		});

		chkFencer6.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (chkFencer6.isSelected()) {
					chkFencer1.setEnabled(false);
					chkFencer2.setEnabled(false);
					chkFencer3.setEnabled(false);
					chkFencer4.setEnabled(false);
					chkFencer5.setEnabled(false);
					chkFencer7.setEnabled(false);
					chkFencer8.setEnabled(false);
				} else {
					chkFencer1.setEnabled(true);
					chkFencer2.setEnabled(true);
					chkFencer3.setEnabled(true);
					chkFencer4.setEnabled(true);
					chkFencer5.setEnabled(true);
					chkFencer7.setEnabled(true);
					chkFencer8.setEnabled(true);
				}
			}
		});

		chkFencer7.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (chkFencer7.isSelected()) {
					chkFencer1.setEnabled(false);
					chkFencer2.setEnabled(false);
					chkFencer3.setEnabled(false);
					chkFencer4.setEnabled(false);
					chkFencer5.setEnabled(false);
					chkFencer6.setEnabled(false);
					chkFencer8.setEnabled(false);
				} else {
					chkFencer1.setEnabled(true);
					chkFencer2.setEnabled(true);
					chkFencer3.setEnabled(true);
					chkFencer4.setEnabled(true);
					chkFencer5.setEnabled(true);
					chkFencer6.setEnabled(true);
					chkFencer8.setEnabled(true);
				}
			}
		});

		chkFencer8.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (chkFencer8.isSelected()) {
					chkFencer1.setEnabled(false);
					chkFencer2.setEnabled(false);
					chkFencer3.setEnabled(false);
					chkFencer4.setEnabled(false);
					chkFencer5.setEnabled(false);
					chkFencer6.setEnabled(false);
					chkFencer7.setEnabled(false);
				} else {
					chkFencer1.setEnabled(true);
					chkFencer2.setEnabled(true);
					chkFencer3.setEnabled(true);
					chkFencer4.setEnabled(true);
					chkFencer5.setEnabled(true);
					chkFencer6.setEnabled(true);
					chkFencer7.setEnabled(true);
				}
			}
		});
		
	}
}
