package shop.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBHelper {
	
	//DB정보

	private final String HOST = "jdbc:mysql://127.0.0.1:3306/shoperd";
	private final String USER = "shop";
	private final String PASS= "1234";
	
	
	
	
	//DB 자원
	protected Connection conn = null;
	protected Statement stmt = null;
	protected PreparedStatement pstmt = null;
	protected ResultSet rs = null;
	
	
	//접속 커넥션
	
	protected Connection getConnection() throws SQLException {
		return DriverManager.getConnection(HOST,USER,PASS);
	}
	
	//DB 종료
	protected void closeAll() throws Exception {
		if(rs != null) {
			rs.close();
		}
		
		if(stmt != null) {
			stmt.close();
		}
		
		if(pstmt != null) {
			pstmt.close();
		}
		
		if(conn != null) {
			conn.close();
		}
		
		
	}
	
	

}
