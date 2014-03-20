package databasePackage;

import java.sql.*;

import oracle.jdbc.pool.OracleDataSource;

public class CreateDBOperations {
	private Connection conn;
	private ResultSet rset;
	private PreparedStatement pstmt;

	public void openDB() {
		try {
			OracleDataSource ods = new OracleDataSource();

			// home Database
			ods.setURL("jdbc:oracle:thin:proje/proje@localhost:1521/xe");
			ods.setUser("adam");
			ods.setPassword("luke1712");

			// Tallaght Database
			// ods.setURL("jdbc:oracle:thin:@//10.10.2.7:1521/global1");
			// ods.setUser("X00098814");
			// ods.setPassword("db11Feb95");

			conn = ods.getConnection();
			System.out.println("Connection has been opened.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void buildEmployeeTable() {
		try {
			String s = "Create table Employee(EmployeeID VARCHAR(15) NOT NULL, Departmentid Varchar(20) Not Null,"
					+ "Teamid  Varchar(20) Not Null, Contractid Varchar(20) Not Null, Passwordid Varchar(20) Not Null, "
					+ "Em_Fname	Varchar(30), Em_Lname  Varchar(50), Em_Gender CHAR, Em_Nationality Varchar(50), Em_Contractlength Float,"
					+ "Em_Holidays	 Integer, Em_Sickdays	 INTEGER, Em_Leavedays	 Integer, Em_Address Varchar(100),"
					+ "Em_Isadmin	 Char, PRIMARY KEY (EmployeeID))";

			pstmt = conn.prepareStatement(s);

			// Create the table.
			pstmt.executeUpdate();

			String s2 = "INSERT INTO Employee VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(s2);

			// Row1
			pstmt.setString(1, "'E123456789'");
			pstmt.setString(2, "'D123456789'");
			pstmt.setString(3, "'T123456789'");
			pstmt.setString(4, "'C123456789'");
			pstmt.setString(5, "'P123456789'");
			pstmt.setString(6, " 'TestFNmae'");
			pstmt.setString(7, "'TestLName'");
			pstmt.setString(8, "M");
			pstmt.setString(9, "Ireland'");
			pstmt.setString(10, "0.0");
			pstmt.setString(11, "12");
			pstmt.setString(12, "12");
			pstmt.setString(13, "12");
			pstmt.setString(14, "'123 Fake st.'");
			pstmt.setString(15, "1");

			pstmt.executeUpdate();

			System.out.println("Employee TABLE WAS MADE");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Could not make table");
		}
	}

	public void buildtableDept() {
		try {
			String s = "CREATE TABLE Dep5(DepartmentID VARCHAR2(13) NOT NULL,"
					+ "Dep_Name VARCHAR2(50) NOT NULL,Primary Key (Departmentid))";
			pstmt = conn.prepareStatement(s);

			// Create the table.
			pstmt.executeUpdate();

			String s2 = "INSERT INTO Dep5 VALUES (?,?)";
			pstmt = conn.prepareStatement(s2);

			// Row1
			pstmt.setString(1, "D123456789");
			pstmt.setString(2, "TestDep");

			pstmt.executeUpdate();
			System.out.println("YAYAYAY IT WORKED");
		} catch (SQLException e) {
			System.out.println("Bollocks");
			e.printStackTrace();
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
			pstmt = conn.prepareStatement("DROP TABLE Employee");

			try {
				// Drop the Movie table.
				pstmt.execute();
				System.out.println("Movie table dropped.");
				pstmt = conn.prepareStatement("DROP TABLE Dep5");
				pstmt.execute();
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
			// rset.close();
			conn.close();
			System.out.print("Connection closed");
		} catch (SQLException e) {
			System.out.print("Could not close connection ");
			e.printStackTrace();
		}
	}

	public ResultSet queryDB()
	{
			String sqlStatement = "SELECT * FROM Dep5";
			try {
				pstmt = conn.prepareStatement(sqlStatement,
						ResultSet.TYPE_SCROLL_INSENSITIVE,
						ResultSet.CONCUR_READ_ONLY);
				rset = pstmt.executeQuery();
				while(rset.next())
				{
					System.out.printf("%20s %40s \n",
							rset.getString("DepartmentID"),
							 rset.getString("Dep_Name"));
					
				}
			} catch (Exception ex) {
				System.out.println("ERROR: " + ex.getMessage());
			}

			return rset;
		}
		
	}