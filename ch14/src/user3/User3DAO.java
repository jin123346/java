package user3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
	
	
	public int insertUser(User3VO vo) {
		String sql = "INSERT INTO `USER3` SET UID = ?, NAME = ?, BIRTH =?, HP=?, ADDR =? ";
		int result=0;
		try {
			conn = DriverManager.getConnection(HOST, USER, PASS);
			pstmt= conn.prepareStatement(sql);
			pstmt.setString(1, vo.getUid());
			pstmt.setString(2, vo.getName());
			pstmt.setString(3, vo.getBirth());
			pstmt.setString(4, vo.getHp());
			pstmt.setString(5, vo.getAddr());
			
			result=pstmt.executeUpdate();
			
			pstmt.close();
			
			try {
				
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		return result;
		
		
	}
	public int UpdateUser(User3VO vo) {
		String sql = "update `user3` set  NAME = ?, BIRTH =?, HP=?, ADDR =? where  uid=?";
		int result=0;
		try {
			conn = DriverManager.getConnection(HOST, USER, PASS);
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, vo.getName());
			pstmt.setString(2,vo.getBirth());
			pstmt.setString(3, vo.getHp());
			pstmt.setString(4, vo.getAddr());
			pstmt.setString(5, vo.getUid());
			
			result = pstmt.executeUpdate();
			
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
	public User3VO selectUser(String uid) {
		String sql = "select * from `user3` where uid=?";
		User3VO user3= null;
		try {
			conn = DriverManager.getConnection(HOST, USER, PASS);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, uid);
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				user3 =new User3VO();
				
				user3.setUid(rs.getString(1));
				user3.setName(rs.getString(2));
				user3.setBirth(rs.getString(3));
				user3.setHp(rs.getString(4));
				user3.setAddr(rs.getString(5));
				
			}
			
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
		
		
		
		return user3;
	}
	public List<User3VO> selectUsers() {
		String sql = "select * from `user3`";
		User3VO user = null;
		
		List<User3VO> users = new ArrayList<>();
		try {
			conn = DriverManager.getConnection(HOST, USER, PASS);
			pstmt = conn.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				user = new User3VO();
				user.setUid(rs.getString(1));
				user.setName(rs.getString(2));
				user.setBirth(rs.getString(3));
				user.setHp(rs.getString(4));
				user.setAddr(rs.getString(5));
				users.add(user);
			}
			
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
		String sql = "delete from `user3` where uid = ?";
		int result=0;
		try {
			conn = DriverManager.getConnection(HOST, USER, PASS);
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, uid);
			
			result = pstmt.executeUpdate();
			
			
			
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
