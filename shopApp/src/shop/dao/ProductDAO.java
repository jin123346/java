package shop.dao;

import java.util.ArrayList;
import java.util.List;

import shop.db.DBHelper;
import shop.db.SQL;
import shop.vo.ProductVO;

public class ProductDAO extends DBHelper {
	
	private static ProductDAO instance = new ProductDAO();
	public static ProductDAO getInstance() {
		return instance;
	}
	
	private ProductDAO() {}

	
	public ProductVO selectProduct(int prodNo) {
		ProductVO product = null;
		
		try {
			conn=getConnection();
			pstmt= conn.prepareStatement(SQL.SELECT_PRODUCT);
			pstmt.setInt(1, prodNo);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				product = new ProductVO();
				product.setProdNo(rs.getInt(1));
				product.setProdName(rs.getString(2));
				product.setStock(rs.getInt(3));
				product.setPrice(rs.getInt(4));
				product.setCompany(rs.getString(5));
				
			}
			
			if(product ==null) {
				System.out.println("해당하는 상품이 없습니다.");
			}
			
			
			closeAll();

		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		return product;
	}
	
	
	
	
	public List<ProductVO> selectProducts() {
		List<ProductVO> productlist = new ArrayList<ProductVO>();
		ProductVO product = null;
		
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			
			
			rs = stmt.executeQuery(SQL.SELECT_PRODUCTS);
			
			while(rs.next()) {
				product = new ProductVO();
				product.setProdNo(rs.getInt(1));
				product.setProdName(rs.getString(2));
				product.setStock(rs.getInt(3));
				product.setPrice(rs.getInt(4));
				product.setCompany(rs.getString(5));
				
				productlist.add(product);
				
			}
			
			closeAll();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		return productlist;
		
	}
	public int updateProduct(ProductVO vo) {
		int result =0;
		try {
			conn = getConnection();
			pstmt  = conn.prepareStatement(SQL.UPDATE_PRODUCT);
			
			pstmt.setString(1, vo.getProdName());
			pstmt.setInt(2, vo.getStock());
			pstmt.setInt(3, vo.getPrice());
			pstmt.setInt(4, vo.getProdNo());
			
			result = pstmt.executeUpdate();
			closeAll();
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	
	
}
