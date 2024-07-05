package sub2;
/*
 * 날짜 : 2024/07/02
 * 이름 : 하진희
 * 내용 : Java 메서드 실습하기 
 */
public class MethodTest {
	//main 메서드 - 프로그램 시작점(진입점)
	public static void main(String[] args) {
		
		
		//메서드 호출 (call)
		int y1= f(1);  // y1 선언 -> 함수호출 -> 함수에 대입 ->결과값 y1대입 
		int y2= f(2);
		int y3= f(3);
		System.out.println("y1 : "+y1);
		System.out.println("y2 : "+y2);
		System.out.println("y3 : "+y3);
		//static method는 static 메서드만 호출할 수 있기때문에 다른 메서드를 호출하기 위해 static이 있어야함
		
		int result1=sum(4,8);
		System.out.println("4에서 8까지의 합 : "+result1);
		
		System.out.println(sum(1,10));
		
		int result2= sum(1,100);
		System.out.println("result2 : "+result2);
	}
	// public/private - 접근권한( 함수는 대부분 public이다)
	// 반환타입자리 -void => 반환타입이 없다 
	
	//메서드 정의(Define)
	public static int f(int x) { // 전달되든 인자값을 매개변수 x로 받아서 메서드 실행
		int y= 2*x + 3;
		return y; //메서드를 호출한 쪽으로 반환값 전달(리턴)
	}
	
	//메서드 정의
	public static int sum(int start,int end) {
		//지역변수 : 메서드 안에서 선언된 변수
		int total = 0;
		
		
		for(int i=start;i<=end; i++) {
			total += i;
		}
		
		return total;
	}
	
	
	
	
	
}
