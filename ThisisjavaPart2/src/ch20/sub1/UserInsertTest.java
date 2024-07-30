package ch20.sub1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInsertTest {
	public static void main(String[] args) {
		
		
		Connection conn =null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbcTest",
						"root",
						"1234");
			
			
			
			String sql = "INSERT INTO `users` "
					+ "(`userid` , `username`,`userpassword`,`userage`,`useremail`) "
					+ " VALUES (?,?,?,?,?)";
			
			
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, "winter");
			psmt.setString(2, "한겨울");
			psmt.setString(3, "12345");
			psmt.setInt(4, 25);
			psmt.setString(5, "winter@nycompany.com");
			
			
			psmt.executeUpdate();
			
			System.out.println("Insert 성공!");
			
			psmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(conn != null) {
				
				
				try {
					conn.close();
					System.out.println("접속 끊기!");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
	}

}
