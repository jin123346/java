package test10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ShoppingMall {
	private List<Customer> customers;
	private List<Order> orders;
	private HashMap<String,List<Order>> customerOrders; 
	
	
	
	public ShoppingMall() {
		
		customers=new ArrayList<Customer>();
		orders =new ArrayList<Order>();
		customerOrders = new HashMap<String, List<Order>>();
	}
	public void addCustomer(Customer customer) {
		customers.add(customer);
	}
	public void addOrder(Order order) {
		orders.add(order);
	}
	public List<Order> getOrders(){
		
		return orders;
	}

}
