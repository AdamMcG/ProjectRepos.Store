package hardCodePackage;

import java.util.Random;

public class User {
	private String name;
	private int employeeNumber;
	private int birthdate;
	private String gender;
	private String nationality;
	private String employeeType;
	private double contractLength;
	private String department;
	private String password;

	public User(String name, int birthdate, String gender, String nationality,
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
		Random rand = new Random();
		int temp = rand.nextInt(100);
		if (getEmployeeType().equals("manager")) {
			this.employeeNumber = 155000 + temp;
		} else if (getEmployeeType().equals("Admin")) {

			this.employeeNumber = 188000 + temp;
		}

		else {
			this.employeeNumber = 122000 + temp;

		}
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

	public int getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(int birthdate) {
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
