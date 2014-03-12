package hardCodePackage;

import java.util.ArrayList;

public class EmployeeRegister {
	private ArrayList<User> EmployeeList;
	private ArrayList<User> groups;

	public EmployeeRegister() {
		EmployeeList = new ArrayList<User>();

	}

	public void AddUser(User u) {
		EmployeeList.add(u);

	}

	public User getStaffMember(int n) {
		return EmployeeList.get(n);

	}

	public boolean CheckLogin(String empNum, String password) {
		boolean check = false;
		for (int i = 0; i < EmployeeList.size(); i++) {
			if (empNum.equals(EmployeeList.get(i).getEmployeeNumber())
					&& password.equals(EmployeeList.get(i).getPassword())) {
				check = true;
			}

			else {
				check = false;
			}
		}
		return check;
	}

}
