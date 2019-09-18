package exam51to100;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Exam71 {

	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "LiYuliang19950216";

	static {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		try {
			Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			st.execute("SELECT * FROM Employee");
			ResultSet rs = st.getResultSet();
			while (rs.next()) {
				if (rs.getInt(1) == 112) {
					rs.updateString(2, "Jack");
				}
			}
			rs.absolute(2);
			System.out.println(rs.getInt(1) + " " + rs.getString(2));
		} catch (SQLException ex) {
			ex.printStackTrace();
			System.out.println("Exception is raised");
		}
	}

}
