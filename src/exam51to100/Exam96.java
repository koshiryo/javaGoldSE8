package exam51to100;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class Exam96 {

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
            Properties prop = new Properties();
            prop.put("user", USERNAME);
            prop.put("password", PASSWORD);
            Connection conn = DriverManager.getConnection(URL, prop);
            if (conn != null) {
                System.out.println("Connection Established");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
