package ch07.sec10.exam02;

public sealed class Person permits Employee,Manager {
	public String name;
	
	public void work() {
		System.out.println("하는 일이 결정되지 않습니다.");
	}
}
