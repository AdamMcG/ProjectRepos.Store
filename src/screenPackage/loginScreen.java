package screenPackage;

import hardCodePackage.EmployeeRegister;
import hardCodePackage.User;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;

import databasePackage.CreateDBOperations;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class loginScreen extends JFrame implements ActionListener {

	private JFrame frame;
	private JTextField emField;
	private JPasswordField passwordField;
	private JButton login, forgotten, cancel;
	private EmployeeRegister EList;
	private ResultSet s;
	private ResultSet s2;
	private CreateDBOperations a;

	public loginScreen(EmployeeRegister EList, CreateDBOperations a,
			ResultSet s, ResultSet s2) {
		this.a = a;
		this.s = s;
		this.s2 = s2;
		this.EList = EList;
		setFrame(new JFrame());
		frame.setResizable(false);
		getFrame().getContentPane().setBackground(Color.DARK_GRAY);
		getFrame().setForeground(Color.RED);
		getFrame().getContentPane().setForeground(Color.GREEN);
		getFrame().setBounds(100, 100, 510, 404);
		getFrame().setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getFrame().getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setForeground(Color.RED);
		panel.setBounds(41, 23, 392, 322);
		getFrame().getContentPane().add(panel);
		panel.setLayout(null);

		emField = new JTextField();
		emField.setBounds(137, 93, 101, 20);
		panel.add(emField);
		emField.setColumns(10);

		JLabel lblEmployeeNo = new JLabel("Employee No.");
		lblEmployeeNo.setForeground(Color.WHITE);
		lblEmployeeNo.setBackground(Color.GREEN);
		lblEmployeeNo.setFont(new Font("Arial", Font.PLAIN, 13));
		lblEmployeeNo.setBounds(41, 92, 86, 20);
		panel.add(lblEmployeeNo);

		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Arial", Font.PLAIN, 12));
		lblPassword.setBounds(41, 150, 72, 17);
		panel.add(lblPassword);

		login = new JButton("Login");
		login.addActionListener(this);

		login.setBackground(new Color(255, 255, 204));
		login.setForeground(Color.BLACK);
		login.setBounds(41, 201, 86, 23);
		panel.add(login);

		passwordField = new JPasswordField();
		passwordField.setBounds(137, 149, 101, 20);
		passwordField.setColumns(10);
		panel.add(passwordField);
		passwordField.addActionListener(this);

		JLabel lblNewLabel = new JLabel("McRoched Industries");
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		lblNewLabel.setBounds(24, 24, 181, 32);
		panel.add(lblNewLabel);

		forgotten = new JButton("Forgot Password?");
		forgotten.setBackground(new Color(102, 255, 255));
		forgotten.setForeground(Color.BLACK);
		forgotten.setBounds(68, 262, 148, 32);
		panel.add(forgotten);
		forgotten.addActionListener(this);

		cancel = new JButton("cancel");
		cancel.setBackground(new Color(255, 255, 204));
		cancel.setForeground(Color.BLACK);
		cancel.setBounds(149, 201, 89, 23);
		panel.add(cancel);
		cancel.addActionListener(this);
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
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == login) {
			loginCheck();

		}

		else if (e.getSource() == cancel) {
			System.exit(1);
		}

		else if (e.getSource() == forgotten) {
			ForgottenPasswordScreen1 s = new ForgottenPasswordScreen1();
		}
	}

	public void loginCheck() {
		try {
			System.out.println(EList.getEmployeeNum(0) + "\n"
					+ EList.getEmployeePass(0));

			for (int i = 0; i < EList.EmployeeListSize(); i++) {
				if ((emField.getText().equals(EList.getEmployeeNum(i)))
						&& (passwordField.getText().equals(EList
								.getEmployeePass(i)))) {
					getFrame().dispose();
					HomeScreen h = new HomeScreen(EList, i, a, s);
					System.out.println(EList.EmployeeListSize());
				} else {
					JOptionPane.showMessageDialog(null,
							"Incorrect password or username! ",
							"EmployeeRoster", JOptionPane.PLAIN_MESSAGE);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public JFrame getFrame() {
		return frame;
	}

	public JFrame setFrame(JFrame frame) {
		this.frame = frame;
		return frame;
	}
}
