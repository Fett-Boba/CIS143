package com.olympic.cis143.touche;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ValidTxtFieldTester {

	private JFrame frame;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtC;
	private JTextField txtD;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ValidTxtFieldTester window = new ValidTxtFieldTester();
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
	public ValidTxtFieldTester() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 438, 254);
		frame.getContentPane().add(panel);
		
		txtA = new JTextField();
		panel.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		panel.add(txtB);
		txtB.setColumns(10);
		
		txtC = new JTextField();
		panel.add(txtC);
		txtC.setColumns(10);
		
		txtD = new JTextField();
		panel.add(txtD);
		txtD.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		panel.add(btnNewButton);
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int a;
				int b;
				int c;
				int d;
				
				
				try  {
					a = Integer.parseInt(txtA.getText());
					b = Integer.parseInt(txtB.getText());
					c = Integer.parseInt(txtC.getText());
					d = Integer.parseInt(txtD.getText());
					System.out.println(a + " " + b + " " + c + " " + d);
					
					
					
					
					
					
				} catch (NumberFormatException nfe) {
					System.out.println("You must enter a number");
				}
				
				

				
			}
		});

//		txtA.addKeyListener(new KeyAdapter() {
//			@Override
//			public void keyTyped(KeyEvent e) {
//				if (e.getKeyChar() >= '0' && e.getKeyChar() <= '5') {
//					System.out.println("Valid digit entered");
//				} else {
//					
//					System.out.println("Invalid entry: '" + e.getKeyChar() + "'. Scores must be from 0 to 5");
//				}
//			}
//		});
//		
		
		
		
		
	}

}
