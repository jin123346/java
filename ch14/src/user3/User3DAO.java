package user3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class User3DAO {
	private static User3DAO instance = new User3DAO();
	private void user3DO() {
	}

	public static User3DAO getInstance() {
		return instance;
	}
	
	//DB 정보
		private final static String HOST = "jdbc:mysql://127.0.0.1:3306/studydb";
		private final static String USER = "root";
		private final static String PASS = "1234";
	
	static Connection conn =null;
	PreparedStatement pstmt =null;
	
	
	public int insertUser(String uid) {
		String sql = null;
		int result=0;
		try {
			conn = DriverManager.getConnection(HOST, USER, PASS);
			pstmt.executeUpdate(sql);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		try {
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return result;
		
	}
	public int UpdateUser(User3VO vo) {
		String sql = null;
		int result=0;
		try {
			conn = DriverManager.getConnection(HOST, USER, PASS);
			pstmt.executeUpdate(sql);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		try {
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return result;
	}
	public int selectUser() {
		String sql = null;
		int result=0;
		try {
			conn = DriverManager.getConnection(HOST, USER, PASS);
			pstmt.executeUpdate(sql);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		try {
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return result;
	}
	public List<User3VO> selectUsers(String uid) {
		String sql = null;
	
		User3VO user = new User3VO();
		
		List<User3VO> users = new ArrayList<>();
		try {
			conn = DriverManager.getConnection(HOST, USER, PASS);
			pstmt.executeUpdate(sql);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		try {
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		return users;
	}
	public int deletetUser(String uid) {
		String sql = null;
		int result=0;
		try {
			conn = DriverManager.getConnection(HOST, USER, PASS);
			pstmt.executeUpdate(sql);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		try {
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return result;
	}
	
}
