package mainPackage;

import java.sql.*;

import screenPackage.AccountScreen;
import screenPackage.loginScreen;
import databasePackage.CreateDBOperations;

public class DBTestClass {

	public static void main(String[] args)
	{
		CreateDBOperations a = new CreateDBOperations(); 
		a.openDB();
		a.dropTables();
		a.dropTableTeam();
		a.dropTableContract();
		a.dropTableEmp();
		a.dropTablePassword();
		a.buildtableDept();
		a.buildTableContract();
		a.buildTablePassword();
		a.buildTableTeam();
		a.buildEmployeeTable();
		a.buildTableGenericLeave();
		a.buildTableLeaveHoliday();
		ResultSet data = a.queryDBemp();
		ResultSet data2 = a.queryDBPass();
		//a.queryDB();
		loginScreen s = new loginScreen(data,data2,a);
		s.getFrame().setVisible(true);
	}

}
