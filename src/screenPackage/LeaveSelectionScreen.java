package screenPackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;


public class LeaveSelectionScreen {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LeaveSelectionScreen window = new LeaveSelectionScreen();
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
	public LeaveSelectionScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(37, 11, 473, 365);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("McRoched Industries");
		label.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		label.setBounds(10, 11, 181, 32);
		panel.add(label);
		
		JRadioButton rdbtnHolidayLeave = new JRadioButton("Holiday Leave");
		rdbtnHolidayLeave.setBackground(new Color(255, 255, 204));
		rdbtnHolidayLeave.setFont(new Font("Arial", Font.PLAIN, 14));
		rdbtnHolidayLeave.setBounds(33, 100, 147, 43);
		panel.add(rdbtnHolidayLeave);
		
		JRadioButton rdbtnGeneralLeave = new JRadioButton("General Leave");
		rdbtnGeneralLeave.setBackground(new Color(255, 255, 204));
		rdbtnGeneralLeave.setFont(new Font("Arial", Font.PLAIN, 14));
		rdbtnGeneralLeave.setBounds(33, 188, 147, 43);
		panel.add(rdbtnGeneralLeave);
		
		JButton btnNewButton = new JButton("Continue");
		btnNewButton.setBackground(new Color(255, 255, 204));
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 14));
		btnNewButton.setBounds(44, 311, 89, 43);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.setBackground(new Color(255, 255, 204));
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 14));
		btnNewButton_1.setBounds(302, 311, 100, 43);
		panel.add(btnNewButton_1);
		frame.setBounds(100, 100, 574, 453);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
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
	}
}
