import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Home extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					//frame.setUndecorated(true);		//remove frame border and stuff
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Home() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 751, 533);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 364, 498);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds(-36, 138, 400, 245);
		lblNewLabel_6.setIcon(new ImageIcon(Home.class.getResource("/images/hearts-wip400x245.png")));
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(182, 255, 0, 0);
		panel.add(lblNewLabel_4);
		
		Button button = new Button("Sign Up");
		button.setForeground(Color.WHITE);
		button.setBackground(Color.RED);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(442, 432, 233, 43);
		contentPane.add(button);
		
		textField = new JTextField();
		textField.setBounds(442, 79, 233, 36);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(443, 113, 233, 2);
		contentPane.add(separator);
		
		JLabel lblNewLabel = new JLabel("USERNAME");
		lblNewLabel.setBounds(442, 54, 104, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("EMAIL");
		lblNewLabel_1.setBounds(442, 137, 48, 14);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(442, 162, 233, 36);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("PASSWORD");
		lblNewLabel_2.setBounds(442, 225, 104, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("REPEAT PASSWORD");
		lblNewLabel_3.setBounds(443, 315, 138, 14);
		contentPane.add(lblNewLabel_3);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(442, 250, 233, 39);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(442, 340, 233, 36);
		contentPane.add(passwordField_1);
	}
}
