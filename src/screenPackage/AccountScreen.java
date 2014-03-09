package screenPackage;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class AccountScreen extends JFrame implements ActionListener {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JButton security, contract, password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AccountScreen window = new AccountScreen();
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
	public AccountScreen() {

		JFrame frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setForeground(Color.RED);
		frame.getContentPane().setForeground(Color.GREEN);
		frame.setBounds(100, 100, 564, 603);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setForeground(Color.RED);
		panel.setBounds(30, 23, 485, 465);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(106, 65, 101, 20);
		panel.add(textField);
		textField.setColumns(10);

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

		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(106, 96, 102, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(106, 176, 190, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBounds(106, 207, 191, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);

		JLabel lblPhoneNo = new JLabel("Phone No.");
		lblPhoneNo.setForeground(Color.BLACK);
		lblPhoneNo.setFont(new Font("Arial", Font.PLAIN, 12));
		lblPhoneNo.setBounds(10, 242, 72, 38);
		panel.add(lblPhoneNo);

		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setBounds(106, 252, 190, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(106, 299, 269, 121);
		panel.add(textArea);

		JLabel lblDescription = new JLabel("Description:");
		lblDescription.setForeground(Color.BLACK);
		lblDescription.setFont(new Font("Arial", Font.PLAIN, 12));
		lblDescription.setBounds(10, 291, 72, 38);
		panel.add(lblDescription);

		password = new JButton("Reset Password");
		password.setBounds(332, 18, 143, 23);
		panel.add(password);
		password.addActionListener(this);
		contract = new JButton("Contract details");
		contract.setBounds(332, 82, 143, 23);
		panel.add(contract);

		security = new JButton("Set Security Question");
		security.setBounds(332, 124, 143, 23);
		panel.add(security);
		security.addActionListener(this);

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

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == security) {
			SecurityQuestionScreen s = new SecurityQuestionScreen();

		} else if (ae.getSource() == password) {
			ResetPasswordScreen R = new ResetPasswordScreen();
		} else if (ae.getSource() == contract) {
			cScreen1 C = new cScreen1();

		}

	}
}
