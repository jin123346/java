package sub1;


//extends Object => 암묵적으로 모든 클래스들은 object클래스 상속받음
public class Apple  {
	
	private String country;
	private int price;
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}

	public void show() {
		System.out.println("country : "+ country);
		System.out.println("price : "+ price);
	}
	
	@Override
	public String toString() {
		// 클래스 속성정보를 출력
		return "country ="+country+", price ="+price;
	}
	

}
