package test02;

public class Product {
	private String productId;
	private String productName;
	private int price;
	private int quantity;
	public Product(String productId, String productName, int price, int quantity) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}

	public Product() {}



	public void updatePrice(int price) {
		this.price = price;
		System.out.println(productName+" 가격 수정 됨 ");
	}
	
	public void addStock(int addStock) {
		this.quantity += addStock;
		System.out.printf("%s 현재 재고 %d개 (재고 추가 됨)\n",productName,quantity);
		
	}
	
	public void printProductInfo() {
		System.out.println("상품 ID : "+productId);
		System.out.println("상품 이름 : "+productName);
		System.out.println("상품 가격 : "+price);
		System.out.println("재고 수량	: "+quantity);
	}
	
	

}
