package com.olympic.cis143.student.touche.gui;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ComponentColorModel;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class FencerNames {

	private JFrame frame;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;
	private JTextField txt4;
	private JTextField txt5;
	private JLabel lbl1;
	private JLabel lbl2;
	private JLabel lbl3;
	private JLabel lbl4;
	private JLabel lbl5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FencerNames window = new FencerNames();
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
	public FencerNames() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 464, 549);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 432, 481);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		txt1 = new JTextField();
		txt1.setBounds(157, 79, 96, 20);
		panel.add(txt1);
		txt1.setColumns(10);
		
		txt2 = new JTextField();
		txt2.setBounds(157, 126, 96, 20);
		panel.add(txt2);
		txt2.setColumns(10);
		
		txt3 = new JTextField();
		txt3.setBounds(157, 179, 96, 20);
		panel.add(txt3);
		txt3.setColumns(10);
		
		txt4 = new JTextField();
		txt4.setBounds(157, 237, 96, 20);
		panel.add(txt4);
		txt4.setColumns(10);
		
		txt5 = new JTextField();
		txt5.setBounds(157, 302, 96, 20);
		panel.add(txt5);
		txt5.setColumns(10);

		JButton btnOK = new JButton("New button");
		btnOK.setBounds(152, 371, 89, 23);
		panel.add(btnOK);
		
		lbl1 = new JLabel("New label");
		lbl1.setBounds(57, 82, 48, 14);
		panel.add(lbl1);
		
		lbl2 = new JLabel("New label");
		lbl2.setBounds(57, 129, 48, 14);
		panel.add(lbl2);
		
		lbl3 = new JLabel("New label");
		lbl3.setBounds(57, 182, 48, 14);
		panel.add(lbl3);
		
		lbl4 = new JLabel("New label");
		lbl4.setBounds(57, 240, 48, 14);
		panel.add(lbl4);
		
		lbl5 = new JLabel("New label");
		lbl5.setBounds(57, 305, 48, 14);
		panel.add(lbl5);

		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				List<String> fencers = new ArrayList<>();
		        int i = 0;
		        for (Component component : panel.getComponents()) {
		            if (component instanceof JTextField) {
		            	fencers.add(((JTextField) component).getText());
		            }
		            if (component instanceof JLabel) {
		        		((JLabel) component).setText(fencers.get(i));
		            	i++;
		        	}
		        }
			}
		});
		
	}
}
