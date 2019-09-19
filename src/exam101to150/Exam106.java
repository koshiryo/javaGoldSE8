package exam101to150;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Exam106 {

	private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=Test";
	private static final String USERNAME = "sa";
	private static final String PASSWORD = "LiYuliang19950216";

	static {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		try {
			Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			String query = "SELECT * FROM Employee WHERE eid = 111";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			System.out.println("Employee ID:" + rs.getInt("eid"));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error");
		}
	}

}
