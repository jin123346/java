package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
/*
 * 날짜 : 2024/07/29
 * 이름 : 하진희
 * 내용 : Delete 테스트 실습
 */
public class DeleteTest {

	public static void main(String[] args) {
		//데이터베이스 정보 
		String host = "jdbc:mysql://127.0.0.1:3306/studydb"; //<- 마지막 접속 데이터베이스명>
		String user = "root";
		String pass = "1234";
		
		
		try {
			//1단계 
			Connection conn = DriverManager.getConnection(host,user,pass);

			//2단계
			Statement stmt = conn.createStatement();
			
			// 3단계
			String sql = "Delete  from `user1` where `uid` = 'J101' ";
			
			stmt.executeUpdate(sql);
			
			//5단꼐
			stmt.close();
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("delete 성공!");
		
		
	}
}
