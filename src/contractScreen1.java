import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.UIManager;


public class contractScreen1 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContactScreen window = new ContactScreen();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */
	public contractScreen1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 853, 577);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(96, 22, 597, 415);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("McRoched Industries");
		label.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		label.setBounds(10, 11, 181, 32);
		panel.add(label);
		
		JLabel lblContractLength = new JLabel("Contract Length");
		lblContractLength.setBounds(24, 102, 85, 32);
		panel.add(lblContractLength);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(131, 108, 153, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblContractType = new JLabel("Contract Type:");
		lblContractType.setFont(new Font("Arial", Font.PLAIN, 11));
		lblContractType.setBounds(24, 165, 85, 32);
		panel.add(lblContractType);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(131, 171, 153, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblContractCommenceDate = new JLabel("Contract Commenced");
		lblContractCommenceDate.setFont(new Font("Arial", Font.PLAIN, 11));
		lblContractCommenceDate.setBounds(10, 225, 113, 26);
		panel.add(lblContractCommenceDate);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(131, 228, 153, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnSave = new JButton("Exit");
		btnSave.setBounds(138, 326, 89, 23);
		panel.add(btnSave);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Account");
		mnNewMenu.setForeground(Color.BLACK);
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_2 = new JMenu("Team");
		mnNewMenu_2.setForeground(Color.BLACK);
		menuBar.add(mnNewMenu_2);
		
		JMenu mnHelp = new JMenu("Help");
		mnHelp.setForeground(Color.BLACK);
		menuBar.add(mnHelp);
	}
}
