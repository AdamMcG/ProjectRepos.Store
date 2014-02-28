import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPanel;


public class HomeScreen {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeScreen window = new HomeScreen();
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
	public HomeScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBackground(Color.RED);
		frame.setForeground(Color.ORANGE);
		frame.getContentPane().setForeground(Color.GREEN);
		frame.setBounds(100, 100, 663, 506);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Account");
		mnNewMenu.setForeground(Color.BLACK);
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Team");
		mnNewMenu_1.setForeground(Color.BLACK);
		menuBar.add(mnNewMenu_1);
		
		JMenu mnNewMenu_3 = new JMenu("Help");
		mnNewMenu_3.setForeground(Color.BLACK);
		mnNewMenu_3.setBackground(Color.WHITE);
		menuBar.add(mnNewMenu_3);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(21, 11, 519, 370);
		panel.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("Add Employee");
		btnNewButton_2.setBackground(new Color(255, 153, 255));
		btnNewButton_2.setBounds(111, 329, 102, 30);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton("Apply for Leave");
		btnNewButton_4.setBackground(new Color(255, 255, 204));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_4.setBounds(10, 142, 125, 32);
		panel.add(btnNewButton_4);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.setBounds(359, 23, 91, 20);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		
		textField = new JTextField();
		textField.setBounds(178, 23, 157, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblMcrochedIndustries = new JLabel("   McRoched Industries");
		lblMcrochedIndustries.setBounds(0, 15, 181, 32);
		panel.add(lblMcrochedIndustries);
		lblMcrochedIndustries.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		
		JButton btnTeamRoster = new JButton("Team Roster");
		btnTeamRoster.setBounds(198, 209, 123, 32);
		panel.add(btnTeamRoster);
		btnTeamRoster.setBackground(new Color(255, 255, 204));
		
		JButton btnAccount = new JButton("Account");
		btnAccount.setBounds(10, 209, 125, 32);
		panel.add(btnAccount);
		btnAccount.setBackground(new Color(255, 255, 204));
		
		JButton btnNewButton_3 = new JButton("Advanced Search");
		btnNewButton_3.setBounds(198, 142, 125, 32);
		panel.add(btnNewButton_3);
		btnNewButton_3.setBackground(new Color(255, 255, 204));
		
		JButton btnUpdateEmployee = new JButton("Update Employee");
		btnUpdateEmployee.setBackground(new Color(255, 153, 255));
		btnUpdateEmployee.setBounds(223, 329, 102, 30);
		panel.add(btnUpdateEmployee);
		
		JButton btnDeleteEmployee = new JButton("Delete Employee");
		btnDeleteEmployee.setBackground(new Color(255, 153, 255));
		btnDeleteEmployee.setBounds(335, 329, 102, 30);
		panel.add(btnDeleteEmployee);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
	}
}
