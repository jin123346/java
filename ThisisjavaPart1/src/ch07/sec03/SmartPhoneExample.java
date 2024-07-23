package ch07.sec03;

public class SmartPhoneExample {
	public static void main(String[] args) {
		//smartphone 객체 생성
		SmartPhone myphone = new SmartPhone("갤럭시", "은색");
		
		System.out.println("모델 : "+myphone.model);
		System.out.println("생성 : "+myphone.color);
	}

}
