package databasePackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import hardCodePackage.Admin;
import hardCodePackage.User;

public class DatabaseMethodOperations {
	private Connection conn;
	private ResultSet rset;
	private PreparedStatement pstmt;
	private Statement stmt;

	public void addEmp(User u) {
		if (u instanceof Admin) {
			String s2 = "INSERT INTO Employee(EM_Lname, EM_Fname,Isadmin, Ismanager, Em_Contractlength) VALUES ()";
			try {
				pstmt = conn.prepareStatement(s2);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// Row1
			try {
				pstmt.setString(1, u.getName());

				pstmt.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch bloc
				e.printStackTrace();
			}

		}
	}

	public void deleteEmp(User u) {

	}

	public void updateEmp() {

	}

	public void queryEmp(String empNum) {
		String s = "Select EM_Lname, EM_Fname FROM Employee WHERE EmpNo ="
				+ "'" + empNum + "'";
	}
}
