package hardCodePackage;


public class User {
	private String name;
	private int employeeNumber;
	private String birthdate;
	private String gender;
	private String nationality;
	private String employeeType;
	private double contractLength;
	private String department,password;

	public User(String name, String birthdate, String gender, String nationality,
			double contractLength, String employeeType, String password,
			String department) {
		this.setName(name);
		this.setGender(gender);
		this.setBirthdate(birthdate);
		this.setNationality(nationality);
		this.setContractLength(contractLength);
		this.setDepartment(department);
		this.setPassword(password);
	}

	public String getEmployeeNumber() {
		String empNum = String.valueOf(this.employeeNumber);
		return empNum;
	}

	public void setEmployeeNumber(String employeeNumber) {
		int temp = 1;
		if (getEmployeeType().equals("manager")) {
			this.employeeNumber = 150000 + temp;
		} else if (getEmployeeType().equals("Admin")) {

			this.employeeNumber = 180000 + temp;
		}

		else {
			this.employeeNumber = 120000 + temp;

		}
		temp++;
	}

	public String getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public double getContractLength() {
		return contractLength;
	}

	public void setContractLength(double contractLength) {
		this.contractLength = contractLength;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
