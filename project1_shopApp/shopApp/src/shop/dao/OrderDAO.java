package shop.dao;

import java.util.ArrayList;
import java.util.List;

import shop.db.DBHelper;
import shop.db.SQL;
import shop.vo.OrderVO;
import shop.vo.ProductVO;

public class OrderDAO extends DBHelper {

	private static OrderDAO instance = new OrderDAO();
	public static OrderDAO getinstance() {
		return instance;
	}
	ProductDAO prodao = ProductDAO.getInstance();
	
	private OrderDAO() {}
	

	public int insertOrder(OrderVO vo,int prodNo ,int orderCount) {
		int result = 0;
		
		try {
			conn = getConnection();
			
			ProductVO product = prodao.selectProduct(prodNo);
			int stock=product.getStock();
			if(stock < orderCount) {
				System.out.println("재고 상품이 부족합니다. ");
				System.out.println("현재 주문 가능 수량 : "+product.getStock());
				return result;
			}
			
			if(product != null) {
				pstmt = conn.prepareStatement(SQL.INSERT_ORDER);
				pstmt.setString(1, vo.getOrderId());
				pstmt.setInt(2, vo.getOrderProduct());
				pstmt.setInt(3, vo.getOrderCount());
				
				result = pstmt.executeUpdate();
				product.setStock(stock-orderCount);
				prodao.updateProduct(product);

			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}

		return result;
	}

	public OrderVO selectOrder(String OrderNo) {
		OrderVO order = null;
		
		return order;
	}
	public List<OrderVO> selectOrders() {
		List<OrderVO> orders = new ArrayList<OrderVO>();
		try {
			conn= getConnection();
			stmt=conn.createStatement();
			
			rs = stmt.executeQuery(SQL.SELECT_ORDERS);
			
			while(rs.next()) {
				OrderVO order = new OrderVO();
				order.setOrderNo(rs.getInt(1));
				order.setOrderId(rs.getString(2));
				order.setOrderProduct(rs.getInt(3));
				order.setOrderCount(rs.getInt(4));
				order.setOrderDate(rs.getString(5));
				
				orders.add(order);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		return orders;
	}
	
	public List<OrderVO> selectOrders(String OrderId) {
		List<OrderVO> orders = new ArrayList<OrderVO>();
		try {
			conn= getConnection();
			pstmt = conn.prepareStatement(SQL.SELECT_ORDER_BY_ORDERID);
			
			pstmt.setString(1, OrderId);
			
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				OrderVO order = new OrderVO();
				order.setOrderNo(rs.getInt(1));
				order.setOrderProduct(rs.getInt(2));
				order.setProdName(rs.getString(3));
				order.setOrderCount(rs.getInt(4));
				order.setOrderer(rs.getString(5));
				order.setOrderDate(rs.getString(6));
				
				orders.add(order);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return orders;
	}
}
