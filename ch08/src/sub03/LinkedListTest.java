package sub03;

import java.util.LinkedList;

/*
 * 날짜 : 2024/07/17
 * 이름 : 하진희
 * 내용 : LinkedList 실습하기
 */
public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> cities = new LinkedList<>();

		cities.add("서울");
		cities.add("대전");
		cities.add("대구");
		cities.add("부산");
		cities.add("광주");
		 
		System.out.println(cities);
	
		cities.add(1,"수원");
		System.out.println(cities);
		
		//linkedlist에서만 사용가능
		cities.addFirst("인천");
		System.out.println(cities);
		
		cities.addLast("울산");
		System.out.println(cities);
		
	}
}
