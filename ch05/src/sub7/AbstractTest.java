package sub7;
/*
 * 날짜 : 2024/07/10
 * 이름 : 하진희
 * 내용 : 추상 클래스 실습하기
 */


public class AbstractTest {
	public static void main(String[] args) {
		// 추상 클래스는 객체생성불가능	
		//Animal animal = new Animal(); 
		//업캐스팅은 가능함 
		Animal tiger = new Tiger();
		Animal eagle = new Eagle();
		Animal shark=  new Shark();
		
		
		tiger.move();
		tiger.hunt();
		
		eagle.move();
		eagle.hunt();
		
		shark.move();
		shark.hunt();
	}
}
