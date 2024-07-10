package sub5;

public class Truck extends Car{
	private int capacity;
	
	
	public Truck(String name,String color,int speed,int capacity) {
		super(name,color,speed);
		this.capacity=capacity;
	}
	
	@Override
	public void SpeedUp(int speed) {
		// Truck 맞게 speedUP메서드 재정의
		this.speed += speed/capacity;
		
	}
	

	public void show() {
		System.out.println("차량명  : "+name);
		System.out.println("차량색  : "+color);
		System.out.println("현재속도  : "+speed);
		System.out.println("적재용량 : "+ this.capacity+"톤");
	}
	
}
