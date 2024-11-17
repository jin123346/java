package ch20.sub1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connectionex {

	public static void main(String[] args) {
		Connection conn =null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//연결하기
			conn=DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/studydb","root","1234");
			
			System.out.println("연결 성공!");
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			if(conn !=null) {
				try {
					conn.close();
					System.out.println("연결끊기");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
	}
}
