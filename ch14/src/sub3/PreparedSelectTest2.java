package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/*
 * 날짜 : 2024/07/29
 * 이름 : 하진희
 * 내용 : PreparedInsert 테스트 실습
 */
public class PreparedSelectTest2 {
	public static void main(String[] args) {
		String host = "jdbc:mysql://127.0.0.1:3306/studydb"; //<- 마지막 접속 데이터베이스명>
		String user = "root";
		String pass = "1234";
		
		List<User2Vo> user2s = new ArrayList<User2Vo>();
		
		try {
			
			//1단계 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host,user,pass);
			//2단계 SQL객체(preparedStatement)
			
			String sql= "SELECT * FROM `user2`";
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			ResultSet rs  = psmt.executeQuery();
			
			while(rs.next()) {
				User2Vo vo = new User2Vo();
				vo.setUid(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setBirth(rs.getString(3));
				vo.setAddr(rs.getString(4));
				
				user2s.add(vo);
			}
			
			//3단계 -SQL 실행
			
			//4단계 - ResultSet 결과처리
			//5단계 - 데이터베이스 종료 
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		for(User2Vo vo : user2s) {
			System.out.println(vo);
		}
		
		
	}

}