package ch07.sec10.exam01;

public abstract class Phone {
	//필드 선언
	String owner;
	
	//생성자 선언
	public Phone(String owner) {
		this.owner=owner;
	}
	
	void turnOn() {
		System.out.println("폰 전원을 끕니다.");
	}
	
	void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}
