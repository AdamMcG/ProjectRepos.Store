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
	private int i = 1;
	private int empcounter;
	
	public void addEmp(User u)
	{
			try {
				String m = "n";
				String a = "n";
				String queryString = "insert into Employee(EmployeeID, "
						+ "DepartmentID," + "Teamid," + "Contractid,"
						+ "Passwordid , " + "Em_Fname," + "Em_Lname,"
						+ "Em_Gender," + "Em_Nationality," + "Em_Contractlength,"
						+ "Em_Holidays," + "Em_Sickdays," + "Em_Leavedays, "
						+ "Em_Address," + "Em_Isadmin, "
						+ "Em_Manager) values(?, ?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
				pstmt = conn.prepareStatement(queryString);
				String contactLength = " " +(u.getContractLength());
				
				pstmt.setString(1, u.getEmployeeNumber());
				pstmt.setString(2, "D123456789");
				pstmt.setString(3, "T123456789");
				pstmt.setString(4, "C123456789");
				pstmt.setString(5, "P123456789");
				pstmt.setString(6, u.getName());
				pstmt.setString(7, u.getName());
				pstmt.setString(8, u.getGender());
				pstmt.setString(9, "Ireland");
				pstmt.setString(10, contactLength);
				pstmt.setString(11, "12");
				pstmt.setString(12, "12");
				pstmt.setString(13, "12");
				pstmt.setString(14, "123 Fake st.");
				pstmt.setString(15, m);
				pstmt.setString(16, a);

				pstmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
				System.exit(1);
			}
		}
	


		public void addPass(String pass) {
			String s2 = "INSERT INTO Password VALUES (?,?,?,?)";
			try {
				pstmt = conn.prepareStatement(s2);
			} catch (SQLException e) {

				e.printStackTrace();
			}
			// 'P123456789', 'Admin', 'SecretQ', 'SecretA'
			// Row1
			try {
				String number = "P" + i;
				pstmt.setString(1, number);
				pstmt.setString(2, pass);
				pstmt.setString(3, "SecretQ");
				pstmt.setString(4, "SecretA");
				pstmt.executeUpdate();
			} catch (SQLException e) {

				e.printStackTrace();
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
