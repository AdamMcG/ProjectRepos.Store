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

	public void removeEmployee() {

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
		String staff = "regular employee";
		try {
			rset.first();
			rsetPass.first();
			rsetDep.first();
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
	
		try {
			if (rset.getString("Em_IsAdmin").equals("Y")) {
				staff = "Admin";
			} else if (rset.getString("Em_Manager").equals("Y")) {
				staff = "Manager";
			}
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}

		if (EmployeeList.size() > 0) {
			for (int i = EmployeeList.size() - 1; i >= 0; i--) {
				EmployeeList.remove(i);
			}
		}
		try {
			while (rset.next()) {
				String name = (rset.getString(6) + rset.getString(7));
				User u = new User(name, rset.getString(8), rset.getString(9),
						rset.getDouble(10), staff,
						rsetPass.getString("password"),
						rsetDep.getString("Dep_name"));
				EmployeeList.add(u);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

	public void removeTeamMember() 
	{
		

	}

	public void printList() 
	{
		for (int i = 0; i < EmployeeList.size(); i++)
		{
			System.out.println(EmployeeList.get(i).getEmployeeNumber()
					+ EmployeeList.get(i).getGender());
			
		}
		
	}

}
