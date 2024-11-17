package sub03;
/*
 * 날짜 : 2024/07/17
 * 이름 : 하진희
 * 내용 : ArrayList 실습하기
 */

import java.util.ArrayList;
import java.util.List;

import sub01.Apple;

public class ArrayListTest {

	public static void main(String[] args) {
		
		//ArrayList 생성
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//데이터 저장
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println(list);
		
		//데이터 삽입=> 지정한 인덱스에 삽입
		list.add(1,6);
		System.out.println(list);
		
		//데이터 제거
		list.remove(2);  //=>인덱스2번 자리의 값을 제거 
		System.out.println(list);
		
		list.remove(3);  //=>인덱스3번 자리의 값을 제거 
		System.out.println(list);
		
		//데이터 출력
		System.out.println("list 0번째 원소 : "+list.get(0));
		System.out.println("list 1번째 원소 : "+list.get(1));
		System.out.println("list 3번째 원소 : "+list.get(3));
		
		//리스트 크리
		int len=list.size();
		System.out.println("list 크기 : "+list.size());
		
		//리스트 반복문  => auto 언박싱 Integer -> int 
		for(int num : list) {
			System.out.print(num+" ");
		}
		
		System.out.println();
		
		//
		
		List<String> people = new ArrayList<String>();
		
		people.add("김유신");
		people.add("김춘추");
		people.add("장보고");
		people.add("강감찬");
		people.add("이순신");

		System.out.println(people);

		//마지막에 정약용 추가
		people.add("정약용");
		
		//강감찬 - 이순신 사이에 이성계 추가
		people.add(4,"이성계");
		System.out.println(people);
		//김유신 - 김춘추사이에 선덕여왕 추가
		people.add(people.indexOf("김춘추"),"선덕여왕");
		System.out.println(people);
		//장보고 제거 장보고 자리에 왕건 삽입
		System.out.println(people.indexOf("장보고"));
		people.add(people.indexOf("장보고"),"왕건");
		people.remove(people.indexOf("장보고"));
		System.out.println(people);
		
		//이성계를 정도전으로 교체  => set 
		people.set(people.indexOf("이성계"), "정도전");
		System.out.println(people);
		
		//객체 리스트
		List<Apple> apples = new ArrayList<Apple>();
		
		Apple a1=new Apple("한국",3000);
		Apple a2=new Apple("미국",2000);
		
		
		apples.add(a1);
		apples.add(a2);
		//추가시 바로 객체 생성가능
		apples.add(new Apple("일본", 1000));
		
		//한국사과 출력
		Apple appleKorea = apples.get(0);
		System.out.println(appleKorea);
		
		//일본사과 출력
		Apple appleJapan = apples.get(2);
		System.out.println(appleJapan);
		
		
	}
}
