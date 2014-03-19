package databasePackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.pool.OracleDataSource;

public class CreateDBOperations {
	private Connection conn;
	private ResultSet rset;
	private PreparedStatement pstmt;

	public void openDB() {

		try {
			OracleDataSource ods = new OracleDataSource();

			// Tallaght Database
			ods.setURL("jdbc:oracle:thin:proje/proje@localhost:1521/xe");
			ods.setUser("adam");
			ods.setPassword("luke1712");

			// Home Oracle XE
			// ods.setURL("jdbc:oracle:thin:HR/pmagee@localhost:1521:XE");
			// ods.setUser("test");
			// ods.setPassword("test");
			Connection conn = ods.getConnection();
			System.out.println("Connection has been opened.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void buildEmployeeTable() {
		try {
			String s = "CREATE TABLE " + "()";
			pstmt = conn.prepareStatement(s);

			// Create the table.
			pstmt.executeUpdate(s);

			String s2 = "INSERT INTO  VALUES (?,)";
			pstmt = conn.prepareStatement(s2);

			// Row1
			pstmt.setString(1, "placeholder");

			pstmt.executeUpdate();

		} catch (SQLException e) {

		}
	}

	public void buildtableDept() {
		try {
			String s = "CREATE TABLE " + "()";
			pstmt = conn.prepareStatement(s);

			// Create the table.
			pstmt.executeUpdate(s);

			String s2 = "INSERT INTO  VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(s2);

			// Row1
			pstmt.setString(1, "placeholder");

			pstmt.executeUpdate();

		} catch (SQLException e) {

		}
	}

	public void buildTableTeam() {
		try {
			String s = "CREATE TABLE " + "(?,?,?,?)";
			pstmt = conn.prepareStatement(s);

			// Create the table.
			pstmt.executeUpdate(s);

			String s2 = "INSERT INTO  VALUES (?,)";
			pstmt = conn.prepareStatement(s2);

			// Row1
			pstmt.setString(1, "placeholder");

			pstmt.executeUpdate();

		} catch (SQLException e) {

		}
	}
	public void buildTableLeaveHoliday() {
		try {
			String s = "CREATE TABLE " + "(?,?,?,?)";
			pstmt = conn.prepareStatement(s);

			// Create the table.
			pstmt.executeUpdate(s);

			String s2 = "INSERT INTO  VALUES (?,)";
			pstmt = conn.prepareStatement(s2);

			// Row1
			pstmt.setString(1, "placeholder");

			pstmt.executeUpdate();

		} catch (SQLException e) {

		}
	}
	public void buildTableGenericLeave() {
		try {
			String s = "CREATE TABLE " + "(?,?,?,?)";
			pstmt = conn.prepareStatement(s);

			// Create the table.
			pstmt.executeUpdate(s);

			String s2 = "INSERT INTO  VALUES (?,)";
			pstmt = conn.prepareStatement(s2);

			// Row1
			pstmt.setString(1, "placeholder");

			pstmt.executeUpdate();

		} catch (SQLException e) {

		}
	}
	
	public void buildTableContract() {
		try {
			String s = "CREATE TABLE " + "(?,?,?,?)";
			pstmt = conn.prepareStatement(s);

			// Create the table.
			pstmt.executeUpdate(s);

			String s2 = "INSERT INTO  VALUES (?,)";
			pstmt = conn.prepareStatement(s2);

			// Row1
			pstmt.setString(1, "placeholder");

			pstmt.executeUpdate();

		} catch (SQLException e) {

		}
	}
	
	public void dropTables() {
		System.out.println("Checking for existing tables.");

		try {
			// Get a Statement object.
			pstmt = conn.prepareStatement("DROP TABLE Movie");

			try {
				// Drop the Movie table.
				pstmt.execute();
				System.out.println("Movie table dropped.");
			} catch (SQLException ex) {
				// No need to report an error.
				// The table simply did not exist.
			}
		} catch (SQLException ex) {
			System.out.println("ERROR: " + ex.getMessage());
			ex.printStackTrace();
		}
	}

	public void CloseDB() {
		try {
			pstmt.close();
			rset.close();
			conn.close();
			System.out.print("Connection closed");
		} catch (SQLException e) {
			System.out.print("Could not close connection ");
			e.printStackTrace();
		}
	}
	
}