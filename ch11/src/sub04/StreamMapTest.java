package sub04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
* 날짜 : 2024/07/23
* 이름 : 하진희
* 내용 : 자바 스트림 맵 실습하기
*/
class Person {
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
public class StreamMapTest {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<Person>();
		
		people.add(new Person("김유신",23));
		people.add(new Person("김춘추",21));
		people.add(new Person("장보고",33));
		people.add(new Person("강감찬",43));
		people.add(new Person("이순신",53));
		
		
		//map Stream
		
		List<String> names = people.stream()
				//새로운 데이터 변환해서 다음 스트림으로 전달
			  .map(t -> t.getName() )    //(person) -> {return person.getName();} 
			  .collect(Collectors.toList());   // 스트림으로 전송된 데이터 취합해 컬렉션으로 변환 
		
		System.out.println(names);
		
		
		//flatmap Stream
		//2차원 배열
		List<List<String>> lists = List.of(
										Arrays.asList("apple","banana"),
										Arrays.asList("cherry","grape"),
										Arrays.asList("orange","mango")
				);
		
		System.out.println(lists);
		
		//2차원에서 1차원으로 
		List<String> fruits = lists.stream()
			 .flatMap(list-> list.stream())    // lists의 list를 나열시킴 
			 .collect(Collectors.toList());
		
		System.out.println(fruits);
		
		
		
		
	}
}
