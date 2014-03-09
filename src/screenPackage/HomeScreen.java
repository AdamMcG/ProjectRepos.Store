package screenPackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.JList;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.JPanel;

public class HomeScreen extends JFrame implements ActionListener {

	private JFrame frame;
	JButton addButton, deleteButton, teamRoster, leaveApp, account,
			updateEmployee, advancedSearch, deleteEmployee;

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

		addButton = new JButton("Add Employee");
		addButton.setBackground(new Color(255, 153, 255));
		addButton.setBounds(10, 329, 102, 30);
		panel.add(addButton);
		addButton.addActionListener(this);

		leaveApp = new JButton("Apply for Leave");
		leaveApp.setBackground(new Color(255, 255, 204));
		leaveApp.addActionListener(this);

		leaveApp.setBounds(10, 142, 125, 32);
		panel.add(leaveApp);
		leaveApp.addActionListener(this);

		JLabel mcrochedIndustries = new JLabel("   McRoched Industries");
		mcrochedIndustries.setBounds(0, 15, 181, 32);
		panel.add(mcrochedIndustries);
		mcrochedIndustries.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));

		teamRoster = new JButton("Team Roster");
		teamRoster.setBounds(198, 209, 123, 32);
		panel.add(teamRoster);
		teamRoster.setBackground(new Color(255, 255, 204));
		teamRoster.addActionListener(this);

		account = new JButton("Account");
		account.setBounds(10, 209, 125, 32);
		panel.add(account);
		account.addActionListener(this);
		account.setBackground(new Color(255, 255, 204));

		advancedSearch = new JButton("Advanced Search");
		advancedSearch.setBounds(198, 142, 125, 32);
		panel.add(advancedSearch);
		advancedSearch.addActionListener(this);
		advancedSearch.setBackground(new Color(255, 255, 204));

		updateEmployee = new JButton("Update Employee");
		updateEmployee.setBackground(new Color(255, 153, 255));
		updateEmployee.setBounds(122, 329, 102, 30);
		panel.add(updateEmployee);
		updateEmployee.addActionListener(this);

		deleteEmployee = new JButton("Delete Employee");
		deleteEmployee.setBackground(new Color(255, 153, 255));
		deleteEmployee.setBounds(234, 329, 102, 30);
		panel.add(deleteEmployee);
		deleteEmployee.addActionListener(this);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == addButton) {
			// new AddScreen();
			AddScreen addScreen = new AddScreen();
		}

		else if (ae.getSource() == account) {
			AccountScreen accountScreen = new AccountScreen();

		}

		else if (ae.getSource() == advancedSearch) {
			Advanced_Search_Screen A = new Advanced_Search_Screen();

		}

		else if (ae.getSource() == teamRoster) {
			TeamScreen T = new TeamScreen();

		}

		else if (ae.getSource() == leaveApp) {
			LeaveSelectionScreen L = new LeaveSelectionScreen();
		}

		else if (ae.getSource() == deleteEmployee) {
			String b = JOptionPane.showInputDialog(null,
					"Enter the name of contact you wish to delete. ",
					"EmployeeRoster", JOptionPane.QUESTION_MESSAGE);

		}
	}
}