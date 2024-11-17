package user4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class User4DAO {
	private static User4DAO instance = new User4DAO();
	public static User4DAO getInstance() {return instance;}
	
	private User4DAO() {}
	
	//DB 정보
			private final static String HOST = "jdbc:mysql://127.0.0.1:3306/studydb";
			private final static String USER = "root";
			private final static String PASS = "1234";
			
			private final String INSERT = "INSERT INTO `USER4` SET "
										  + "`UID`=?, "
										  + "`NAME`=?, "
										  + "`GENDER`=?, "
										  + "`AGE`=?, "
										  + "`HP`=?, "
										  + "`ADDR`=? ";
			private final String UPDATE = "UPDATE `USER4` SET "
										  + "`NAME`=?, "
										  + "`GENDER`=?, "
										  + "`AGE`=?, "
										  + "`HP`=?, "
										  + "`ADDR`=? "
										  + "WHERE UID=?";
			private final String DELETE = "DELETE FROM `USER4` WHERE `UID`=? ";
			private final String SELECT = "SELECT * FROM `USER4` WHERE `UID`=?";
			private final String SELECT_USERS = "SELECT * FROM `USER4`";
	
			
			Connection conn =null;
			PreparedStatement pstmt =null;
			Statement stmt = null;
	public int insertUser4(User4VO vo) { 
		int result=0;
		
		try {
			conn = DriverManager.getConnection(HOST,USER,PASS);
			pstmt = conn.prepareStatement(INSERT);
			
			pstmt.setString(1,vo.getUid());
			pstmt.setString(2,vo.getName());
			pstmt.setString(3,vo.getGender());
			pstmt.setInt(4,vo.getAge());
			pstmt.setString(5,vo.getHp());
			pstmt.setString(6,vo.getAddr());
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return result;}
	public int updateUser4(User4VO vo) { 
		
		int result=0;
		
		try {
			conn = DriverManager.getConnection(HOST,USER,PASS);
			pstmt = conn.prepareStatement(UPDATE);
			
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getGender());
			pstmt.setInt(3, vo.getAge());
			pstmt.setString(4, vo.getHp());
			pstmt.setString(5, vo.getAddr());
			pstmt.setString(6, vo.getUid());
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return result;}
	public int deleteUser4() { return 0;}
	public int selectUser4() { return 0;}
	public int selectUser4s() { return 0;}

}
