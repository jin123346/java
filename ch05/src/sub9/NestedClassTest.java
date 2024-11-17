package sub9;

import sub9.Outer.Inner;

/*
 * 날짜 : 2024/07/11
 * 이름 : 하진희
 * 내용 : 중첩 클래스 실습하기
 */

//외부 클래스
class Outer{
	
	private int x;
	
	public Outer(int x) {
		this.x=x;
	}
	
	public void show() {
		System.out.println("Outer x : "+x);
	}
	//내부 클래스
	class Inner{
		private int x;
		
		public Inner(int x) {
			this.x=x;
		}
		
		public void show() {
			System.out.println("Inner x : "+x);
		}
	}
}

interface Person{
	public void hello();
}



public class NestedClassTest {
	public static void main(String[] args) {
		// 외부객체 생성
		Outer x = new Outer(1);
		x.show();
		
		//내부객체 생성
		Inner y = x.new Inner(2);
		y.show();
		
		
		//익명객체 실습
	
		Person p= new Person() {
			@Override
			public void hello() {
				System.out.println("Person Hello...");
			}
		};
		
		p.hello();
		
		
		
		
		
		
		
		
	}
}
