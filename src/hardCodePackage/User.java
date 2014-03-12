package hardCodePackage;

public abstract class User 
{
	private String name;
	private String employeeNumber;
	private int birthdate;
	private String gender;
	private String nationality;
	private String employeeType;
	private double contractLength;
	private String department;
	private String password;
	
	public User(String name, int birthdate, String gender, String nationality, double contractLength, String employeeType, String password)
	{
		this.name = name; 
		this.gender =gender;
		this.birthdate = birthdate;
		this.nationality = nationality;
		this.contractLength = contractLength;
		
		
		
		
	}

}
