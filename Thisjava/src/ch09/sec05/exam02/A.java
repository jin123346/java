package ch09.sec05.exam02;

public class A {
	String field = "A-field";
	
	void method() {
		System.out.println("A-method");
	}
	
	//A의 인스턴스 메소드
	void useB() {
			B b=new B();
			b.print();
		}
	
	class B {
		String field="B-field";
		
		void method() {
			System.out.println("B-method");
		}
		
		void print() {
			//B의 객체와 필드 메소드 사용
			System.out.println(this.field);
			this.method();
			
			//A의 객체와 필드 메소드 사용
			System.out.println(A.this.field);
			A.this.method();
		}
		
	}
	
	

}
