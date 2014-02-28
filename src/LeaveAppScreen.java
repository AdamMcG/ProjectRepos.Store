import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;


public class LeaveAppScreen {

	private JFrame frame;
	private JTextField textField_1;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LeaveAppScreen window = new LeaveAppScreen();
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
	public LeaveAppScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 666, 569);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(28, 11, 557, 428);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("McRoched Industries");
		label.setBounds(25, 32, 153, 21);
		panel.add(label);
		label.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Group1", "Group2", "Group3"}));
		comboBox.setBounds(110, 81, 206, 20);
		panel.add(comboBox);
		
		JLabel lblRecipient = new JLabel("Group:");
		lblRecipient.setBounds(35, 74, 65, 32);
		panel.add(lblRecipient);
		lblRecipient.setForeground(Color.BLACK);
		lblRecipient.setFont(new Font("Arial", Font.PLAIN, 12));
		
		textField_1 = new JTextField();
		textField_1.setBounds(113, 127, 65, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(113, 171, 434, 99);
		panel.add(textArea);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(421, 390, 89, 23);
		panel.add(btnCancel);
		btnCancel.setBackground(new Color(255, 255, 204));
		
		JButton btnSend = new JButton("Continue");
		btnSend.setBounds(206, 385, 89, 32);
		panel.add(btnSend);
		btnSend.setBackground(new Color(255, 255, 204));
		
		JLabel lblMsgTitle = new JLabel("Num. Days\r\n");
		lblMsgTitle.setBounds(38, 120, 65, 32);
		panel.add(lblMsgTitle);
		lblMsgTitle.setForeground(Color.BLACK);
		lblMsgTitle.setFont(new Font("Arial", Font.PLAIN, 12));
		
		JLabel lblMsgText = new JLabel("Descript\r\nion");
		lblMsgText.setBounds(38, 166, 65, 32);
		panel.add(lblMsgText);
		lblMsgText.setForeground(Color.BLACK);
		lblMsgText.setFont(new Font("Arial", Font.PLAIN, 12));
		
		JLabel lblApplicant = new JLabel("Applicant");
		lblApplicant.setFont(new Font("Arial", Font.PLAIN, 12));
		lblApplicant.setBounds(25, 322, 75, 32);
		panel.add(lblApplicant);
		
		textField = new JTextField();
		textField.setBounds(113, 329, 292, 20);
		panel.add(textField);
		textField.setColumns(10);
		String petName = (String)comboBox.getSelectedItem();
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Account menu");
		mnNewMenu.setForeground(Color.BLACK);
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Team");
		mnNewMenu_1.setForeground(Color.BLACK);
		menuBar.add(mnNewMenu_1);
		
		JMenu mnNewMenu_2 = new JMenu("Messaging");
		mnNewMenu_2.setForeground(Color.BLACK);
		menuBar.add(mnNewMenu_2);
		
		JMenu mnHelp = new JMenu("Help");
		mnHelp.setForeground(Color.BLACK);
		menuBar.add(mnHelp);
	}
}
