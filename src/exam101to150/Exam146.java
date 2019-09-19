package exam101to150;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class Exam146 {

	public static void main(String[] args) {
		String userName = "";
		String password = "";
		String dbURL = "";
		Connection con = null;
		try {
			Properties prop = new Properties();
			prop.put("user", userName);
			prop.put("password", password);
			con = DriverManager.getConnection(dbURL, prop);
			if (con != null) {
				System.out.println("Connection Established.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}