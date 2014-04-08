package hardCodePackage;


public class User {
	private String fname;
	private String lname;
	private String address; 
	private String employeeNumber;
	private String birthdate;
	private String gender;
	private String nationality;
	private String employeeType;
	private double contractLength;
	private String department,password;

	public User(String fname, String lname, String address, String gender, String nationality, String employeeNumber,
			double contractLength, String employeeType, String password,
			String department) {
		this.setfName(fname);
		this.setAddress(address);
		this.setLname(lname);
		this.setEmployeeNumber(employeeNumber);
		this.employeeType = employeeType;
		this.setGender(gender);
		this.setNationality(nationality);
		this.setContractLength(contractLength);
		this.setDepartment(department);
		this.setPassword(password);
	}

	public String getEmployeeNumber() {
	return employeeNumber;
	}

	public String getEmployeeType() {
		return employeeType;
	}
	
	public void setEmployeeNumber(String employeeNumber)
	{
		this.employeeNumber = employeeNumber;
	}

	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}

	public String getName() {
		return fname;
	}

	public void setfName(String fname) {
		this.fname = fname;
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

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
