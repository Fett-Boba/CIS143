package com.olympic.cis143.touche;

import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class PanelTournament extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtTournamentName;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	public PanelTournament() {
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		txtTournamentName = new JTextField();
		add(txtTournamentName);
		txtTournamentName.setColumns(10);
		
		JRadioButton rad4 = new JRadioButton("4");
		buttonGroup.add(rad4);
		rad4.setSelected(true);
		add(rad4);
		
		JRadioButton rad5 = new JRadioButton("5");
		buttonGroup.add(rad5);
		add(rad5);
		
		JRadioButton rad6 = new JRadioButton("6");
		buttonGroup.add(rad6);
		add(rad6);
		
		JRadioButton rad7 = new JRadioButton("7");
		buttonGroup.add(rad7);
		add(rad7);
		
		JRadioButton rad8 = new JRadioButton("8");
		buttonGroup.add(rad8);
		add(rad8);
		
		JButton btnOK = new JButton("OK");
		add(btnOK);

		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Hi Tournaments!");
			}
		});
		
	}
}
