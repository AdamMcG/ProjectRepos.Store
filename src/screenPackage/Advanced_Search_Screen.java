package screenPackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Panel;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Advanced_Search_Screen {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Advanced_Search_Screen window = new Advanced_Search_Screen();
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
	public Advanced_Search_Screen() {

		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 682, 567);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBorder(BorderFactory.createLineBorder(Color.black));
		panel.setBounds(31, 31, 567, 420);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		textField = new JTextField();
		textField.setBounds(116, 361, 230, 32);
		panel.add(textField);
		textField.setColumns(10);

		JLabel label = new JLabel("McRoched Industries");
		label.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		label.setBounds(10, 11, 181, 32);
		panel.add(label);

		JButton btnNewButton = new JButton("Search");
		btnNewButton.setBackground(new Color(255, 255, 204));
		btnNewButton.setBounds(369, 360, 89, 34);
		panel.add(btnNewButton);

		JLabel lblSearchBy = new JLabel("Search By: ");
		lblSearchBy.setFont(new Font("Arial", Font.PLAIN, 12));
		lblSearchBy.setBounds(61, 72, 76, 34);
		panel.add(lblSearchBy);

		JLabel lblDisplayBy = new JLabel("Display By: ");
		lblDisplayBy.setBounds(61, 249, 64, 32);
		panel.add(lblDisplayBy);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Descending");
		rdbtnNewRadioButton_1.setBackground(new Color(255, 255, 204));
		rdbtnNewRadioButton_1.setBounds(134, 254, 146, 32);
		panel.add(rdbtnNewRadioButton_1);

		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Employee Number");
		rdbtnNewRadioButton_2.setBackground(new Color(255, 255, 204));
		rdbtnNewRadioButton_2.setBounds(134, 305, 146, 32);
		panel.add(rdbtnNewRadioButton_2);

		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(255, 255, 204));
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "   ",
				"Employee number", "first name", "surname", "Department" }));
		comboBox.setBounds(144, 119, 202, 20);
		panel.add(comboBox);

		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("Account");
		mnNewMenu.setForeground(Color.BLACK);
		menuBar.add(mnNewMenu);

		JMenu mnNewMenu_1 = new JMenu("Team");
		mnNewMenu_1.setForeground(Color.BLACK);
		menuBar.add(mnNewMenu_1);

		JMenu mnHelp = new JMenu("Help");
		mnHelp.setForeground(Color.BLACK);
		menuBar.add(mnHelp);
		frame.setVisible(true);
	}
}
