package shop.dao;

import java.util.ArrayList;
import java.util.List;

import shop.db.DBHelper;
import shop.db.SQL;
import shop.vo.CustomerVo;

public class CustomerDAO extends DBHelper {
	
	
	private static CustomerDAO instance = new CustomerDAO();
	public static CustomerDAO getInstnace() {
			return instance;
	}
	
	private CustomerDAO() {};
	
	
	
	
	//기본 crud 메서드
	public int insertCustomer(CustomerVo vo) {
		int result=0;
		
		try {
			conn=getConnection();
			pstmt= conn.prepareStatement(SQL.INSERT_CUSTOMER);
			pstmt.setString(1, vo.getCustId());
			pstmt.setString(2, vo.getName());
			pstmt.setString(3, vo.getHp());
			pstmt.setString(4, vo.getAddr());
			result = pstmt.executeUpdate();
			closeAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	
		return result;
	}
	public CustomerVo selectCustomer(String custId) {
		CustomerVo customer = null;
		try {
			conn= getConnection();
			pstmt=conn.prepareStatement(SQL.SELECT_CUSTOMER);
			pstmt.setString(1, custId);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				customer = new CustomerVo();
				customer.setCustId(rs.getString(1));
				customer.setName(rs.getString(2));
				customer.setHp(rs.getString(3));
				customer.setAddr(rs.getString(4));
				customer.setRedate(rs.getString(5));	
			
			}
			closeAll();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return customer;
	}
	public List<CustomerVo> selectCustomers() {
		List<CustomerVo> customers = new ArrayList<CustomerVo>();
		
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(SQL.SELECT_CUSTOMERS);
			
			while(rs.next()) {
				CustomerVo customer = new CustomerVo();
				customer.setCustId(rs.getString(1));
				customer.setName(rs.getString(2));
				customer.setHp(rs.getString(3));
				customer.setAddr(rs.getString(4));
				customer.setRedate(rs.getString(5));
				
				customers.add(customer); 
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return customers;
	}
	public int updateCustomer(String custId) {
		int result =0;
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		return result;
	}
	public int deleteCustomer(String custId) {
		int result =0;
		
		return result;
	}
	

}
