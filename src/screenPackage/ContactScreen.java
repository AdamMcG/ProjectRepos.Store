package screenPackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;


public class ContactScreen extends JFrame implements ActionListener {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JButton exit; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContactScreen window = new ContactScreen();
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
	public ContactScreen() {

		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 833, 464);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(41, 21, 740, 358);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("McRoched Industries");
		label.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		label.setBounds(10, 11, 181, 32);
		panel.add(label);
		
		JLabel lblContactDetails = new JLabel("Contact Details");
		lblContactDetails.setFont(new Font("Arial", Font.PLAIN, 14));
		lblContactDetails.setBounds(42, 79, 129, 44);
		panel.add(lblContactDetails);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number");
		lblPhoneNumber.setFont(new Font("Arial", Font.PLAIN, 12));
		lblPhoneNumber.setBounds(42, 134, 89, 43);
		panel.add(lblPhoneNumber);
		
		textField = new JTextField();
		textField.setBounds(141, 145, 129, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(141, 206, 220, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEmailadress = new JLabel("EmailAddress");
		lblEmailadress.setFont(new Font("Arial", Font.PLAIN, 12));
		lblEmailadress.setBounds(42, 194, 89, 32);
		panel.add(lblEmailadress);
		
		exit = new JButton("Exit");
		exit.setBackground(new Color(255, 255, 204));
		exit.setBounds(71, 290, 89, 44);
		panel.add(exit);
		exit.addActionListener(this);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu_1 = new JMenu("Account");
		mnNewMenu_1.setForeground(new Color(0, 0, 0));
		menuBar.add(mnNewMenu_1);
		
		JMenu mnNewMenu_2 = new JMenu("Team");
		mnNewMenu_2.setForeground(new Color(0, 0, 0));
		menuBar.add(mnNewMenu_2);
		
		JMenu mnHelp = new JMenu("Help");
		mnHelp.setForeground(new Color(0, 0, 0));
		mnHelp.setBackground(new Color(255, 255, 255));
		menuBar.add(mnHelp);
	}

	@Override
	public void actionPerformed(ActionEvent ae) 
	{
		if(ae.getSource() == exit)
		{
			frame.dispose();
		}
		
	}
}
