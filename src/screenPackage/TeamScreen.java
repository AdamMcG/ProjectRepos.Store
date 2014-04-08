package screenPackage;

import hardCodePackage.EmployeeRegister;
import hardCodePackage.TeamManagement;
import hardCodePackage.User;

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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import databasePackage.CreateDBOperations;

public class TeamScreen extends JFrame implements ActionListener {

	private JFrame frame;
	private JTextField teamMem1;
	private JTextField teamMem2;
	private JTextField teamMem3;
	private JTextField teamMem4;
	private JTextField teamMem5;
	private JTextField groupName;
	private JButton add, cancel, delete;
	private TeamManagement createGroup;

	public TeamScreen(int i, EmployeeRegister e, CreateDBOperations a) {

		frame = new JFrame();
		frame.setBounds(100, 100, 819, 628);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

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

		JComboBox positionSelect1 = new JComboBox();
		positionSelect1.setModel(new DefaultComboBoxModel(new String[] {
				"                   ", "Project Manager", "Vice-Manager",
				"Marketing", "Programming ", "Recruitment" }));
		positionSelect1.setBounds(390, 167, 220, 20);
		panel_1.add(positionSelect1);

		JLabel lblNewLabel = new JLabel("Team Mem 1.");
		lblNewLabel.setBounds(27, 122, 72, 34);
		panel_1.add(lblNewLabel);

		teamMem1 = new JTextField();
		teamMem1.setBounds(27, 167, 255, 20);
		panel_1.add(teamMem1);
		teamMem1.setBackground(Color.WHITE);
		teamMem1.setColumns(10);

		teamMem2 = new JTextField();
		teamMem2.setBounds(27, 223, 255, 20);
		panel_1.add(teamMem2);
		teamMem2.setText("");
		teamMem2.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Team Mem 2.");
		lblNewLabel_1.setBounds(27, 182, 72, 34);
		panel_1.add(lblNewLabel_1);

		teamMem3 = new JTextField();
		teamMem3.setBounds(27, 270, 255, 20);
		panel_1.add(teamMem3);
		teamMem3.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Team Mem 3.");
		lblNewLabel_2.setBounds(27, 243, 72, 34);
		panel_1.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Team Mem 4.");
		lblNewLabel_3.setBounds(27, 293, 72, 41);
		panel_1.add(lblNewLabel_3);

		JComboBox positionSelect2 = new JComboBox();
		positionSelect2.setModel(new DefaultComboBoxModel(new String[] {
				"                   ", "Project Manager", "Vice-Manager",
				"Marketing", "Programming ", "Recruitment" }));
		positionSelect2.setBounds(390, 223, 220, 20);
		panel_1.add(positionSelect2);

		JComboBox positionSelect3 = new JComboBox();
		positionSelect3.setModel(new DefaultComboBoxModel(new String[] {
				"                   ", "Project Manager", "Vice-Manager",
				"Marketing", "Programming ", "Recruitment" }));
		positionSelect3.setBounds(390, 270, 220, 20);
		panel_1.add(positionSelect3);

		JComboBox positionSelect4 = new JComboBox();
		positionSelect4.setModel(new DefaultComboBoxModel(new String[] {
				"                   ", "Project Manager", "Vice-Manager",
				"Marketing", "Programming ", "Recruitment" }));
		positionSelect4.setBounds(390, 327, 220, 20);
		panel_1.add(positionSelect4);

		JComboBox positionSelect5 = new JComboBox();
		positionSelect5.setModel(new DefaultComboBoxModel(new String[] {
				"                   ", "Project Manager", "Vice-Manager",
				"Marketing", "Programming ", "Recruitment" }));
		positionSelect5.setBounds(390, 394, 220, 20);
		panel_1.add(positionSelect5);

		JComboBox<User> groupBox = new JComboBox();
		groupBox.setModel(new DefaultComboBoxModel(new String[] {
				"new Group", "Group1", "Group2", "Group3", "Group4" }));
		groupBox.setBounds(510, 27, 125, 24);
		panel_1.add(groupBox);

		delete = new JButton("Delete Group");
		delete.setBounds(510, 473, 109, 20);
		panel_1.add(delete);

		JLabel lblGroupName = new JLabel("Group Name:");
		lblGroupName.setFont(new Font("Arial", Font.PLAIN, 11));
		lblGroupName.setBounds(24, 76, 86, 35);
		panel_1.add(lblGroupName);

		groupName = new JTextField();
		groupName.setFont(new Font("Arial", Font.PLAIN, 13));
		groupName.setBounds(151, 76, 187, 35);
		panel_1.add(groupName);
		groupName.setColumns(10);

		teamMem4 = new JTextField();
		teamMem4.setBounds(27, 327, 255, 20);
		panel_1.add(teamMem4);
		teamMem4.setColumns(10);

		teamMem5 = new JTextField();
		teamMem5.setBounds(27, 394, 255, 20);
		panel_1.add(teamMem5);
		teamMem5.setColumns(10);

		JLabel lblTeamMem = new JLabel("Team Mem 5.");
		lblTeamMem.setBounds(27, 355, 79, 41);
		panel_1.add(lblTeamMem);

		JLabel label = new JLabel("McRoched Industries");
		label.setBounds(10, 19, 181, 32);
		panel_1.add(label);
		label.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));

		cancel = new JButton("Cancel");
		cancel.setBounds(193, 425, 89, 23);
		panel_1.add(cancel);
		cancel.setBackground(new Color(255, 255, 204));
		cancel.setForeground(Color.BLACK);
		cancel.addActionListener(this);

		add = new JButton("Add");
		add.setBounds(27, 425, 89, 23);
		panel_1.add(add);
		add.setBackground(new Color(255, 255, 204));
		add.setForeground(Color.BLACK);

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
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == add) {
			createGroup.createGroup(teamMem1.getText(), teamMem2.getText(),
					teamMem3.getText(), teamMem4.getText());
		} else if (ae.getSource() == cancel) {
			frame.dispose();

		}

	}
}
