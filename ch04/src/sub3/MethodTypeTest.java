package sub3;
/*
 * 날짜 : 2024/07/02
 * 이름 : 하진희
 * 내용 : Java 메서드 타입 실습하기
 */

public class MethodTypeTest {
	public static void main(String[] args) {
		
		double result1= type1(2.8);
		System.out.println("result1 : "+ result1);
		
		boolean st = true;
		boolean fal = false;
		type2(st);
		type2(false);
		
		boolean re = type3();
		System.out.println(re);
		
		type4();
		
	}
	
	// 타입1 - 매개변수 O , 리턴값  O
	public static double type1(double x) {
		double y= (x*x) * Math.PI;
		
		return y;
	}
	
	// 타입2 - 매개변수 O , 리턴값  X
	public static void type2(boolean status) {
		if(status) {
			System.out.println("참 입니다.");
		}else {
			System.out.println("거짓 입니다.");
		}
	}
	
	// 타입3 - 매개변수 X , 리턴값  O
	public static boolean type3() {
		int num1 = 1;
		int num2 = 2;
		
		if(num1>num2) {
			 return true;
		}else {
			return false;
		}
	}
	
	// 타입4 - 매개변수 X , 리턴값  X
	public static void type4() {
		double result = type1(5.0);
		System.out.println("반지름 길이가 5인 원의 넓이 : "+ result);
	}
	
}
