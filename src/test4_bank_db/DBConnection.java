package bank_db_ver;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	private static Connection conn = null;
	
	public  static Connection connection() throws Exception{ 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2) jdbc 연동
			conn = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/mbasic","root","1234");
			if(conn != null) {
				System.out.println("db연결성공!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}