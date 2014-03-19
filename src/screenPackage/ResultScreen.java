package screenPackage;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ResultScreen extends JFrame implements ActionListener {
	
	private JFrame frame;
	private JButton left, right, first, last, exit;
	private JTextField name, eNum,title,dept,phoneNum;
	
	
	public ResultScreen()
	{
		frame = new JFrame();
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setForeground(Color.RED);
		frame.getContentPane().setForeground(Color.GREEN);
		frame.setBounds(100, 100, 564, 603);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setForeground(Color.RED);
		panel.setBounds(30, 23, 485, 487);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		name = new JTextField();
		name.setEditable(false);
		name.setBounds(106, 65, 101, 20);
		panel.add(name);
		name.setColumns(10);

		JLabel lblEmployeeNo = new JLabel("Name:");
		lblEmployeeNo.setForeground(Color.BLACK);
		lblEmployeeNo.setBackground(Color.GREEN);
		lblEmployeeNo.setFont(new Font("Arial", Font.PLAIN, 13));
		lblEmployeeNo.setBounds(10, 64, 86, 20);
		panel.add(lblEmployeeNo);

		JLabel lblPassword = new JLabel("Emp.No:");
		lblPassword.setForeground(Color.BLACK);
		lblPassword.setFont(new Font("Arial", Font.PLAIN, 12));
		lblPassword.setBounds(10, 95, 72, 17);
		panel.add(lblPassword);

		JLabel lblNewLabel = new JLabel("McRoched Industries");
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 11, 181, 32);
		panel.add(lblNewLabel);

		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBounds(116, 124, 54, 23);
		panel.add(rdbtnMale);

		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(183, 124, 59, 23);
		panel.add(rdbtnFemale);

		JLabel lblGender = new JLabel("Gender:");
		lblGender.setForeground(Color.BLACK);
		lblGender.setFont(new Font("Arial", Font.PLAIN, 12));
		lblGender.setBounds(10, 123, 72, 23);
		panel.add(lblGender);

		JLabel lblEmpTitle = new JLabel("Emp. Title:");
		lblEmpTitle.setForeground(Color.BLACK);
		lblEmpTitle.setFont(new Font("Arial", Font.PLAIN, 12));
		lblEmpTitle.setBounds(10, 174, 72, 23);
		panel.add(lblEmpTitle);

		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setForeground(Color.BLACK);
		lblDepartment.setFont(new Font("Arial", Font.PLAIN, 12));
		lblDepartment.setBounds(10, 208, 72, 23);
		panel.add(lblDepartment);

		eNum = new JTextField();
		eNum.setEditable(false);
		eNum.setBounds(106, 96, 102, 20);
		panel.add(eNum);
		eNum.setColumns(10);

		title = new JTextField();
		title.setEditable(false);
		title.setBounds(106, 176, 190, 20);
		panel.add(title);
		title.setColumns(10);

		dept = new JTextField();
		dept.setEditable(false);
		dept.setBounds(106, 207, 191, 20);
		panel.add(dept);
		dept.setColumns(10);

		JLabel lblPhoneNo = new JLabel("Phone No.");
		lblPhoneNo.setForeground(Color.BLACK);
		lblPhoneNo.setFont(new Font("Arial", Font.PLAIN, 12));
		lblPhoneNo.setBounds(10, 242, 72, 38);
		panel.add(lblPhoneNo);

		phoneNum = new JTextField();
		phoneNum.setEditable(false);
		phoneNum.setBounds(106, 252, 190, 20);
		panel.add(phoneNum);
		phoneNum.setColumns(10);

		JTextArea Description = new JTextArea();
		Description.setBounds(106, 299, 269, 121);
		panel.add(Description);

		JLabel lblDescription = new JLabel("Description:");
		lblDescription.setForeground(Color.BLACK);
		lblDescription.setFont(new Font("Arial", Font.PLAIN, 12));
		lblDescription.setBounds(10, 291, 72, 38);
		panel.add(lblDescription);
		
		JButton btnExit = new JButton("exit");
		btnExit.setBackground(new Color(255, 255, 204));
		btnExit.setBounds(36, 453, 59, 23);
		panel.add(btnExit);
		
		JButton btnFirst = new JButton("First");
		btnFirst.setBackground(new Color(255, 255, 204));
		btnFirst.setBounds(106, 453, 64, 23);
		panel.add(btnFirst);
		
		JButton btnLast = new JButton("Last");
		btnLast.setBackground(new Color(255, 255, 204));
		btnLast.setBounds(183, 453, 54, 23);
		panel.add(btnLast);
		
		JButton btnLeft = new JButton("left");
		btnLeft.setBackground(new Color(255, 255, 204));
		btnLeft.setBounds(247, 453, 49, 23);
		panel.add(btnLeft);
		
		JButton btnRight = new JButton("right");
		btnRight.setBackground(new Color(255, 255, 204));
		btnRight.setBounds(306, 453, 54, 23);
		panel.add(btnRight);
		
		JButton Update = new JButton("Update");
		Update.setBackground(new Color(255, 255, 204));
		Update.setBounds(346, 35, 111, 23);
		panel.add(Update);
		
		JButton delete = new JButton("Delete");
		delete.setBackground(new Color(255, 255, 204));
		delete.setBounds(346, 77, 111, 23);
		panel.add(delete);
		
		JButton save = new JButton("Save");
		save.setBounds(346, 124, 111, 23);
		panel.add(save);

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
	
	
	@Override
	public void actionPerformed(ActionEvent ae) {

	}
}