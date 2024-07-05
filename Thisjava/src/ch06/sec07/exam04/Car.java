package ch06.sec07.exam04;


//오버라이딩 
public class Car {

	String company="현대자동차";
	String model ;
	String color;
	int maxSpeed;
	
	Car() {
		// TODO Auto-generated constructor stub
	}
	Car(String model){
		this.model=model;
	}
	
	Car(String model,String color){
		this.model=model;
		this.color =color;
	}
	
	Car(String model,String color, int maxSpeed){
		this.model=model;
		this.color=color;
		this.maxSpeed =maxSpeed;
	}
	
}
