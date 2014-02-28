package screenPackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;


public class ForgottenPasswordScreen1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ForgottenPasswordScreen1 window = new ForgottenPasswordScreen1();
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
	public ForgottenPasswordScreen1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 548, 482);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(33, 27, 467, 390);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("McRoched Industries");
		label.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		label.setBounds(10, 21, 181, 32);
		panel.add(label);
		
		JLabel lblForgottenPasswordYou = new JLabel("Forgotten password? You can either: ");
		lblForgottenPasswordYou.setBounds(37, 102, 251, 41);
		panel.add(lblForgottenPasswordYou);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Send Link to email");
		rdbtnNewRadioButton.setBounds(67, 177, 177, 41);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Answer Security Question");
		rdbtnNewRadioButton_1.setBounds(67, 248, 177, 41);
		panel.add(rdbtnNewRadioButton_1);
		
		JButton btnNewButton = new JButton("Continue");
		btnNewButton.setBounds(76, 337, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.setBounds(222, 336, 102, 23);
		panel.add(btnNewButton_1);
	}
}
