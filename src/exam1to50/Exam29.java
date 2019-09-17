package exam1to50;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Exam29 {

	private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=aircondition.Test";
	private static final String USERNAME = "sa";
	private static final String PASSWORD = "LiYuliang19950216";

	static {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	static Connection newConnection = null;

	public static Connection getDBConnection() throws SQLException {

		try (Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
			newConnection = con;
		}
		return newConnection;
	}

	public static void main(String[] args) throws Exception {
		getDBConnection();
		Statement st = newConnection.createStatement();
		st.executeUpdate("INSERT INTO student VALUES (102, 'Kelvin')");
	}

}
