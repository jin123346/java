package user1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;


public class UserDAO {
	
	//싱글톤
	private static UserDAO instance = new UserDAO();
	public static UserDAO getinstance() {
		return instance;
	}
	
	private UserDAO() {};
	
	//DB 정보
	private final static String HOST = "jdbc:mysql://127.0.0.1:3306/studydb";
	private final static String USER = "root";
	private final static String PASS = "1234";
	
	Connection conn = null;
	PreparedStatement pstmt=null;
	
	//CRUD 메서드
	
	
	public void insertUser(User1VO vo) {
	
		String sql = "INSERT INTO `user1` values (?,?,?,?,?)";
		try {
			conn= DriverManager.getConnection(HOST, USER, PASS);
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, vo.getUid());
			pstmt.setString(2, vo.getName());
			pstmt.setString(3, vo.getBirth());
			pstmt.setString(4, vo.getHp());
			pstmt.setInt(5, vo.getAge());
		
			
			pstmt.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(conn!= null) {
				try {
					pstmt.close();
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}
	//특정 사용자 조회
	public User1VO selectUser(String uid) {
		
		String sql = "SELECT * FROM `user1` WHERE UID= ?";
		User1VO user= null;
		try {
			
			conn= DriverManager.getConnection(HOST, USER, PASS);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, uid);
		
			ResultSet rs = pstmt.executeQuery();
			
			//조회결과가 1또는 0이기 떄문에 if 문 사용
			if(rs.next()) {
				user= new User1VO();
				user.setUid(rs.getString(1));
				user.setName(rs.getString(2));
				user.setBirth(rs.getString(3));
				user.setHp(rs.getString(4));
				user.setAge(rs.getInt(5));
			}else {
				System.out.println("일치하는 id가 없습니다.");
			}
			rs.close();
			 
		} catch (Exception e) {
			
		}finally {
			if(conn!= null) {
				try {
					pstmt.close();
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return user;
		
	}
	//전체목록 조회
	public List<User1VO> selectUsers() {
		
		String sql = "SELECT * FROM `user1`";
		List<user1.User1VO> users = new ArrayList<User1VO>();
		try {
			conn= DriverManager.getConnection(HOST, USER, PASS);
			pstmt = conn.prepareStatement(sql);
		
			ResultSet rs = pstmt.executeQuery(sql);
			
			
			
			while(rs.next()) {
				User1VO vo = new User1VO();
				
				vo.setUid(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setBirth(rs.getString(3));
				vo.setHp(rs.getString(4));
				vo.setAge(rs.getInt(5));
				
				users.add(vo);
				
			}
			

			
			rs.close();
			
			
		} catch (Exception e) {
			
		}finally {
			if(conn!= null) {
				try {
					pstmt.close();
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return users;
	}
	public int updateUser(User1VO vo) {
		String sql = "UPDATE `user1` set "
				+ "`name` = ?, "
				+ "`birth` = ?, "
				+ "`hp` = ?, "
				+ "`age` = ? "
				+ "where `uid`= ? ";
		int result=0;
				
		try {
			conn= DriverManager.getConnection(HOST, USER, PASS);
			pstmt = conn.prepareStatement(sql);
			
			
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getBirth());
			pstmt.setString(3, vo.getHp());
			pstmt.setInt(4, vo.getAge());
			pstmt.setString(5, vo.getUid());
			//sql 이 적용되는 row 카운터 반환
			result = pstmt.executeUpdate();
			
			
			
		} catch (Exception e) {
			
		}finally {
			if(conn!= null) {
				try {
					pstmt.close();
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}
	public int deleteUser(String uid) {
		
		String sql = "DELETE FROM `user1` where `uid`= ? ";
		int result = 0;
		try {
			conn= DriverManager.getConnection(HOST, USER, PASS);
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, uid);
			
			result = pstmt.executeUpdate();
			
			
			
		} catch (Exception e) {
			
		}finally {
			if(conn!= null) {
				try {
					pstmt.close();
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}
	
	

}
