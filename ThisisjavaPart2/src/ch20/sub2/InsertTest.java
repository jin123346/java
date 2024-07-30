package ch20.sub2;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertTest {
	public static void main(String[] args) {
		
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbcTest",
					"root",
					"1234");
			
			
			String sql = "Insert into boards "
					+ "values (SEQ,?,?,?,SYSDATE,?,binaryDate)";
			
			PreparedStatement psmt = conn.prepareStatement(sql);
			
	
			psmt.setString(1, "눈 오는 날");
			psmt.setString(2, "함박눈이 내려요");
			psmt.setString(3, "winter");
			psmt.setString(4, "snow.jpg");
			psmt.setString(5, "눈 오는 날");
			
			psmt.setBlob(5, InsertTest.class.getResourceAsStream("snow.jpg"));
			
			psmt.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
