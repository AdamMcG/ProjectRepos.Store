package mainPackage;

import hardCodePackage.EmployeeRegister;

import java.sql.*;

import screenPackage.AccountScreen;
import screenPackage.loginScreen;
import databasePackage.CreateDBOperations;

public class DBTestClass {

	public static void main(String[] args) {
		CreateDBOperations a = new CreateDBOperations();
		a.openDB();
		 a.dropTables();
		 a.dropTableTeam();
		 a.dropTableContract();
		 a.dropTableEmp();
		 a.dropTablePassword();
		a.buildtableDept(); // error here
		a.buildTableContract();
		a.buildTablePassword();
		a.buildTableTeam();
		a.buildEmployeeTable();
		// a.buildTableGenericLeave();
		// a.buildTableLeaveHoliday();
		ResultSet data = a.queryDBemp();
		ResultSet data2 = a.queryDBPass();
		// a.queryDB();
		EmployeeRegister E = new EmployeeRegister(a);
		E.printList();
		loginScreen s = new loginScreen(E, a, data, data2);
		s.getFrame().setVisible(true);
		//a.CloseDB();
	}

}
