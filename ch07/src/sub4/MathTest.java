package sub4;
/*
 * 날짜 : 2024/07/16
 * 이름 : 하진희	
 * 내용 : 자바 Math 클래스 실습하기
 */
public class MathTest {
	public static void main(String[] args) {
		// math는 정적메서드 제공 => 객체생성불가능
		//Math math= new Math();
		
		System.out.println("절대값 : "+Math.abs(-34));
		System.out.println("제곱근 : "+Math.sqrt(9));
		System.out.println("올림값 : "+Math.ceil(1.2));
		System.out.println("올림값 : "+Math.ceil(1.8));
		System.out.println("내림값 : "+Math.floor(1.8));
		System.out.println("내림값 : "+Math.floor(1.2));
		System.out.println("반올림 : "+Math.round(1.2));
		System.out.println("반올림 : "+Math.round(1.8));
		
		
	
		
		double num1= Math.random();
	
		System.out.println("랜덤값 : "+num1);// 0~1 사이의 실수 
		
		
		double num2= num1*10;
		System.out.println("랜덤값 : "+num2); // 0~10사이의 실수
		
		double num3 = Math.ceil(num2);
		
		System.out.println("num3 : "+num3);  // 1~10
		
		//1~46 사이 정수
	
		double num4 = Math.ceil(Math.random()*46);
		System.out.println(num4);
	}

}
