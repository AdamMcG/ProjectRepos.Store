package screenPackage;

import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;

public class LeaveSelectionScreen extends JFrame implements ActionListener{
	private JFrame frame;
	private JButton continue1, cancel;


	/**
	 * Create the application.
	 */
	public LeaveSelectionScreen() {

		
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

		continue1 = new JButton("Continue");
		continue1.setBackground(new Color(255, 255, 204));
		continue1.setFont(new Font("Arial", Font.PLAIN, 14));
		continue1.setBounds(44, 311, 89, 43);
		panel.add(continue1);
		continue1.addActionListener(this);

		cancel = new JButton("Cancel");
		cancel.setBackground(new Color(255, 255, 204));
		cancel.setFont(new Font("Arial", Font.PLAIN, 14));
		cancel.setBounds(302, 311, 100, 43);
		panel.add(cancel);
		cancel.addActionListener(this);
		frame.setBounds(100, 100, 574, 453);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

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
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == continue1)
		{
			frame.setVisible(false);
			LeaveAppScreen a = new LeaveAppScreen();
		}
		else if(ae.getSource() == cancel)
		{
			HomeScreen s = new HomeScreen();
			frame.setVisible(false);
			
		}
		
		
	}
}
