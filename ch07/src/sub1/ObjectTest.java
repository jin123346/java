package sub1;
/*
 * 날짜 : 2024/07/15
 * 이름 : 하진희	
 * 내용 : 자바object 클래스 실습하기
 */
public class ObjectTest {
	public static void main(String[] args) {
		
		Apple apple1 = new Apple("한국", 3000);
		Apple apple2 = new Apple("일본", 2000);
		Apple apple3 =  new Apple("일본", 2000);
		
		//객체 정보 조회 - toString()
		System.out.println(apple1); //toString()호출
		// 객체만 호출했을 경우 자동으로 toString메소드로호출됨
		System.out.println(apple1.toString());
		
		//객체 비교 - equals()
		
		//객체의 주소값을 비교하게됨!! 
		if(apple1 != apple2) {
			System.out.println("apple1, apple2가 다르다.");
		}else {
			System.out.println("apple1, apple2가 같다.");
		} 
		
		if(apple1.equals(apple2)) {
			System.out.println("객체가 같다.");
		}else {
			System.out.println("객체가 다르다.");
		}
		

		//객체가 같은경우 true
		Apple a1 = apple1;
		System.out.println(apple1.equals(a1));
		
		
	
		//객체 주소값 확인
		System.out.println(apple1.hashCode());
		System.out.println(apple2.hashCode());
		System.out.println(apple3.hashCode());
		
		
	}

}
