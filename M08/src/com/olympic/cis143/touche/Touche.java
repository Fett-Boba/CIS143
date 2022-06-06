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
import java.awt.Color;

public class Touche {
	
	// It aint pretty but it works mostly.  Brutishly brute forced, and very Fugly.
	// Will get turned in only if I am desperate...
	

	private JFrame frame;
	private JTextField txtTournamentName;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtF1;
	private JTextField txt11;
	private JTextField txt12;
	private JTextField txt13;
	private JTextField txt14;
	private JTextField txt15;
	private JTextField txt16;
	private JTextField txt17;
	private JTextField txt18;
	private JTextField txtV1;
	private JTextField txtTs1;
	private JTextField txtTr1;
	private JTextField txtInd1;
	private JTextField txtPl1;
	private JTextField txtF2;
	private JTextField txt21;
	private JTextField txt22;
	private JTextField txt23;
	private JTextField txt24;
	private JTextField txt25;
	private JTextField txt26;
	private JTextField txt27;
	private JTextField txt28;
	private JTextField txtV2;
	private JTextField txtTs2;
	private JTextField txtTr2;
	private JTextField txtInd2;
	private JTextField txtPl2;
	private JTextField txtF3;
	private JTextField txt31;
	private JTextField txt32;
	private JTextField txt33;
	private JTextField txt34;
	private JTextField txt35;
	private JTextField txt36;
	private JTextField txt37;
	private JTextField txt38;
	private JTextField txtV3;
	private JTextField txtTs3;
	private JTextField txtTr3;
	private JTextField txtInd3;
	private JTextField txtPl3;
	private JTextField txtF4;
	private JTextField txt41;
	private JTextField txt43;
	private JTextField txt44;
	private JTextField txt45;
	private JTextField txt46;
	private JTextField txt47;
	private JTextField txt48;
	private JTextField txtV4;
	private JTextField txtTs4;
	private JTextField txtTr4;
	private JTextField txtInd4;
	private JTextField txtPl4;
	private JTextField txtF5;
	private JTextField txt51;
	private JTextField txt52;
	private JTextField txt53;
	private JTextField txt54;
	private JTextField txt55;
	private JTextField txt56;
	private JTextField txt57;
	private JTextField txt58;
	private JTextField txtV5;
	private JTextField txtTs5;
	private JTextField txtTr5;
	private JTextField txtInd5;
	private JTextField txtPl5;
	private JTextField txtF6;
	private JTextField txt61;
	private JTextField txt62;
	private JTextField txt63;
	private JTextField txt64;
	private JTextField txt65;
	private JTextField txt66;
	private JTextField txt67;
	private JTextField txt68;
	private JTextField txtV6;
	private JTextField txtTs6;
	private JTextField txtTr6;
	private JTextField txtInd6;
	private JTextField txtPl6;
	private JTextField txtF7;
	private JTextField txt71;
	private JTextField txt72;
	private JTextField txt73;
	private JTextField txt74;
	private JTextField txt75;
	private JTextField txt76;
	private JTextField txt77;
	private JTextField txt78;
	private JTextField txtV7;
	private JTextField txtTs7;
	private JTextField txtTr7;
	private JTextField txtInd7;
	private JTextField txtPl7;
	private JTextField txtF8;
	private JTextField txt81;
	private JTextField txt82;
	private JTextField txt83;
	private JTextField txt84;
	private JTextField txt85;
	private JTextField txt86;
	private JTextField txt87;
	private JTextField txt88;
	private JTextField txtV8;
	private JTextField txtTs8;
	private JTextField txtTr8;
	private JTextField txtInd8;
	private JTextField txtPl8;
	private JButton btnCalcF2;
	private JButton btnCalcF3;
	private JButton btnCalcF4;
	private JButton btnCalcF5;
	private JButton btnCalcF6;
	private JButton btnCalcF7;
	private JButton btnCalcF8;
	private JButton btnCompletePool;
	
	
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
		frame.setBounds(100, 100, 921, 494);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel pnlTournament = new JPanel();
		frame.getContentPane().add(pnlTournament, "tournament");
		
		JPanel pnlScores = new JPanel();
		frame.getContentPane().add(pnlScores, "scores");
		pnlScores.setLayout(null);
		
		txtF1 = new JTextField();
		txtF1.setText("Fencer1");
		txtF1.setBounds(10, 76, 159, 20);
		pnlScores.add(txtF1);
		txtF1.setColumns(10);
		
		txt11 = new JTextField();
		txt11.setBackground(Color.BLACK);
		txt11.setEditable(false);
		txt11.setColumns(10);
		txt11.setBounds(214, 76, 25, 20);
		pnlScores.add(txt11);
		
		txt12 = new JTextField();
		txt12.setColumns(10);
		txt12.setBounds(249, 76, 25, 20);
		pnlScores.add(txt12);
		
		txt13 = new JTextField();
		txt13.setColumns(10);
		txt13.setBounds(284, 76, 25, 20);
		pnlScores.add(txt13);
		
		txt14 = new JTextField();
		txt14.setColumns(10);
		txt14.setBounds(319, 76, 25, 20);
		pnlScores.add(txt14);
		
		txt15 = new JTextField();
		txt15.setColumns(10);
		txt15.setBounds(354, 76, 25, 20);
		pnlScores.add(txt15);
		
		txt16 = new JTextField();
		txt16.setColumns(10);
		txt16.setBounds(389, 76, 25, 20);
		pnlScores.add(txt16);
		
		txt17 = new JTextField();
		txt17.setColumns(10);
		txt17.setBounds(424, 76, 25, 20);
		pnlScores.add(txt17);
		
		txt18 = new JTextField();
		txt18.setColumns(10);
		txt18.setBounds(459, 76, 25, 20);
		pnlScores.add(txt18);
		
		txtV1 = new JTextField();
		txtV1.setColumns(10);
		txtV1.setBounds(506, 76, 25, 20);
		pnlScores.add(txtV1);
		
		txtTs1 = new JTextField();
		txtTs1.setColumns(10);
		txtTs1.setBounds(541, 76, 25, 20);
		pnlScores.add(txtTs1);
		
		txtTr1 = new JTextField();
		txtTr1.setColumns(10);
		txtTr1.setBounds(576, 76, 25, 20);
		pnlScores.add(txtTr1);
		
		txtInd1 = new JTextField();
		txtInd1.setColumns(10);
		txtInd1.setBounds(611, 76, 25, 20);
		pnlScores.add(txtInd1);
		
		txtPl1 = new JTextField();
		txtPl1.setColumns(10);
		txtPl1.setBounds(646, 76, 25, 20);
		pnlScores.add(txtPl1);
		
		txtF2 = new JTextField();
		txtF2.setText("Fencer2");
		txtF2.setColumns(10);
		txtF2.setBounds(10, 107, 159, 20);
		pnlScores.add(txtF2);
		
		txt21 = new JTextField();
		txt21.setColumns(10);
		txt21.setBounds(214, 107, 25, 20);
		pnlScores.add(txt21);
		
		txt22 = new JTextField();
		txt22.setBackground(Color.BLACK);
		txt22.setEditable(false);
		txt22.setColumns(10);
		txt22.setBounds(249, 107, 25, 20);
		pnlScores.add(txt22);
		
		txt23 = new JTextField();
		txt23.setColumns(10);
		txt23.setBounds(284, 107, 25, 20);
		pnlScores.add(txt23);
		
		txt24 = new JTextField();
		txt24.setColumns(10);
		txt24.setBounds(319, 107, 25, 20);
		pnlScores.add(txt24);
		
		txt25 = new JTextField();
		txt25.setColumns(10);
		txt25.setBounds(354, 107, 25, 20);
		pnlScores.add(txt25);
		
		txt26 = new JTextField();
		txt26.setColumns(10);
		txt26.setBounds(389, 107, 25, 20);
		pnlScores.add(txt26);
		
		txt27 = new JTextField();
		txt27.setColumns(10);
		txt27.setBounds(424, 107, 25, 20);
		pnlScores.add(txt27);
		
		txt28 = new JTextField();
		txt28.setColumns(10);
		txt28.setBounds(459, 107, 25, 20);
		pnlScores.add(txt28);
		
		txtV2 = new JTextField();
		txtV2.setColumns(10);
		txtV2.setBounds(506, 107, 25, 20);
		pnlScores.add(txtV2);
		
		txtTs2 = new JTextField();
		txtTs2.setColumns(10);
		txtTs2.setBounds(541, 107, 25, 20);
		pnlScores.add(txtTs2);
		
		txtTr2 = new JTextField();
		txtTr2.setColumns(10);
		txtTr2.setBounds(576, 107, 25, 20);
		pnlScores.add(txtTr2);
		
		txtInd2 = new JTextField();
		txtInd2.setColumns(10);
		txtInd2.setBounds(611, 107, 25, 20);
		pnlScores.add(txtInd2);
		
		txtPl2 = new JTextField();
		txtPl2.setColumns(10);
		txtPl2.setBounds(646, 107, 25, 20);
		pnlScores.add(txtPl2);
		
		txtF3 = new JTextField();
		txtF3.setText("Fencer3");
		txtF3.setColumns(10);
		txtF3.setBounds(10, 138, 159, 20);
		pnlScores.add(txtF3);
		
		txt31 = new JTextField();
		txt31.setColumns(10);
		txt31.setBounds(214, 138, 25, 20);
		pnlScores.add(txt31);
		
		txt32 = new JTextField();
		txt32.setColumns(10);
		txt32.setBounds(249, 138, 25, 20);
		pnlScores.add(txt32);
		
		txt33 = new JTextField();
		txt33.setBackground(Color.BLACK);
		txt33.setEditable(false);
		txt33.setColumns(10);
		txt33.setBounds(284, 138, 25, 20);
		pnlScores.add(txt33);
		
		txt34 = new JTextField();
		txt34.setColumns(10);
		txt34.setBounds(319, 138, 25, 20);
		pnlScores.add(txt34);
		
		txt35 = new JTextField();
		txt35.setColumns(10);
		txt35.setBounds(354, 138, 25, 20);
		pnlScores.add(txt35);
		
		txt36 = new JTextField();
		txt36.setColumns(10);
		txt36.setBounds(389, 138, 25, 20);
		pnlScores.add(txt36);
		
		txt37 = new JTextField();
		txt37.setColumns(10);
		txt37.setBounds(424, 138, 25, 20);
		pnlScores.add(txt37);
		
		txt38 = new JTextField();
		txt38.setColumns(10);
		txt38.setBounds(459, 138, 25, 20);
		pnlScores.add(txt38);
		
		txtV3 = new JTextField();
		txtV3.setColumns(10);
		txtV3.setBounds(506, 138, 25, 20);
		pnlScores.add(txtV3);
		
		txtTs3 = new JTextField();
		txtTs3.setColumns(10);
		txtTs3.setBounds(541, 138, 25, 20);
		pnlScores.add(txtTs3);
		
		txtTr3 = new JTextField();
		txtTr3.setColumns(10);
		txtTr3.setBounds(576, 138, 25, 20);
		pnlScores.add(txtTr3);
		
		txtInd3 = new JTextField();
		txtInd3.setColumns(10);
		txtInd3.setBounds(611, 138, 25, 20);
		pnlScores.add(txtInd3);
		
		txtPl3 = new JTextField();
		txtPl3.setColumns(10);
		txtPl3.setBounds(646, 138, 25, 20);
		pnlScores.add(txtPl3);
		
		txtF4 = new JTextField();
		txtF4.setText("Fencer4");
		txtF4.setColumns(10);
		txtF4.setBounds(10, 169, 159, 20);
		pnlScores.add(txtF4);
		
		txt41 = new JTextField();
		txt41.setColumns(10);
		txt41.setBounds(214, 169, 25, 20);
		pnlScores.add(txt41);
		
		JTextField txt42 = new JTextField();
		txt42.setColumns(10);
		txt42.setBounds(249, 169, 25, 20);
		pnlScores.add(txt42);
		
		txt43 = new JTextField();
		txt43.setColumns(10);
		txt43.setBounds(284, 169, 25, 20);
		pnlScores.add(txt43);
		
		txt44 = new JTextField();
		txt44.setBackground(Color.BLACK);
		txt44.setEditable(false);
		txt44.setColumns(10);
		txt44.setBounds(319, 169, 25, 20);
		pnlScores.add(txt44);
		
		txt45 = new JTextField();
		txt45.setColumns(10);
		txt45.setBounds(354, 169, 25, 20);
		pnlScores.add(txt45);
		
		txt46 = new JTextField();
		txt46.setColumns(10);
		txt46.setBounds(389, 169, 25, 20);
		pnlScores.add(txt46);
		
		txt47 = new JTextField();
		txt47.setColumns(10);
		txt47.setBounds(424, 169, 25, 20);
		pnlScores.add(txt47);
		
		txt48 = new JTextField();
		txt48.setColumns(10);
		txt48.setBounds(459, 169, 25, 20);
		pnlScores.add(txt48);
		
		txtV4 = new JTextField();
		txtV4.setColumns(10);
		txtV4.setBounds(506, 169, 25, 20);
		pnlScores.add(txtV4);
		
		txtTs4 = new JTextField();
		txtTs4.setColumns(10);
		txtTs4.setBounds(541, 169, 25, 20);
		pnlScores.add(txtTs4);
		
		txtTr4 = new JTextField();
		txtTr4.setColumns(10);
		txtTr4.setBounds(576, 169, 25, 20);
		pnlScores.add(txtTr4);
		
		txtInd4 = new JTextField();
		txtInd4.setColumns(10);
		txtInd4.setBounds(611, 169, 25, 20);
		pnlScores.add(txtInd4);
		
		txtPl4 = new JTextField();
		txtPl4.setColumns(10);
		txtPl4.setBounds(646, 169, 25, 20);
		pnlScores.add(txtPl4);
		
		txtF5 = new JTextField();
		txtF5.setText("Fencer5");
		txtF5.setColumns(10);
		txtF5.setBounds(10, 199, 159, 20);
		pnlScores.add(txtF5);
		
		txt51 = new JTextField();
		txt51.setColumns(10);
		txt51.setBounds(214, 199, 25, 20);
		pnlScores.add(txt51);
		
		txt52 = new JTextField();
		txt52.setColumns(10);
		txt52.setBounds(249, 199, 25, 20);
		pnlScores.add(txt52);
		
		txt53 = new JTextField();
		txt53.setColumns(10);
		txt53.setBounds(284, 199, 25, 20);
		pnlScores.add(txt53);
		
		txt54 = new JTextField();
		txt54.setColumns(10);
		txt54.setBounds(319, 199, 25, 20);
		pnlScores.add(txt54);
		
		txt55 = new JTextField();
		txt55.setBackground(Color.BLACK);
		txt55.setEditable(false);
		txt55.setColumns(10);
		txt55.setBounds(354, 199, 25, 20);
		pnlScores.add(txt55);
		
		txt56 = new JTextField();
		txt56.setColumns(10);
		txt56.setBounds(389, 199, 25, 20);
		pnlScores.add(txt56);
		
		txt57 = new JTextField();
		txt57.setColumns(10);
		txt57.setBounds(424, 199, 25, 20);
		pnlScores.add(txt57);
		
		txt58 = new JTextField();
		txt58.setColumns(10);
		txt58.setBounds(459, 199, 25, 20);
		pnlScores.add(txt58);
		
		txtV5 = new JTextField();
		txtV5.setColumns(10);
		txtV5.setBounds(506, 199, 25, 20);
		pnlScores.add(txtV5);
		
		txtTs5 = new JTextField();
		txtTs5.setColumns(10);
		txtTs5.setBounds(541, 199, 25, 20);
		pnlScores.add(txtTs5);
		
		txtTr5 = new JTextField();
		txtTr5.setColumns(10);
		txtTr5.setBounds(576, 199, 25, 20);
		pnlScores.add(txtTr5);
		
		txtInd5 = new JTextField();
		txtInd5.setColumns(10);
		txtInd5.setBounds(611, 199, 25, 20);
		pnlScores.add(txtInd5);
		
		txtPl5 = new JTextField();
		txtPl5.setColumns(10);
		txtPl5.setBounds(646, 199, 25, 20);
		pnlScores.add(txtPl5);
		
		txtF6 = new JTextField();
		txtF6.setText("Fencer6");
		txtF6.setColumns(10);
		txtF6.setBounds(10, 230, 159, 20);
		pnlScores.add(txtF6);
		
		txt61 = new JTextField();
		txt61.setColumns(10);
		txt61.setBounds(214, 230, 25, 20);
		pnlScores.add(txt61);
		
		txt62 = new JTextField();
		txt62.setColumns(10);
		txt62.setBounds(249, 230, 25, 20);
		pnlScores.add(txt62);
		
		txt63 = new JTextField();
		txt63.setColumns(10);
		txt63.setBounds(284, 230, 25, 20);
		pnlScores.add(txt63);
		
		txt64 = new JTextField();
		txt64.setColumns(10);
		txt64.setBounds(319, 230, 25, 20);
		pnlScores.add(txt64);
		
		txt65 = new JTextField();
		txt65.setColumns(10);
		txt65.setBounds(354, 230, 25, 20);
		pnlScores.add(txt65);
		
		txt66 = new JTextField();
		txt66.setBackground(Color.BLACK);
		txt66.setEditable(false);
		txt66.setColumns(10);
		txt66.setBounds(389, 230, 25, 20);
		pnlScores.add(txt66);
		
		txt67 = new JTextField();
		txt67.setColumns(10);
		txt67.setBounds(424, 230, 25, 20);
		pnlScores.add(txt67);
		
		txt68 = new JTextField();
		txt68.setColumns(10);
		txt68.setBounds(459, 230, 25, 20);
		pnlScores.add(txt68);
		
		txtV6 = new JTextField();
		txtV6.setColumns(10);
		txtV6.setBounds(506, 230, 25, 20);
		pnlScores.add(txtV6);
		
		txtTs6 = new JTextField();
		txtTs6.setColumns(10);
		txtTs6.setBounds(541, 230, 25, 20);
		pnlScores.add(txtTs6);
		
		txtTr6 = new JTextField();
		txtTr6.setColumns(10);
		txtTr6.setBounds(576, 230, 25, 20);
		pnlScores.add(txtTr6);
		
		txtInd6 = new JTextField();
		txtInd6.setColumns(10);
		txtInd6.setBounds(611, 230, 25, 20);
		pnlScores.add(txtInd6);
		
		txtPl6 = new JTextField();
		txtPl6.setColumns(10);
		txtPl6.setBounds(646, 230, 25, 20);
		pnlScores.add(txtPl6);
		
		txtF7 = new JTextField();
		txtF7.setText("Fencer7");
		txtF7.setColumns(10);
		txtF7.setBounds(10, 261, 159, 20);
		pnlScores.add(txtF7);
		
		txt71 = new JTextField();
		txt71.setColumns(10);
		txt71.setBounds(214, 261, 25, 20);
		pnlScores.add(txt71);
		
		txt72 = new JTextField();
		txt72.setColumns(10);
		txt72.setBounds(249, 261, 25, 20);
		pnlScores.add(txt72);
		
		txt73 = new JTextField();
		txt73.setColumns(10);
		txt73.setBounds(284, 261, 25, 20);
		pnlScores.add(txt73);
		
		txt74 = new JTextField();
		txt74.setColumns(10);
		txt74.setBounds(319, 261, 25, 20);
		pnlScores.add(txt74);
		
		txt75 = new JTextField();
		txt75.setColumns(10);
		txt75.setBounds(354, 261, 25, 20);
		pnlScores.add(txt75);
		
		txt76 = new JTextField();
		txt76.setColumns(10);
		txt76.setBounds(389, 261, 25, 20);
		pnlScores.add(txt76);
		
		txt77 = new JTextField();
		txt77.setBackground(Color.BLACK);
		txt77.setEditable(false);
		txt77.setColumns(10);
		txt77.setBounds(424, 261, 25, 20);
		pnlScores.add(txt77);
		
		txt78 = new JTextField();
		txt78.setColumns(10);
		txt78.setBounds(459, 261, 25, 20);
		pnlScores.add(txt78);
		
		txtV7 = new JTextField();
		txtV7.setColumns(10);
		txtV7.setBounds(506, 261, 25, 20);
		pnlScores.add(txtV7);
		
		txtTs7 = new JTextField();
		txtTs7.setColumns(10);
		txtTs7.setBounds(541, 261, 25, 20);
		pnlScores.add(txtTs7);
		
		txtTr7 = new JTextField();
		txtTr7.setColumns(10);
		txtTr7.setBounds(576, 261, 25, 20);
		pnlScores.add(txtTr7);
		
		txtInd7 = new JTextField();
		txtInd7.setColumns(10);
		txtInd7.setBounds(611, 261, 25, 20);
		pnlScores.add(txtInd7);
		
		txtPl7 = new JTextField();
		txtPl7.setColumns(10);
		txtPl7.setBounds(646, 261, 25, 20);
		pnlScores.add(txtPl7);
		
		txtF8 = new JTextField();
		txtF8.setText("Fencer8");
		txtF8.setColumns(10);
		txtF8.setBounds(10, 292, 159, 20);
		pnlScores.add(txtF8);
		
		txt81 = new JTextField();
		txt81.setColumns(10);
		txt81.setBounds(214, 292, 25, 20);
		pnlScores.add(txt81);
		
		txt82 = new JTextField();
		txt82.setColumns(10);
		txt82.setBounds(249, 292, 25, 20);
		pnlScores.add(txt82);
		
		txt83 = new JTextField();
		txt83.setColumns(10);
		txt83.setBounds(284, 292, 25, 20);
		pnlScores.add(txt83);
		
		txt84 = new JTextField();
		txt84.setColumns(10);
		txt84.setBounds(319, 292, 25, 20);
		pnlScores.add(txt84);
		
		txt85 = new JTextField();
		txt85.setColumns(10);
		txt85.setBounds(354, 292, 25, 20);
		pnlScores.add(txt85);
		
		txt86 = new JTextField();
		txt86.setColumns(10);
		txt86.setBounds(389, 292, 25, 20);
		pnlScores.add(txt86);
		
		txt87 = new JTextField();
		txt87.setColumns(10);
		txt87.setBounds(424, 292, 25, 20);
		pnlScores.add(txt87);
		
		txt88 = new JTextField();
		txt88.setBackground(Color.BLACK);
		txt88.setEditable(false);
		txt88.setColumns(10);
		txt88.setBounds(459, 292, 25, 20);
		pnlScores.add(txt88);
		
		txtV8 = new JTextField();
		txtV8.setColumns(10);
		txtV8.setBounds(506, 292, 25, 20);
		pnlScores.add(txtV8);
		
		txtTs8 = new JTextField();
		txtTs8.setColumns(10);
		txtTs8.setBounds(541, 292, 25, 20);
		pnlScores.add(txtTs8);
		
		txtTr8 = new JTextField();
		txtTr8.setColumns(10);
		txtTr8.setBounds(576, 292, 25, 20);
		pnlScores.add(txtTr8);
		
		txtInd8 = new JTextField();
		txtInd8.setColumns(10);
		txtInd8.setBounds(611, 292, 25, 20);
		pnlScores.add(txtInd8);
		
		txtPl8 = new JTextField();
		txtPl8.setColumns(10);
		txtPl8.setBounds(646, 292, 25, 20);
		pnlScores.add(txtPl8);
		
		JButton btnCalcF1 = new JButton("Calculate Indicator");
		btnCalcF1.setBounds(691, 75, 150, 23);
		pnlScores.add(btnCalcF1);
		
		btnCalcF2 = new JButton("Calculate Indicator");
		btnCalcF2.setBounds(691, 106, 150, 23);
		pnlScores.add(btnCalcF2);
		
		btnCalcF3 = new JButton("Calculate Indicator");
		btnCalcF3.setBounds(691, 137, 150, 23);
		pnlScores.add(btnCalcF3);
		
		btnCalcF4 = new JButton("Calculate Indicator");
		btnCalcF4.setBounds(691, 168, 150, 23);
		pnlScores.add(btnCalcF4);
		
		btnCalcF5 = new JButton("Calculate Indicator");
		btnCalcF5.setBounds(691, 198, 150, 23);
		pnlScores.add(btnCalcF5);
		
		btnCalcF6 = new JButton("Calculate Indicator");
		btnCalcF6.setBounds(691, 229, 150, 23);
		pnlScores.add(btnCalcF6);
		
		btnCalcF7 = new JButton("Calculate Indicator");
		btnCalcF7.setBounds(691, 260, 150, 23);
		pnlScores.add(btnCalcF7);
		
		btnCalcF8 = new JButton("Calculate Indicator");
		btnCalcF8.setBounds(691, 291, 150, 23);
		pnlScores.add(btnCalcF8);
		
		btnCompletePool = new JButton("Complete Pool");
		btnCompletePool.setBounds(354, 364, 159, 23);
		pnlScores.add(btnCompletePool);
		
		
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

		// LISTENER: Fencer 1 calculate

		btnCalcF1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Fencer f1 = new Fencer();
				f1.setFencerNum(1);
				f1.setName(txtF1.getText());
				
				f1.setTs2(Integer.parseInt(txt12.getText()));
				f1.setTs3(Integer.parseInt(txt13.getText()));
				f1.setTs4(Integer.parseInt(txt14.getText()));
				f1.setTs5(Integer.parseInt(txt15.getText()));
				f1.setTs6(Integer.parseInt(txt16.getText()));
				f1.setTs7(Integer.parseInt(txt17.getText()));
				f1.setTs8(Integer.parseInt(txt18.getText()));
				
				f1.setTr2(Integer.parseInt(txt21.getText()));
				f1.setTr3(Integer.parseInt(txt31.getText()));
				f1.setTr4(Integer.parseInt(txt41.getText()));
				f1.setTr5(Integer.parseInt(txt51.getText()));
				f1.setTr6(Integer.parseInt(txt61.getText()));
				f1.setTr7(Integer.parseInt(txt71.getText()));
				f1.setTr8(Integer.parseInt(txt81.getText()));
				
				f1.setVictories(f1.calculateVictories());
				f1.setTotalTouchesScored(f1.calculateTouchesScored());
				f1.setTotalTouchesReceived(f1.calculateTouchesReceived());
				f1.setIndicator(f1.calculateIndicator());
				
				
				txtV1.setText(Integer.toString(f1.getVictories()));
				txtTs1.setText(Integer.toString(f1.getTotalTouchesScored()));
				txtTr1.setText(Integer.toString(f1.getTotalTouchesReceived()));
				txtInd1.setText(Integer.toString(f1.getIndicator()));
				//txtPl1.setText(Integer.toString(f1.getPlace()));

				System.out.println(f1);
			}
		});

		
		// LISTENER: Fencer 2 calculate

		btnCalcF2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Fencer f2 = new Fencer();
				f2.setFencerNum(2);
				f2.setName(txtF2.getText());
				
				f2.setTs1(Integer.parseInt(txt21.getText()));
				f2.setTs3(Integer.parseInt(txt23.getText()));
				f2.setTs4(Integer.parseInt(txt24.getText()));
				f2.setTs5(Integer.parseInt(txt25.getText()));
				f2.setTs6(Integer.parseInt(txt26.getText()));
				f2.setTs7(Integer.parseInt(txt27.getText()));
				f2.setTs8(Integer.parseInt(txt28.getText()));
				
				f2.setTr1(Integer.parseInt(txt12.getText()));
				f2.setTr3(Integer.parseInt(txt32.getText()));
				f2.setTr4(Integer.parseInt(txt42.getText()));
				f2.setTr5(Integer.parseInt(txt52.getText()));
				f2.setTr6(Integer.parseInt(txt62.getText()));
				f2.setTr7(Integer.parseInt(txt72.getText()));
				f2.setTr8(Integer.parseInt(txt82.getText()));
				
				f2.setVictories(f2.calculateVictories());
				f2.setTotalTouchesScored(f2.calculateTouchesScored());
				f2.setTotalTouchesReceived(f2.calculateTouchesReceived());
				f2.setIndicator(f2.calculateIndicator());
				
				txtV2.setText(Integer.toString(f2.getVictories()));
				txtTs2.setText(Integer.toString(f2.getTotalTouchesScored()));
				txtTr2.setText(Integer.toString(f2.getTotalTouchesReceived()));
				txtInd2.setText(Integer.toString(f2.getIndicator()));
				//txtPl2.setText(Integer.toString(f2.getPlace()));

				System.out.println(f2);
			}
		});

		// LISTENER: Fencer 3 calculate

		btnCalcF3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Fencer f3 = new Fencer();
				f3.setFencerNum(3);
				f3.setName(txtF3.getText());
				
				f3.setTs1(Integer.parseInt(txt31.getText()));
				f3.setTs2(Integer.parseInt(txt32.getText()));
				f3.setTs4(Integer.parseInt(txt34.getText()));
				f3.setTs5(Integer.parseInt(txt35.getText()));
				f3.setTs6(Integer.parseInt(txt36.getText()));
				f3.setTs7(Integer.parseInt(txt37.getText()));
				f3.setTs8(Integer.parseInt(txt38.getText()));
				
				f3.setTr1(Integer.parseInt(txt13.getText()));
				f3.setTr2(Integer.parseInt(txt23.getText()));
				f3.setTr4(Integer.parseInt(txt43.getText()));
				f3.setTr5(Integer.parseInt(txt53.getText()));
				f3.setTr6(Integer.parseInt(txt63.getText()));
				f3.setTr7(Integer.parseInt(txt73.getText()));
				f3.setTr8(Integer.parseInt(txt83.getText()));
				
				f3.setVictories(f3.calculateVictories());
				f3.setTotalTouchesScored(f3.calculateTouchesScored());
				f3.setTotalTouchesReceived(f3.calculateTouchesReceived());
				f3.setIndicator(f3.calculateIndicator());
				
				txtV3.setText(Integer.toString(f3.getVictories()));
				txtTs3.setText(Integer.toString(f3.getTotalTouchesScored()));
				txtTr3.setText(Integer.toString(f3.getTotalTouchesReceived()));
				txtInd3.setText(Integer.toString(f3.getIndicator()));
				//txtPl3.setText(Integer.toString(f3.getPlace()));

				System.out.println(f3);
			}
		});
		
		// LISTENER: Fencer 4 calculate

		btnCalcF4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Fencer f4 = new Fencer();
				f4.setFencerNum(4);
				f4.setName(txtF4.getText());
				
				f4.setTs1(Integer.parseInt(txt41.getText()));
				f4.setTs2(Integer.parseInt(txt42.getText()));
				f4.setTs3(Integer.parseInt(txt43.getText()));
				f4.setTs5(Integer.parseInt(txt45.getText()));
				f4.setTs6(Integer.parseInt(txt46.getText()));
				f4.setTs7(Integer.parseInt(txt47.getText()));
				f4.setTs8(Integer.parseInt(txt48.getText()));
				
				f4.setTr1(Integer.parseInt(txt14.getText()));
				f4.setTr2(Integer.parseInt(txt24.getText()));
				f4.setTr3(Integer.parseInt(txt34.getText()));
				f4.setTr5(Integer.parseInt(txt54.getText()));
				f4.setTr6(Integer.parseInt(txt64.getText()));
				f4.setTr7(Integer.parseInt(txt74.getText()));
				f4.setTr8(Integer.parseInt(txt84.getText()));
				
				f4.setVictories(f4.calculateVictories());
				f4.setTotalTouchesScored(f4.calculateTouchesScored());
				f4.setTotalTouchesReceived(f4.calculateTouchesReceived());
				f4.setIndicator(f4.calculateIndicator());
				
				txtV4.setText(Integer.toString(f4.getVictories()));
				txtTs4.setText(Integer.toString(f4.getTotalTouchesScored()));
				txtTr4.setText(Integer.toString(f4.getTotalTouchesReceived()));
				txtInd4.setText(Integer.toString(f4.getIndicator()));
				//txtPl4.setText(Integer.toString(f4.getPlace()));

				System.out.println(f4);
			}
		});
		
		// LISTENER: Fencer 5 calculate

		btnCalcF5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Fencer f5 = new Fencer();
				f5.setFencerNum(5);
				f5.setName(txtF5.getText());
				
				f5.setTs1(Integer.parseInt(txt51.getText()));
				f5.setTs2(Integer.parseInt(txt52.getText()));
				f5.setTs3(Integer.parseInt(txt53.getText()));
				f5.setTs4(Integer.parseInt(txt54.getText()));
				f5.setTs6(Integer.parseInt(txt56.getText()));
				f5.setTs7(Integer.parseInt(txt57.getText()));
				f5.setTs8(Integer.parseInt(txt58.getText()));
				
				f5.setTr1(Integer.parseInt(txt15.getText()));
				f5.setTr2(Integer.parseInt(txt25.getText()));
				f5.setTr3(Integer.parseInt(txt35.getText()));
				f5.setTr4(Integer.parseInt(txt45.getText()));
				f5.setTr6(Integer.parseInt(txt65.getText()));
				f5.setTr7(Integer.parseInt(txt75.getText()));
				f5.setTr8(Integer.parseInt(txt85.getText()));
				
				f5.setVictories(f5.calculateVictories());
				f5.setTotalTouchesScored(f5.calculateTouchesScored());
				f5.setTotalTouchesReceived(f5.calculateTouchesReceived());
				f5.setIndicator(f5.calculateIndicator());
				
				txtV5.setText(Integer.toString(f5.getVictories()));
				txtTs5.setText(Integer.toString(f5.getTotalTouchesScored()));
				txtTr5.setText(Integer.toString(f5.getTotalTouchesReceived()));
				txtInd5.setText(Integer.toString(f5.getIndicator()));
				//txtPl5.setText(Integer.toString(f5.getPlace()));

				System.out.println(f5);
			}
		});
		
		
		// LISTENER: Fencer 6 calculate

		btnCalcF6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Fencer f6 = new Fencer();
				f6.setFencerNum(6);
				f6.setName(txtF6.getText());
				
				f6.setTs1(Integer.parseInt(txt61.getText()));
				f6.setTs2(Integer.parseInt(txt62.getText()));
				f6.setTs3(Integer.parseInt(txt63.getText()));
				f6.setTs4(Integer.parseInt(txt64.getText()));
				f6.setTs5(Integer.parseInt(txt65.getText()));
				f6.setTs7(Integer.parseInt(txt67.getText()));
				f6.setTs8(Integer.parseInt(txt68.getText()));
				
				f6.setTr1(Integer.parseInt(txt16.getText()));
				f6.setTr2(Integer.parseInt(txt26.getText()));
				f6.setTr3(Integer.parseInt(txt36.getText()));
				f6.setTr4(Integer.parseInt(txt46.getText()));
				f6.setTr5(Integer.parseInt(txt56.getText()));
				f6.setTr7(Integer.parseInt(txt76.getText()));
				f6.setTr8(Integer.parseInt(txt86.getText()));
				
				f6.setVictories(f6.calculateVictories());
				f6.setTotalTouchesScored(f6.calculateTouchesScored());
				f6.setTotalTouchesReceived(f6.calculateTouchesReceived());
				f6.setIndicator(f6.calculateIndicator());
				
				txtV6.setText(Integer.toString(f6.getVictories()));
				txtTs6.setText(Integer.toString(f6.getTotalTouchesScored()));
				txtTr6.setText(Integer.toString(f6.getTotalTouchesReceived()));
				txtInd6.setText(Integer.toString(f6.getIndicator()));
				//txtPl6.setText(Integer.toString(f6.getPlace()));

				System.out.println(f6);
			}
		});
		
		
		// LISTENER: Fencer 7 calculate

		btnCalcF7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Fencer f7 = new Fencer();
				f7.setFencerNum(7);
				f7.setName(txtF7.getText());
				
				f7.setTs1(Integer.parseInt(txt71.getText()));
				f7.setTs2(Integer.parseInt(txt72.getText()));
				f7.setTs3(Integer.parseInt(txt73.getText()));
				f7.setTs4(Integer.parseInt(txt74.getText()));
				f7.setTs5(Integer.parseInt(txt75.getText()));
				f7.setTs6(Integer.parseInt(txt76.getText()));
				f7.setTs8(Integer.parseInt(txt78.getText()));
				
				f7.setTr1(Integer.parseInt(txt17.getText()));
				f7.setTr2(Integer.parseInt(txt27.getText()));
				f7.setTr3(Integer.parseInt(txt37.getText()));
				f7.setTr4(Integer.parseInt(txt47.getText()));
				f7.setTr5(Integer.parseInt(txt57.getText()));
				f7.setTr6(Integer.parseInt(txt67.getText()));
				f7.setTr8(Integer.parseInt(txt87.getText()));
				
				f7.setVictories(f7.calculateVictories());
				f7.setTotalTouchesScored(f7.calculateTouchesScored());
				f7.setTotalTouchesReceived(f7.calculateTouchesReceived());
				f7.setIndicator(f7.calculateIndicator());
				
				txtV7.setText(Integer.toString(f7.getVictories()));
				txtTs7.setText(Integer.toString(f7.getTotalTouchesScored()));
				txtTr7.setText(Integer.toString(f7.getTotalTouchesReceived()));
				txtInd7.setText(Integer.toString(f7.getIndicator()));
				//txtPl7.setText(Integer.toString(f7.getPlace()));

				System.out.println(f7);
			}
		});
		

		// LISTENER: Fencer 8 calculate

		btnCalcF8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Fencer f8 = new Fencer();
				f8.setFencerNum(8);
				f8.setName(txtF8.getText());
				
				f8.setTs1(Integer.parseInt(txt81.getText()));
				f8.setTs2(Integer.parseInt(txt82.getText()));
				f8.setTs3(Integer.parseInt(txt83.getText()));
				f8.setTs4(Integer.parseInt(txt84.getText()));
				f8.setTs5(Integer.parseInt(txt85.getText()));
				f8.setTs6(Integer.parseInt(txt86.getText()));
				f8.setTs7(Integer.parseInt(txt87.getText()));
				
				f8.setTr1(Integer.parseInt(txt18.getText()));
				f8.setTr2(Integer.parseInt(txt28.getText()));
				f8.setTr3(Integer.parseInt(txt38.getText()));
				f8.setTr4(Integer.parseInt(txt48.getText()));
				f8.setTr5(Integer.parseInt(txt58.getText()));
				f8.setTr6(Integer.parseInt(txt68.getText()));
				f8.setTr7(Integer.parseInt(txt78.getText()));
				
				f8.setVictories(f8.calculateVictories());
				f8.setTotalTouchesScored(f8.calculateTouchesScored());
				f8.setTotalTouchesReceived(f8.calculateTouchesReceived());
				f8.setIndicator(f8.calculateIndicator());
				
				txtV8.setText(Integer.toString(f8.getVictories()));
				txtTs8.setText(Integer.toString(f8.getTotalTouchesScored()));
				txtTr8.setText(Integer.toString(f8.getTotalTouchesReceived()));
				txtInd8.setText(Integer.toString(f8.getIndicator()));
				//txtPl8.setText(Integer.toString(f8.getPlace()));

				System.out.println(f8);
			}
		});


		
		// LISTENER: Complete pool - egads this is horrible. 
		
		btnCompletePool.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Fencer f1 = new Fencer();
				f1.setFencerNum(1);
				f1.setName(txtF1.getText());
				f1.setTs2(Integer.parseInt(txt12.getText()));
				f1.setTs3(Integer.parseInt(txt13.getText()));
				f1.setTs4(Integer.parseInt(txt14.getText()));
				f1.setTs5(Integer.parseInt(txt15.getText()));
				f1.setTs6(Integer.parseInt(txt16.getText()));
				f1.setTs7(Integer.parseInt(txt17.getText()));
				f1.setTs8(Integer.parseInt(txt18.getText()));
				f1.setTr2(Integer.parseInt(txt21.getText()));
				f1.setTr3(Integer.parseInt(txt31.getText()));
				f1.setTr4(Integer.parseInt(txt41.getText()));
				f1.setTr5(Integer.parseInt(txt51.getText()));
				f1.setTr6(Integer.parseInt(txt61.getText()));
				f1.setTr7(Integer.parseInt(txt71.getText()));
				f1.setTr8(Integer.parseInt(txt81.getText()));
				f1.setVictories(f1.calculateVictories());
				f1.setTotalTouchesScored(f1.calculateTouchesScored());
				f1.setTotalTouchesReceived(f1.calculateTouchesReceived());
				f1.setIndicator(f1.calculateIndicator());
				txtV1.setText(Integer.toString(f1.getVictories()));
				txtTs1.setText(Integer.toString(f1.getTotalTouchesScored()));
				txtTr1.setText(Integer.toString(f1.getTotalTouchesReceived()));
				txtInd1.setText(Integer.toString(f1.getIndicator()));
				System.out.println(f1);
				
				Fencer f2 = new Fencer();
				f2.setFencerNum(2);
				f2.setName(txtF2.getText());
				f2.setTs1(Integer.parseInt(txt21.getText()));
				f2.setTs3(Integer.parseInt(txt23.getText()));
				f2.setTs4(Integer.parseInt(txt24.getText()));
				f2.setTs5(Integer.parseInt(txt25.getText()));
				f2.setTs6(Integer.parseInt(txt26.getText()));
				f2.setTs7(Integer.parseInt(txt27.getText()));
				f2.setTs8(Integer.parseInt(txt28.getText()));
				f2.setTr1(Integer.parseInt(txt12.getText()));
				f2.setTr3(Integer.parseInt(txt32.getText()));
				f2.setTr4(Integer.parseInt(txt42.getText()));
				f2.setTr5(Integer.parseInt(txt52.getText()));
				f2.setTr6(Integer.parseInt(txt62.getText()));
				f2.setTr7(Integer.parseInt(txt72.getText()));
				f2.setTr8(Integer.parseInt(txt82.getText()));
				f2.setVictories(f2.calculateVictories());
				f2.setTotalTouchesScored(f2.calculateTouchesScored());
				f2.setTotalTouchesReceived(f2.calculateTouchesReceived());
				f2.setIndicator(f2.calculateIndicator());
				txtV2.setText(Integer.toString(f2.getVictories()));
				txtTs2.setText(Integer.toString(f2.getTotalTouchesScored()));
				txtTr2.setText(Integer.toString(f2.getTotalTouchesReceived()));
				txtInd2.setText(Integer.toString(f2.getIndicator()));
				System.out.println(f2);
				
				
				Fencer f3 = new Fencer();
				f3.setFencerNum(3);
				f3.setName(txtF3.getText());
				f3.setTs1(Integer.parseInt(txt31.getText()));
				f3.setTs2(Integer.parseInt(txt32.getText()));
				f3.setTs4(Integer.parseInt(txt34.getText()));
				f3.setTs5(Integer.parseInt(txt35.getText()));
				f3.setTs6(Integer.parseInt(txt36.getText()));
				f3.setTs7(Integer.parseInt(txt37.getText()));
				f3.setTs8(Integer.parseInt(txt38.getText()));
				f3.setTr1(Integer.parseInt(txt13.getText()));
				f3.setTr2(Integer.parseInt(txt23.getText()));
				f3.setTr4(Integer.parseInt(txt43.getText()));
				f3.setTr5(Integer.parseInt(txt53.getText()));
				f3.setTr6(Integer.parseInt(txt63.getText()));
				f3.setTr7(Integer.parseInt(txt73.getText()));
				f3.setTr8(Integer.parseInt(txt83.getText()));
				f3.setVictories(f3.calculateVictories());
				f3.setTotalTouchesScored(f3.calculateTouchesScored());
				f3.setTotalTouchesReceived(f3.calculateTouchesReceived());
				f3.setIndicator(f3.calculateIndicator());
				txtV3.setText(Integer.toString(f3.getVictories()));
				txtTs3.setText(Integer.toString(f3.getTotalTouchesScored()));
				txtTr3.setText(Integer.toString(f3.getTotalTouchesReceived()));
				txtInd3.setText(Integer.toString(f3.getIndicator()));
				System.out.println(f3);
				
				
				Fencer f4 = new Fencer();
				f4.setFencerNum(4);
				f4.setName(txtF4.getText());
				f4.setTs1(Integer.parseInt(txt41.getText()));
				f4.setTs2(Integer.parseInt(txt42.getText()));
				f4.setTs3(Integer.parseInt(txt43.getText()));
				f4.setTs5(Integer.parseInt(txt45.getText()));
				f4.setTs6(Integer.parseInt(txt46.getText()));
				f4.setTs7(Integer.parseInt(txt47.getText()));
				f4.setTs8(Integer.parseInt(txt48.getText()));
				f4.setTr1(Integer.parseInt(txt14.getText()));
				f4.setTr2(Integer.parseInt(txt24.getText()));
				f4.setTr3(Integer.parseInt(txt34.getText()));
				f4.setTr5(Integer.parseInt(txt54.getText()));
				f4.setTr6(Integer.parseInt(txt64.getText()));
				f4.setTr7(Integer.parseInt(txt74.getText()));
				f4.setTr8(Integer.parseInt(txt84.getText()));
				f4.setVictories(f4.calculateVictories());
				f4.setTotalTouchesScored(f4.calculateTouchesScored());
				f4.setTotalTouchesReceived(f4.calculateTouchesReceived());
				f4.setIndicator(f4.calculateIndicator());
				txtV4.setText(Integer.toString(f4.getVictories()));
				txtTs4.setText(Integer.toString(f4.getTotalTouchesScored()));
				txtTr4.setText(Integer.toString(f4.getTotalTouchesReceived()));
				txtInd4.setText(Integer.toString(f4.getIndicator()));
				System.out.println(f4);
				
				
				Fencer f5 = new Fencer();
				f5.setFencerNum(5);
				f5.setName(txtF5.getText());
				f5.setTs1(Integer.parseInt(txt51.getText()));
				f5.setTs2(Integer.parseInt(txt52.getText()));
				f5.setTs3(Integer.parseInt(txt53.getText()));
				f5.setTs4(Integer.parseInt(txt54.getText()));
				f5.setTs6(Integer.parseInt(txt56.getText()));
				f5.setTs7(Integer.parseInt(txt57.getText()));
				f5.setTs8(Integer.parseInt(txt58.getText()));
				f5.setTr1(Integer.parseInt(txt15.getText()));
				f5.setTr2(Integer.parseInt(txt25.getText()));
				f5.setTr3(Integer.parseInt(txt35.getText()));
				f5.setTr4(Integer.parseInt(txt45.getText()));
				f5.setTr6(Integer.parseInt(txt65.getText()));
				f5.setTr7(Integer.parseInt(txt75.getText()));
				f5.setTr8(Integer.parseInt(txt85.getText()));
				f5.setVictories(f5.calculateVictories());
				f5.setTotalTouchesScored(f5.calculateTouchesScored());
				f5.setTotalTouchesReceived(f5.calculateTouchesReceived());
				f5.setIndicator(f5.calculateIndicator());
				txtV5.setText(Integer.toString(f5.getVictories()));
				txtTs5.setText(Integer.toString(f5.getTotalTouchesScored()));
				txtTr5.setText(Integer.toString(f5.getTotalTouchesReceived()));
				txtInd5.setText(Integer.toString(f5.getIndicator()));
				System.out.println(f5);
				
				Fencer f6 = new Fencer();
				f6.setFencerNum(6);
				f6.setName(txtF6.getText());
				f6.setTs1(Integer.parseInt(txt61.getText()));
				f6.setTs2(Integer.parseInt(txt62.getText()));
				f6.setTs3(Integer.parseInt(txt63.getText()));
				f6.setTs4(Integer.parseInt(txt64.getText()));
				f6.setTs5(Integer.parseInt(txt65.getText()));
				f6.setTs7(Integer.parseInt(txt67.getText()));
				f6.setTs8(Integer.parseInt(txt68.getText()));
				f6.setTr1(Integer.parseInt(txt16.getText()));
				f6.setTr2(Integer.parseInt(txt26.getText()));
				f6.setTr3(Integer.parseInt(txt36.getText()));
				f6.setTr4(Integer.parseInt(txt46.getText()));
				f6.setTr5(Integer.parseInt(txt56.getText()));
				f6.setTr7(Integer.parseInt(txt76.getText()));
				f6.setTr8(Integer.parseInt(txt86.getText()));
				f6.setVictories(f6.calculateVictories());
				f6.setTotalTouchesScored(f6.calculateTouchesScored());
				f6.setTotalTouchesReceived(f6.calculateTouchesReceived());
				f6.setIndicator(f6.calculateIndicator());
				txtV6.setText(Integer.toString(f6.getVictories()));
				txtTs6.setText(Integer.toString(f6.getTotalTouchesScored()));
				txtTr6.setText(Integer.toString(f6.getTotalTouchesReceived()));
				txtInd6.setText(Integer.toString(f6.getIndicator()));
				System.out.println(f6);
				
				
				Fencer f7 = new Fencer();
				f7.setFencerNum(7);
				f7.setName(txtF7.getText());
				f7.setTs1(Integer.parseInt(txt71.getText()));
				f7.setTs2(Integer.parseInt(txt72.getText()));
				f7.setTs3(Integer.parseInt(txt73.getText()));
				f7.setTs4(Integer.parseInt(txt74.getText()));
				f7.setTs5(Integer.parseInt(txt75.getText()));
				f7.setTs6(Integer.parseInt(txt76.getText()));
				f7.setTs8(Integer.parseInt(txt78.getText()));
				f7.setTr1(Integer.parseInt(txt17.getText()));
				f7.setTr2(Integer.parseInt(txt27.getText()));
				f7.setTr3(Integer.parseInt(txt37.getText()));
				f7.setTr4(Integer.parseInt(txt47.getText()));
				f7.setTr5(Integer.parseInt(txt57.getText()));
				f7.setTr6(Integer.parseInt(txt67.getText()));
				f7.setTr8(Integer.parseInt(txt87.getText()));
				f7.setVictories(f7.calculateVictories());
				f7.setTotalTouchesScored(f7.calculateTouchesScored());
				f7.setTotalTouchesReceived(f7.calculateTouchesReceived());
				f7.setIndicator(f7.calculateIndicator());
				txtV7.setText(Integer.toString(f7.getVictories()));
				txtTs7.setText(Integer.toString(f7.getTotalTouchesScored()));
				txtTr7.setText(Integer.toString(f7.getTotalTouchesReceived()));
				txtInd7.setText(Integer.toString(f7.getIndicator()));
				System.out.println(f7);
				
				Fencer f8 = new Fencer();
				f8.setFencerNum(8);
				f8.setName(txtF8.getText());
				f8.setTs1(Integer.parseInt(txt81.getText()));
				f8.setTs2(Integer.parseInt(txt82.getText()));
				f8.setTs3(Integer.parseInt(txt83.getText()));
				f8.setTs4(Integer.parseInt(txt84.getText()));
				f8.setTs5(Integer.parseInt(txt85.getText()));
				f8.setTs6(Integer.parseInt(txt86.getText()));
				f8.setTs7(Integer.parseInt(txt87.getText()));
				f8.setTr1(Integer.parseInt(txt18.getText()));
				f8.setTr2(Integer.parseInt(txt28.getText()));
				f8.setTr3(Integer.parseInt(txt38.getText()));
				f8.setTr4(Integer.parseInt(txt48.getText()));
				f8.setTr5(Integer.parseInt(txt58.getText()));
				f8.setTr6(Integer.parseInt(txt68.getText()));
				f8.setTr7(Integer.parseInt(txt78.getText()));
				f8.setVictories(f8.calculateVictories());
				f8.setTotalTouchesScored(f8.calculateTouchesScored());
				f8.setTotalTouchesReceived(f8.calculateTouchesReceived());
				f8.setIndicator(f8.calculateIndicator());
				txtV8.setText(Integer.toString(f8.getVictories()));
				txtTs8.setText(Integer.toString(f8.getTotalTouchesScored()));
				txtTr8.setText(Integer.toString(f8.getTotalTouchesReceived()));
				txtInd8.setText(Integer.toString(f8.getIndicator()));
				System.out.println(f8);
				
				// Determine what place fencers are in. Research hashmap where key = fencer# value = place...probably way better if I can figure it out
				int place = 1;
				boolean placeFlag = false;
				for (int i = 8; i >= 0; i--) {
					if (f1.getVictories() == i) {
						f1.setPlace(place);
						txtPl1.setText(Integer.toString(f1.getPlace()));
						placeFlag = true;
					}   
					if (f2.getVictories() == i) {
						f2.setPlace(place);
						txtPl2.setText(Integer.toString(f2.getPlace()));
						placeFlag = true;
					}
					if (f3.getVictories() == i) {
						f3.setPlace(place);
						txtPl3.setText(Integer.toString(f3.getPlace()));
						placeFlag = true;
					}
					if (f4.getVictories() == i) {
						f4.setPlace(place);
						txtPl4.setText(Integer.toString(f4.getPlace()));
						placeFlag = true;
					}
					if (f5.getVictories() == i) {
						f5.setPlace(place);
						txtPl5.setText(Integer.toString(f5.getPlace()));
						placeFlag = true;
					}
					if (f6.getVictories() == i) {
						f6.setPlace(place);
						txtPl6.setText(Integer.toString(f6.getPlace()));
						placeFlag = true;
					}
					if (f7.getVictories() == i) {
						f7.setPlace(place);
						txtPl7.setText(Integer.toString(f7.getPlace()));
						placeFlag = true;
					}
					if (f8.getVictories() == i) {
						f8.setPlace(place);
						txtPl8.setText(Integer.toString(f8.getPlace()));
						placeFlag = true;
					}
					if (placeFlag) {
						place = place + 1;
						placeFlag=false;
					}
				}

				
			}
		});
		
	}
}
