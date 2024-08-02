package test10;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private int orderNo;
	private Customer customer;
	private List<Product> products;
	private int totalPrice;
	public Order(int orderNo, Customer customer) {
		this.orderNo = orderNo;
		this.customer = customer;
		products = new ArrayList<Product>();
	}
	public int getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public List<Product> getProducts() {
		
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	
	public void addProduct(Product product) {
		this.totalPrice += product.getPrice();
		products.add(product);
	}
	
	
	

}
