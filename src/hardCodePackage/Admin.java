package hardCodePackage;

public class Admin extends User {

	public Admin(String fname,String lname, String gender, String nationality,
			double contractLength, String employeeType, String password,
			String department) {
		super(fname, lname, gender, nationality, department, contractLength,
				employeeType, password, department);

	}

}
