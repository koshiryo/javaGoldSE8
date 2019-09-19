package exam101to150;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Exam149 {

//	private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
//	private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=aircondition.Test";
//	private static final String USERNAME = "sa";
//	private static final String PASSWORD = "LiYuliang19950216";
	
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

	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		st.execute("SELECT * FROM student");
		ResultSet rs = st.getResultSet();
		rs.absolute(3);
		rs.moveToInsertRow();
		rs.updateInt(1, 113);
		rs.updateString(2, "Jannet");
		rs.updateString(3, "jannet@uni.com");
		rs.updateRow();
		rs.refreshRow();
		System.out.println(rs.getInt(1) + " : " + rs.getString(2) + " : " + rs.getString(3));
	}

}