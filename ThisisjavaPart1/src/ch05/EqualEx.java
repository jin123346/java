package ch05;

public class EqualEx {
	public static void main(String[] args) {	
	
		String strVar1 = "홍길동";
		String strVar2 = "홍길동";
		
		if(strVar1 ==strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		}else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		} // strVar1과 strVar2는 참조가 같음

		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		}//strVar1과 strVar2는 참조가 같음

		
		
		String strVar3 = new String("홍길동");
		String strVar4 = new String("홍길동");
		
		if(strVar3 ==strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		}else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}//strVar3과 strVar4는 참조가 다름

		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		}//strVar3과 strVar4는 참조가 같음
		
		String hobby="";
		if(hobby.equals("")) {
			System.out.println("hobby 변수가 참조하는 String 객체는 빈 문자열");
		}// 출력 hobby 변수가 참조하는 String 객체는 빈 문자열

		
	}

}
