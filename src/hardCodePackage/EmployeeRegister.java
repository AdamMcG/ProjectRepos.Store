package hardCodePackage;

import java.util.ArrayList;

public class EmployeeRegister 
{
	private ArrayList<User> EmployeeList;
	private ArrayList<User> groups;

	public EmployeeRegister() {
		EmployeeList = new ArrayList<User>();
		groups = new ArrayList<User>();
	}

	public void AddUserToRegistry(User u) {
		EmployeeList.add(u);

	}
	
	public void AddUserToGroups(User u)
	{
		groups.add(u);
		
	}

	public User getStaffMember(int n) {
		return EmployeeList.get(n);

	}
	
	

}
