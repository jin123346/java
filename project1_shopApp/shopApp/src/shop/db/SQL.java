package shop.db;

public class SQL {

	//customer
	public static final String INSERT_CUSTOMER="INSERT INTO `customer` SET "
												+ "`custId`=?, "
												+ "`name`=?, "
												+ "`hp`=?, "
												+ "`addr`=?, "
												+ "`redate`=NOW()";
	public static final String SELECT_CUSTOMER="SELECT * FROM `customer` where `custId` = ?";
	public static final String SELECT_CUSTOMERS="SELECT * FROM `customer`";
	public static final String UPDATE_CUSTOMER="UPDATE `customer` set "
												+ "'name' = ? , "
												+ "'hp' = ? , "
												+ "'addr' = ? , "
												+ "where `custId`= ?";
	public static final String DELETE_CUSTOMER="delete from `customer` where `custId`= ? ";
	
	
	// product 
	
	public static final String INSERT_PRODUCT="insert into `product` set "
												+ "`prodNo`=? ,"
												+ "`prodName`=? ,"
												+ "`stock`=? ,"
												+ "`price`=? ,"
												+ "`company`=? ";
	public static final String UPDATE_PRODUCT="update `product` set "
											+ "`prodName`=? , "
											+ "`stock`=? , "
											+ "`price` = ? "
											+ "where  prodNo=?";
	
	public static final String DELETE_PRODUCT="";
	public static final String SELECT_PRODUCT="select * from `product` where `prodNo` = ?";
	public static final String SELECT_PRODUCTS="select * from `product`";
	
	
	//order 
	
	public static final String INSERT_ORDER ="INSERT INTO `order` set "
											 + "`orderId`=?, "
											 + "`orderProduct`=?, "
											 + "`orderCount`=?, "
											 + "`orderDate`=now()";
	
	public static final String UPDATE_ORDER ="update `order set "
											 + "`orderId`=?, "
											 + "`orderProduct`=?, "
											 + "`orderCount`=?, "
											 + "where `orderNo` =?";
	
	public static final String DELETE_ORDER ="delect from `order` where `orderId` =?";
	
	public static final String SELECT_ORDERS ="select * from `order`";
	public static final String SELECT_ORDER ="select * from `order` where `orderNo` = ? ";
	
	//join쿼리 확인후 작성하기 
	public static final String SELECT_ORDER_BY_ORDERID =" select "
												+ "	   o.orderNo,"
												+ "    p.prodNo,"
												+ "    p.prodName,"
												+ "    o.orderCount,"
												+ "    c.name,"
												+ "		o.orderDate "
												+ " from `order` as o "
												+ "join `product` as p on o.orderProduct = p.prodNo "
												+ "join `customer` as c on c.custId = o.orderId  "
												+ "where o.orderId= ?";
									}
