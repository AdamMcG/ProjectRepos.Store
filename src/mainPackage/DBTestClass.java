package mainPackage;

import java.sql.*;

import databasePackage.CreateDBOperations;

public class DBTestClass {

	public static void main(String[] args)
	{
		CreateDBOperations a = new CreateDBOperations(); 
		a.openDB();
		a.dropTables();
		a.buildEmployeeTable();
		a.buildtableDept();
		a.queryDB();
		a.CloseDB();
	}

}
