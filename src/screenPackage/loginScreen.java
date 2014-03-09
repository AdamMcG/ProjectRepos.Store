package screenPackage;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class loginScreen extends JFrame implements ActionListener {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton login,forgotten;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginScreen window = new loginScreen();
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
	public loginScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setForeground(Color.RED);
		frame.getContentPane().setForeground(Color.GREEN);
		frame.setBounds(100, 100, 510, 404);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setForeground(Color.RED);
		panel.setBounds(41, 23, 392, 322);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(137, 93, 101, 20);
		panel.add(textField);
		textField.setColumns(10);
		
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
		panel.add(passwordField);
		
		JLabel lblNewLabel = new JLabel("McRoched Industries");
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		lblNewLabel.setBounds(24, 24, 181, 32);
		panel.add(lblNewLabel);
		
		forgotten = new JButton("Forgot Password?");
		forgotten.setBackground(new Color(102, 255, 255));
		forgotten.setForeground(Color.BLACK);
		forgotten.setBounds(68, 262, 119, 32);
		panel.add(forgotten);
		
		JButton btnCancel = new JButton("cancel");
		btnCancel.setBackground(new Color(255, 255, 204));
		btnCancel.setForeground(Color.BLACK);
		btnCancel.setBounds(149, 201, 89, 23);
		panel.add(btnCancel);
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
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == login){
			
			HomeScreen h = new HomeScreen();
		}
	}
}
