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
public class PreparedInsertTest {
	public static void main(String[] args) {
		String host = "jdbc:mysql://127.0.0.1:3306/studydb"; //<- 마지막 접속 데이터베이스명>
		String user = "root";
		String pass = "1234";
		
		try {
			
			//1단계 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host,user,pass);
			
			//2단계 SQL객체(preparedStatement)
				//준비된 쿼리문(쿼리 파라미터?가 사용된 임시쿼리문)
			String sql = "INSERT INTO `user2` VALUES (?,?,?,?)";
				
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			//?에 매핑이 필요함(사상)
			psmt.setString(1, "J102");
			psmt.setString(2, "강감찬");
			psmt.setString(3, "1990-08-09");
			psmt.setString(4,"부산광역시");
			
			
	
			//3단계 -SQL 실행
			psmt.executeUpdate();
			//4단계 - ResultSet 결과처리
			//5단계 - 데이터베이스 종료 
			
			psmt.close();
			conn.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("Insert 완료!");
		
	}

}
