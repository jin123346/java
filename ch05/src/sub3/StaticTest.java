package sub3;
/*
 * 날짜 : 2024/07/09
 * 이름 : 하진희
 * 내용 : 클래스 변수, 메서드 실습하기
 */

class Increment {
	private int num1;
	private static int num2;
	
	
	public Increment() {
		num1++;
		num2++;
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
	}
	
	
	

	
	
}


public class StaticTest {
	
	public static void main(String[] args) {
		//static 기본
		Increment inc1 = new Increment();
		Increment inc2 = new Increment();
		Increment inc3 = new Increment();
		
		//Car 실습
		Car sonata = new Car("소나타","흰색",0);
		Car avante = new Car("아반떼","검정",0);
		
		
		System.out.println("전체 차량 수 : "+Car.getTotalCount());
		
		//싱글톤 객체
		
		//원래는 Calc 클래스를 사용하기 위해 객체를 생성해야한다.
		//클래스 자체를 정적 메소드로 설정하게된다면 객체를 생성하지 않고 불러올 수 있다.
		
		//Calc c1 = new Cacl();  // 객체가 생성되지않음
		//싱글톤 객체 => 클래스명.getInstance();
		Calc c1 = Calc.getInstance();  //method area 에 있는 메모리를 참조함
		Calc c2 = Calc.getInstance();  //method area 에 있는 메모리를 참조함
		
		int r1= c1.plus(1, 2);
		int r2= c1.minsu(1, 2);
		int r3= c1.multi(3, 2);
		int r4= c1.div(4, 2);
		
		if(c1==c2) {
			System.out.println("동일 객체입니다.");
		}else {
			System.out.println("동일하지 않은 객체입니다.");
		}
		
		
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
		System.out.println("r4 : "+r4);
	}
}
