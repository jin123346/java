package sub01;

import java.util.ArrayList;
import java.util.List;

/*
 * 날짜 : 2024/07/17
 * 이름 : 하진희
 * 내용 : 제너릭 실습하기
 */
public class GenericTest {
	public static void main(String[] args) {
		
		Apple a = new Apple("한국", 3000);
		Banana b = new Banana("일본", 3000);
		
		// 제네릭 클래스 생성할때 치환변수 타입 선언
		FruitBox<Apple> box1 = new FruitBox<>();
		box1.setFruit(a);
		System.out.println(box1.getFruit());

		
		FruitBox<Banana> box2 = new FruitBox<>();
		box2.setFruit(b);
		System.out.println(box2.getFruit());
		
		

		
	}
}
