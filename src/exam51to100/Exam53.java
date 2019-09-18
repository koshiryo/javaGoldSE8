package exam51to100;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Exam53 {

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

    public static void main(String[] args) throws Exception {
        Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        String query = "SELECT id FROM Employee";
        try (
            Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
            stmt.executeQuery("SELECT id FROM Customer");
            while (rs.next()) {
                //process the results
                System.out.println("Employee ID: " + rs.getInt("id"));
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }


}
