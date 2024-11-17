package sub4;

//클래스 정의
public class Car {
	//속성은 무조건 private 선언!! (90%이상)
	//상속인 경우에는 protected 로 선언해주어야 한다. => 자식이 접근,참조할 수 있도록 허용해줌
	protected String name;
	protected String color;
	protected int speed;
	
	
	//생성자(Constructor) : 캡슐화된 클래스 속성을 초기화하는 메서드

	public Car() {
		super();
	}

	public Car(String name, String color, int speed) {
		super();
		this.name = name;
		this.color = color;
		this.speed = speed;
	}


	//Getter, Setter 선언
	public void setColor(String color) {
		this.color = color;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getColor() {
		return color;
	}
	public String getName() {
		return name;
	}
	public int getSpeed() {
		return speed;
	}
	
	
	
	
	//기능 => 메소드
	public void SpeedUp(int speed) {
		this.speed += speed;
	}
	public void SpeedDown(int speed) {
		this.speed -= speed;
		if(this.speed <= 0 ) {
			this.speed = 0;
			System.out.println("자동차가 멈췄습니다.");
		}
		
	}
	
	public void show() {
		System.out.println("이름 : "+this.name);
		System.out.println("컬러 : "+this.color);
		System.out.println("현재 속도 = "+this.speed);
		
	}
	
	
	//Account 객체 생성
	
}
