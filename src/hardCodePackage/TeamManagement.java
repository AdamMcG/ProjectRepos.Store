package hardCodePackage;

import java.util.ArrayList;

public class TeamManagement {
	private ArrayList<User> Team;
	private String teamName;
	private String managerName;
	private EmployeeRegister e;

	public TeamManagement(EmployeeRegister e) {
		this.e = e;
	}

	public void addToGroup(String memberToAdd) {
		int check = 0;
		if (memberToAdd != null) {
			check = e.findEmployee(memberToAdd);
		}
		if (check > 0) {
			Team.add(e.ReturnEmployee(check));
		}
	}

	public void createGroup(String member1, String member2, String member3,
			String member4) {
		Team = new ArrayList<User>();
		addToGroup(member1);
		System.out.println(Team.get(0).getLname());
	}
}
