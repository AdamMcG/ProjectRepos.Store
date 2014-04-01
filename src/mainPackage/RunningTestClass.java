package mainPackage;

import hardCodePackage.EmployeeRegister;
import hardCodePackage.User;

import java.awt.EventQueue;

import screenPackage.loginScreen;

public class RunningTestClass {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					
					//loginScreen window = new loginScreen(E);
					//window.getFrame().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
