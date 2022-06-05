package com.olympic.cis143.cards.experiment;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Cards {

	private JFrame frame;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cards window = new Cards();
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
	public Cards() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		

		// PANEL A
		
		JPanel panelA = new JPanel();
		frame.getContentPane().add(panelA);
		
		textField = new JTextField();
		panelA.add(textField);
		textField.setColumns(10);
		
		JRadioButton btn4 = new JRadioButton("4");
		buttonGroup.add(btn4);
		btn4.setSelected(true);
		panelA.add(btn4);
		
		JRadioButton btn5 = new JRadioButton("5");
		buttonGroup.add(btn5);
		panelA.add(btn5);
		
		JButton btnPanelA = new JButton("Goto PanelB");
		panelA.add(btnPanelA);
		
		
		// PANEL B
		
		JPanel panelB = new JPanel();
		frame.getContentPane().add(panelB);
		
		JLabel lblNewLabel = new JLabel("Howdy we are PanelB");
		panelB.add(lblNewLabel);
		
		JButton btnPanelB = new JButton("Goto PanelC");
		panelB.add(btnPanelB);
		
		
		
		
		// PANEL C
		
		JPanel panelC = new JPanel();
		frame.getContentPane().add(panelC);
		
		JLabel lblPanelC = new JLabel("Panel C");
		panelC.add(lblPanelC);
		
		JButton btnCalculate = new JButton("Calculate");
		panelC.add(btnCalculate);
		
		
		
		
		

		// LISTENERS
		
		btnPanelA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelA.setVisible(false);
				panelB.setVisible(true);
				panelC.setVisible(false);
			}
		});

		btnPanelB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelA.setVisible(false);
				panelB.setVisible(true);
				panelC.setVisible(false);
			}
		});

		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelA.setVisible(false);
				panelB.setVisible(false);
				panelC.setVisible(true);
			}
		});
		
		
		
		
	}
}
