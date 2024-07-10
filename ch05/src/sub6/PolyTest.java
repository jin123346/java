package sub6;
/*
 * 날짜 : 2024/07/10
 * 이름 : 하진희
 * 내용 : 다형성 실습하기
 * 
 * 다형성=Polymorphism
 * - 상속관계에서 부모클래스의 기능을 자식클래스에서 다양한 기능으로 정의하는 특성
 * - 객체(참조변수)의 타입선언을 부모클래스 타입으로 선언하는 것
 */

public class PolyTest {
	public static void main(String[] args) {
		
		// 다형성이 적용된 객체 생성 (업캐스팅)
		Animal a1 = new Tiger();
		Animal a2 = new Eagle();
		Animal a3 = new Shark();
		
		a1.move();     
		a1.hunt();
		
		a2.move();
		a2.hunt();
	
		a3.move();
		a3.hunt();
		
		//다운캐스팅
		Tiger tiger = (Tiger)a1;
		Eagle eagle = (Eagle)a2;
		Shark shark = (Shark)a3;
		
		tiger.move();
		tiger.hunt();
		
		eagle.move();
		eagle.hunt();
		
		shark.move();
		shark.hunt();
		
		if(a1 instanceof Tiger) {
			System.out.println("a1은 Tiger입니다.");
		}//출력 : a1은 Tiger입니다.

		if(a2 instanceof Eagle) {
			System.out.println("a2은 Eagle입니다.");
		}//출력 : a2은 Eagle입니다.

		if(a3 instanceof Shark) {
			System.out.println("a3은 Shark입니다.");
		}//출력 : a3은 Shark입니다.
		
		System.out.println();
		Animal arr[] = new Animal[]{tiger,eagle,shark};
		
		for(Animal ani : arr) {
			ani.move();
			ani.hunt();
			System.out.println();
		}
		
	}
}
