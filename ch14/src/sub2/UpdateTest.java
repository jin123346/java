package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
/*
 * 날짜 : 2024/07/29
 * 이름 : 하진희
 * 내용 : Update 테스트 실습
 */
public class UpdateTest {

	public static void main(String[] args) {
		
		//데이터베이스 정보 
				String host = "jdbc:mysql://127.0.0.1:3306/studydb"; //<- 마지막 접속 데이터베이스명>
				String user = "root";
				String pass = "1234";
				
		try {
			
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			Statement stmt = conn.createStatement();
			
			String sql = "Update `user1` set";
			sql		  += " `hp`='010-1234-1111',";
			sql		  += "`age`=25 ";
			sql		  += "where `uid`='J101';";
				
			stmt.execute(sql);
			
			
			stmt.close();
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		System.out.println("update 성공!");
		
	}
}
