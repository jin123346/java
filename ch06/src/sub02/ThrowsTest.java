package sub02;

import java.util.Scanner;
/*
 * 날짜 : 2024/07/15
 * 이름 : 하진희
 * 내용 : 예외 던지기 실습하기
 */
public class ThrowsTest {
	// Exception으로 업캐스팅하여 포괄적으로 처리함 
	//main 을 호출하는 것은 jvm  => trows 한다면 jvm 단에서 예외처리 
	public static void main(String[] args)  {
		int num=1;
		try {
			//method1에서 예외가 발생하면 예외 처리
			method1(num);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println("프로그램 종료");

		
	}
	//method1에서 예외가 발생하면 method1를 호출하는 곳으로 예외 던지기
	public static void method1(int num) throws Exception {
		
			method2(num);

	}
	//method2에서 예외가 발생하면 method2를 호출하는 곳으로 예외 던지기
	public static void method2(int num) throws Exception {
		Scanner sc = new Scanner(System.in);  //inputMismatchException발생 
		System.out.println("num2 입력");  
		int num2 = sc.nextInt();
		int result = 0;
	    
		result = num/num2;    //ArithmeticException 발생
		
		System.out.println(result);
	
		sc.close();
		
	}

}
