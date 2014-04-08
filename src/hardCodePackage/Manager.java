package hardCodePackage;

import java.util.ArrayList;

public class Manager extends User 
{
	private String groupTitle;
	
	
	public Manager(String fname,String lname, String gender, String nationality,
			double contractLength, String employeeType, String password,
			String department) {
		super(fname, lname, gender, nationality, department, contractLength,
				employeeType, password, department);

	}

	
}
