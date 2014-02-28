import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;


public class TeamScreen extends JFrame{

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeamScreen window = new TeamScreen();
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
	public TeamScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 819, 628);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(BorderFactory.createLineBorder(Color.black));
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(35, 26, 724, 519);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"                   ", "Project Manager", "Vice-Manager", "Marketing", "Programming ", "Recruitment"}));
		comboBox.setBounds(390, 167, 220, 20);
		panel_1.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Team Mem 1.");
		lblNewLabel.setBounds(27, 122, 72, 34);
		panel_1.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(27, 167, 255, 20);
		panel_1.add(textField);
		textField.setBackground(Color.WHITE);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(27, 223, 255, 20);
		panel_1.add(textField_1);
		textField_1.setText("");
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Team Mem 2.");
		lblNewLabel_1.setBounds(27, 182, 72, 34);
		panel_1.add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(27, 270, 255, 20);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Team Mem 3.");
		lblNewLabel_2.setBounds(27, 243, 72, 34);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Team Mem 4.");
		lblNewLabel_3.setBounds(27, 293, 72, 41);
		panel_1.add(lblNewLabel_3);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"                   ", "Project Manager", "Vice-Manager", "Marketing", "Programming ", "Recruitment"}));
		comboBox_1.setBounds(390, 223, 220, 20);
		panel_1.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"                   ", "Project Manager", "Vice-Manager", "Marketing", "Programming ", "Recruitment"}));
		comboBox_2.setBounds(390, 270, 220, 20);
		panel_1.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"                   ", "Project Manager", "Vice-Manager", "Marketing", "Programming ", "Recruitment"}));
		comboBox_3.setBounds(390, 327, 220, 20);
		panel_1.add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"                   ", "Project Manager", "Vice-Manager", "Marketing", "Programming ", "Recruitment"}));
		comboBox_4.setBounds(390, 394, 220, 20);
		panel_1.add(comboBox_4);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"Group1", "Group2", "Group3", "Group4"}));
		comboBox_5.setBounds(510, 27, 125, 24);
		panel_1.add(comboBox_5);
		
		JButton btnNewButton_2 = new JButton("Delete Group");
		btnNewButton_2.setBounds(510, 473, 109, 20);
		panel_1.add(btnNewButton_2);
		
		JLabel lblGroupName = new JLabel("Group Name:");
		lblGroupName.setFont(new Font("Arial", Font.PLAIN, 11));
		lblGroupName.setBounds(24, 76, 86, 35);
		panel_1.add(lblGroupName);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Arial", Font.PLAIN, 13));
		textField_5.setBounds(151, 76, 187, 35);
		panel_1.add(textField_5);
		textField_5.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(27, 327, 255, 20);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(27, 394, 255, 20);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblTeamMem = new JLabel("Team Mem 5.");
		lblTeamMem.setBounds(27, 355, 79, 41);
		panel_1.add(lblTeamMem);
		
		JLabel label = new JLabel("McRoched Industries");
		label.setBounds(10, 19, 181, 32);
		panel_1.add(label);
		label.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.setBounds(193, 425, 89, 23);
		panel_1.add(btnNewButton_1);
		btnNewButton_1.setBackground(new Color(255, 255, 204));
		btnNewButton_1.setForeground(Color.BLACK);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setBounds(27, 425, 89, 23);
		panel_1.add(btnNewButton);
		btnNewButton.setBackground(new Color(255, 255, 204));
		btnNewButton.setForeground(Color.BLACK);
		
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
		menuBar.add(mnNewMenu_3);
	}
}
