package sub1;

//클래스 정의
public class Car {
	//속성(멤버 변수) => 변수 선언
	String name;
	String color;
	int speed;
	
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
