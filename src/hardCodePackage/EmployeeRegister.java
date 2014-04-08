package hardCodePackage;

import java.sql.*;
import java.util.ArrayList;

import databasePackage.CreateDBOperations;

public class EmployeeRegister {
	private ArrayList<User> EmployeeList;
	private ResultSet rset;
	private CreateDBOperations cDBo;

	public EmployeeRegister(CreateDBOperations cDBo) {
		this.cDBo = cDBo;
		EmployeeList = new ArrayList<User>();
		fillRegister();
	}

	public void AddUserToRegistry(User u) {
		EmployeeList.add(u);

	}

	public User getStaffMember(int n) {
		return EmployeeList.get(n);

	}

	public void removeEmployee(String name) {
		for (int i = 0; i < EmployeeListSize(); i++) {
			if (name.equals(EmployeeList.get(i).getName())) {
				EmployeeList.remove(i);
			}

		}
	}

	public int findEmployee(String name) {
		int index = -1;
		for (int i = 0; i < EmployeeList.size(); i++) {
			if (EmployeeList.get(i).getName().equals(name)) {
				index = i;
			}
		}
		return index;
	}

	public void fillRegister() {

		rset = cDBo.queryDBemp();
		ResultSet rsetPass = cDBo.queryDBPass();
		ResultSet rsetDep = cDBo.queryDB();

		try {
			rset.first();
			rsetPass.first();
			rsetDep.first();
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		if (EmployeeList.size() > 0) {
			for (int i = EmployeeList.size() - 1; i >= 0; i--) {
				EmployeeList.remove(i);
			}
		}
		try {
			rset.beforeFirst();
			while (rset.next() == true) {

				User u = new User(rset.getString(6), rset.getString(7),
						rset.getString("Em_Address"), rset.getString(8),
						rset.getString(9), rset.getString(1),
						rset.getDouble(10), setStaff(rset),
						rsetPass.getString("password"),
						rsetDep.getString("Dep_name"));
				EmployeeList.add(u);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public String returnEmployeeType(int i) {
		return EmployeeList.get(i).getEmployeeType();
	}

	public void removeTeamMember() {

	}

	public void printList() {
		for (int i = 0; i < EmployeeList.size(); i++) {
			System.out.println(EmployeeList.get(i).getEmployeeNumber()
					+ EmployeeList.get(i).getGender()
					+ EmployeeList.get(i).getEmployeeType());

		}
		System.out.println(EmployeeList.size());
	}

	public String setStaff(ResultSet rset) {
		String staff = "regular employee";
		try {
			if (rset.getString("Em_IsAdmin").equals("Y")) {
				staff = "Admin";
			} else if (rset.getString("Em_Manager").equals("Y")
					&& (rset.getString("Em_IsAdmin").equals("N"))) {
				staff = "Manager";
			} else {
				staff = "staff";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return staff;
	}

	public String getEmployeeNum(int i) {
		String s = EmployeeList.get(i).getEmployeeNumber();
		return s;
	}

	public String getEmployeePass(int i) {
		String s = EmployeeList.get(i).getPassword();
		return s;
	}

	public int EmployeeListSize() {
		return EmployeeList.size();
	}

	public User ReturnEmployee(int i) {
		return EmployeeList.get(i);
	}
}
