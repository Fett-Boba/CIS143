package com.tms.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;

public class CardGui {

	private JFrame frmCardGui;
	private JTextField txtName;
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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CardGui window = new CardGui();
					window.frmCardGui.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CardGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCardGui = new JFrame();
		frmCardGui.setTitle("Card GUI");
		frmCardGui.setBounds(100, 100, 800, 400);
		frmCardGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCardGui.getContentPane().setLayout(null);
		
		// COMPONENTS
		
		JPanel pnlTop = new JPanel();
		pnlTop.setBackground(Color.ORANGE);
		pnlTop.setBounds(0, 0, 788, 60);
		frmCardGui.getContentPane().add(pnlTop);
		
		JButton btn1 = new JButton("Button 1");
		pnlTop.add(btn1);
		
		JButton btn2 = new JButton("Button 2");
		pnlTop.add(btn2);
		
		JButton btn3 = new JButton("Button 3");
		pnlTop.add(btn3);
		
		JPanel pnlBottom = new JPanel();
		pnlBottom.setBounds(0, 60, 788, 308);
		frmCardGui.getContentPane().add(pnlBottom);
		pnlBottom.setLayout(new CardLayout(0, 0));
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(new Color(102, 153, 204));
		pnlBottom.add(panel1, "name_252090408349400");
		panel1.setLayout(null);
		
		JLabel lblName = new JLabel("YOUR NAME:");
		lblName.setBounds(183, 54, 91, 14);
		panel1.add(lblName);
		
		JLabel lblTournament = new JLabel("TOURNAMENT NAME:");
		lblTournament.setBounds(145, 102, 129, 14);
		panel1.add(lblTournament);
		
		JLabel lblDate = new JLabel("TOURNAMENT DATE:");
		lblDate.setBounds(145, 153, 129, 14);
		panel1.add(lblDate);
		
		JLabel lblNumFencers = new JLabel("NUMBER FENCERS IN POOL:");
		lblNumFencers.setBounds(110, 205, 178, 14);
		panel1.add(lblNumFencers);
		
		txtName = new JTextField();
		txtName.setBounds(295, 44, 276, 29);
		panel1.add(txtName);
		txtName.setColumns(10);
		
		txtTournamentName = new JTextField();
		txtTournamentName.setBounds(295, 92, 276, 29);
		panel1.add(txtTournamentName);
		txtTournamentName.setColumns(10);
		
		txtTournamentDate = new JTextField();
		txtTournamentDate.setBounds(295, 143, 276, 29);
		panel1.add(txtTournamentDate);
		txtTournamentDate.setColumns(10);
		
		JComboBox cmbNumFencers = new JComboBox();
		cmbNumFencers.setModel(new DefaultComboBoxModel(new String[] {"Four", "Five", "Six", "Seven", "Eight"}));
		cmbNumFencers.setBounds(298, 198, 91, 22);
		panel1.add(cmbNumFencers);
		
		JButton btnTournamentOK = new JButton("OK");
		btnTournamentOK.setBounds(324, 245, 89, 23);
		panel1.add(btnTournamentOK);
		
		JButton btnTournamentClear = new JButton("Clear");
		btnTournamentClear.setBounds(444, 245, 89, 23);
		panel1.add(btnTournamentClear);
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(new Color(102, 153, 153));
		pnlBottom.add(panel2, "name_252098142624300");
		panel2.setLayout(null);
		
		JLabel lblDirections = new JLabel("Enter Fencer's names in the same order they are listed on the pool sheet:");
		lblDirections.setBounds(218, 11, 459, 14);
		panel2.add(lblDirections);
		
		JLabel lblFencer1 = new JLabel("Fencer 1:");
		lblFencer1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFencer1.setBounds(178, 46, 65, 14);
		panel2.add(lblFencer1);
		
		JLabel lblFencer2 = new JLabel("Fencer 2:");
		lblFencer2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFencer2.setBounds(178, 71, 65, 14);
		panel2.add(lblFencer2);
		
		JLabel lblFencer3 = new JLabel("Fencer 3:");
		lblFencer3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFencer3.setBounds(178, 100, 65, 14);
		panel2.add(lblFencer3);
		
		JLabel lblFencer4 = new JLabel("Fencer 4:");
		lblFencer4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFencer4.setBounds(178, 125, 65, 14);
		panel2.add(lblFencer4);
		
		JLabel lblFencer5 = new JLabel("Fencer 5:");
		lblFencer5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFencer5.setBounds(178, 150, 65, 14);
		panel2.add(lblFencer5);
		
		JLabel lblFencer6 = new JLabel("Fencer 6:");
		lblFencer6.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFencer6.setBounds(178, 175, 65, 14);
		panel2.add(lblFencer6);
		
		JLabel lblFencer7 = new JLabel("Fencer 7:");
		lblFencer7.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFencer7.setBounds(178, 200, 65, 14);
		panel2.add(lblFencer7);
		
		JLabel lblFencer8 = new JLabel("Fencer 8:");
		lblFencer8.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFencer8.setBounds(178, 225, 65, 14);
		panel2.add(lblFencer8);
		
		txtFencer1 = new JTextField();
		txtFencer1.setBounds(266, 40, 271, 20);
		panel2.add(txtFencer1);
		txtFencer1.setColumns(10);
		
		txtFencer2 = new JTextField();
		txtFencer2.setBounds(266, 65, 271, 20);
		panel2.add(txtFencer2);
		txtFencer2.setColumns(10);
		
		txtFencer3 = new JTextField();
		txtFencer3.setBounds(266, 94, 271, 20);
		panel2.add(txtFencer3);
		txtFencer3.setColumns(10);
		
		txtFencer4 = new JTextField();
		txtFencer4.setBounds(266, 119, 271, 20);
		panel2.add(txtFencer4);
		txtFencer4.setColumns(10);
		
		txtFencer5 = new JTextField();
		txtFencer5.setBounds(266, 144, 271, 20);
		panel2.add(txtFencer5);
		txtFencer5.setColumns(10);
		
		txtFencer6 = new JTextField();
		txtFencer6.setBounds(266, 169, 271, 20);
		panel2.add(txtFencer6);
		txtFencer6.setColumns(10);
		
		txtFencer7 = new JTextField();
		txtFencer7.setBounds(266, 194, 271, 20);
		panel2.add(txtFencer7);
		txtFencer7.setColumns(10);
		
		txtFencer8 = new JTextField();
		txtFencer8.setBounds(266, 219, 271, 20);
		panel2.add(txtFencer8);
		txtFencer8.setColumns(10);
		
		JButton btnFencersOK = new JButton("OK");
		btnFencersOK.setBounds(284, 259, 89, 23);
		panel2.add(btnFencersOK);
		
		JButton btnFencersClear = new JButton("Clear");
		btnFencersClear.setBounds(393, 259, 89, 23);
		panel2.add(btnFencersClear);
		
		JPanel panel3 = new JPanel();
		panel3.setBackground(Color.GREEN);
		pnlBottom.add(panel3, "name_252100911672300");
		
		
		// ACTIONS
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel1.setVisible(true);
				panel2.setVisible(false);
				panel3.setVisible(false);
			}
		});

		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel1.setVisible(false);
				panel2.setVisible(true);
				panel3.setVisible(false);
			}
		});

		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel1.setVisible(false);
				panel2.setVisible(false);
				panel3.setVisible(true);
			}
		});

		btnTournamentOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Add a check in here to make sure all fields are selected.
				System.out.println(txtName.getText());
				System.out.println(txtTournamentName.getText());
				System.out.println(txtTournamentDate.getText());
				System.out.println(cmbNumFencers.getSelectedItem());
				panel1.setVisible(false);
				panel2.setVisible(true);
				panel3.setVisible(false);
			}
		});

		btnTournamentClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtName.setText("");
				txtTournamentName.setText("");
				txtTournamentDate.setText("");
				cmbNumFencers.setSelectedIndex(0);
			}
		});

		
		
		
		
	}
}
