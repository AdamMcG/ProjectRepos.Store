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
					EmployeeRegister E = new EmployeeRegister();
					User a = new User("a", "123", "male", "Irish", 2.5,
							"Admin", "123", "HR");
					E.AddUser(a);
					System.out.println(a.getEmployeeNumber());
					loginScreen window = new loginScreen(E);
					window.getFrame().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
