package ch07.sec07;

class A{
}
class B extends A{
}
class C extends A{
}
class D extends A{
}
class E extends A{
}


public class PromotionExample {
	public static void main(String[] args) {
		B b=new B();
		C c=new C();
		D d=new D();
		E e=new E();
		
		//자동 타입변환 (상속관계에 있음)
		A a1=b;
		A a2=c;
		A a3=d;
		A a4=e;
	
		//컴파일 에러 상속관계에 있지않음
		//B b3 = e;
		//C c2 = d;
	}
}
