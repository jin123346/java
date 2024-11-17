package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

/*
 * 날짜 : 2024/07/29
 * 이름 : 하진희
 * 내용 : PreparedInsert 테스트 실습
 */
public class PreparedDeleteTest2 {
	public static void main(String[] args) {
		String host = "jdbc:mysql://127.0.0.1:3306/studydb"; //<- 마지막 접속 데이터베이스명>
		String user = "root";
		String pass = "1234";
		
		try {
			
			//1단계 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host,user,pass);
			
			//2단계 SQL객체(preparedStatement)
			String sql = "DELETE FROM `user2` WHERE `uid`=?";
			PreparedStatement pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, "J101");
			//3단계 -SQL 실행

			pstm.executeUpdate();
			
			
			
			//4단계 - ResultSet 결과처리
			//5단계 - 데이터베이스 종료 
			pstm.close();
			conn.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	
		System.out.println("delete 성공!");
	}
	

}
