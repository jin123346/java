package user2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class User2DAO {
	private static User2DAO instance = new User2DAO();
	public static User2DAO getinstance() { return instance;};
	
	private User2DAO() {};
	
	
	//DB 정보
	private final static String HOST = "jdbc:mysql://127.0.0.1:3306/studydb";
	private final static String USER = "root";
	private final static String PASS = "1234";
	
	Connection conn= null;
	PreparedStatement pstmt = null;
	
	public int insertUSer(User2VO vo) {
	
		String sql = "INSERT INTO `user2` set "
				+ "`uid` = ?,"
				+ "`name` = ?, "
				+ "`birth` = ?, "
				+ "`addr` = ?";
		int result = 0;
		try {
			conn = DriverManager.getConnection(HOST, USER, PASS);
			
			if(searchUser(vo.getUid())) {
				System.out.println("User with ID " + vo.getUid() + " already exists.");
				return result;
			
			}else {
				
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1,vo.getUid());
				pstmt.setString(2,vo.getName());
				pstmt.setString(3,vo.getBirth());
				pstmt.setString(4,vo.getAddr());
				result = pstmt.executeUpdate();
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(conn!=null || pstmt!=null) {
				try {
					pstmt.close();
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return result;
		
		
	}
	public User2VO selectUSer(String uid) {
		
		User2VO user = null;
		String sql = "Select * from `user2` where `uid`= ?";
		try {
			conn= DriverManager.getConnection(HOST, USER, PASS);
			pstmt= conn.prepareStatement(sql);
			
			pstmt.setString(1, uid);
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				user= new User2VO();
				user.setUid(rs.getString(1));
				user.setName(rs.getString(2));
				user.setBirth(rs.getString(3));
				user.setAddr(rs.getString(4));
			}else {
				System.out.println("일치하는 아이디가 없습니다.");
			}
			
			rs.close();
		
				} catch (Exception e) {
					e.printStackTrace();
				}finally {
					if(conn!=null || pstmt!=null) {
						try {
							pstmt.close();
							conn.close();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
	
		return user;
	}
	public List<User2VO> selectUSers() {
		
		List<User2VO> users = new ArrayList<User2VO>();
		User2VO user = null;
		String sql = "Select * from `user2`";
		
		try {
			conn= DriverManager.getConnection(HOST, USER, PASS);
			pstmt = conn.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				user = new User2VO();
				user.setUid(rs.getString(1));
				user.setName(rs.getString(2));
				user.setBirth(rs.getString(3));
				user.setAddr(rs.getString(4));
			
				users.add(user);
			}
			
			
			rs.close();
			
			
			
				} catch (Exception e) {
					e.printStackTrace();
				}finally {
					if(conn!=null || pstmt!=null) {
						try {
							pstmt.close();
							conn.close();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
		return users;
			}
	public int updateUSer(User2VO vo) {
		String sql = "Update `user2` set "
				+ "`name` = ? ,"
				+ "`birth` = ? ,"
				+ "`addr` = ?"
				+ "where `uid` = ?";
		
		int result =0;
		try {
			conn= DriverManager.getConnection(HOST, USER, PASS);
			PreparedStatement pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getBirth());
			pstmt.setString(3, vo.getAddr());
			pstmt.setString(4, vo.getUid());
			
			
			result = pstmt.executeUpdate();
			
			
				} catch (Exception e) {
					e.printStackTrace();
				}finally {
					if(conn!=null || pstmt!=null) {
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
	public int deleteUSer(String uid) {
		
		String sql = "Delete from `user2` where uid= ?";
		int result = 0;
	try {
		conn= DriverManager.getConnection(HOST, USER, PASS);
		pstmt = conn.prepareStatement(sql);
		
		pstmt.setString(1,uid);
		
		result = pstmt.executeUpdate();
		
		
	
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				if(conn!=null || pstmt!=null) {
					try {
						pstmt.close();
						conn.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
	return result;
	}
	
	
public boolean searchUser(String uid) {
		
		User2VO user = null;
		String sql = "Select * from `user2` where `uid`= ?";
		boolean result= false;
		try {
			conn= DriverManager.getConnection(HOST, USER, PASS);
			pstmt= conn.prepareStatement(sql);
			
			pstmt.setString(1, uid);
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				user= new User2VO();
				user.setUid(rs.getString(1));
				user.setName(rs.getString(2));
				user.setBirth(rs.getString(3));
				user.setAddr(rs.getString(4));
				result = true;
			}
			
			rs.close();
		
				} catch (Exception e) {
					e.printStackTrace();
				}
		return result;
	}
}
