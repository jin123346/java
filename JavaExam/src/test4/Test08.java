package test4;
/*
 * 날짜 : 2024/07/19
 * 이름 : 하진희
 * 내용 : 객체 리스트 연습문제
 */

import java.util.ArrayList;

class Member{
	String id;
	String name;
	int age;
	public Member(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return id+","+name+","+age;
		}

	
	
	
}
public class Test08 {
	public static void main(String[] args) {
		
		Member m1= new Member("hong", "홍길동", 30);
		Member m2= new Member("lee", "이순신", 40);
		Member m3= new Member("kim", "김유신", 50);
		
		ArrayList<Member> memberList = new ArrayList<Member>();
		
		memberList.add(m1);
		memberList.add(m2);
		memberList.add(m3);
		
		for(Member m :memberList) {
			System.out.println(m);
		}
	}

}
