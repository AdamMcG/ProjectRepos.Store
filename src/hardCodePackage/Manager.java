package hardCodePackage;

import java.util.ArrayList;

public class Manager extends User 
{
	private String groupTitle;
	
	
	public Manager(String name, String gender, String nationality,
			double contractLength, String employeeType, String password,
			String department) {
		super(name, gender, nationality, department, contractLength,
				employeeType, password, department);

	}

	public void CreateGroup()
	{
		ArrayList<User> group = new ArrayList<User>();
		
	}
	
	
}
