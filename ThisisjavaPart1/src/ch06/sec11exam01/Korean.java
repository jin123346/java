package ch06.sec11exam01;

public class Korean {
	final String nation="대한민국";
	final String ssn;
	
	String name;
	
	public Korean(String ssn,String name) {
		this.ssn = ssn;   // 초기값을 받으면 변경 불가능
		this.name=name;
	}

}
