package sub1;


/*
 * 날짜 : 2024.06.28
 * 이름 : 하진희
 * 내용 : ch02. 변수와 연산자
 */
public class VariableTest {
	public static void main(String[] args) {
		
		//변수  [데이터타입] 변수명; => 변수 선언 
		int a = 1;  // 변수 선언과 초기화
		int b = 2;
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		
		int c = a+b;
		
		System.out.println("c : "+c);
		
		a=3;  //변수 재할당
		System.out.println("a : "+a );
		System.out.println("b : "+b);
		System.out.println("c : "+c);
		
		c = a+b;
		System.out.println("c : "+c);
		
		
		
		
		//상수
		int num = 10;
		num =7;
	
		System.out.println("num : "+num);
		
		final int NUM = 10; 	//상수는 새로운 값으로 할당안됨
		//num2 = 12;
		System.out.println("NUM : "+NUM);
		
		
		
		
		
	}
}
