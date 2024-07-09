package sub3;

public class Car {
	
	private String name;
	private String color;
	private int speed;
	
	//정적변수
	public static int count;

	public Car(String name, String color, int speed) {
		super();
		this.name = name;
		this.color = color;
		this.speed = speed;
		count++;
	}

	//클래스 메서드(정적메서드)
	//=> 정적 변수(필드)를 사용한 메서드 또한 정적이여야한다.
	public static int getTotalCount() {
		
		return count;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}


	
	
	

}
