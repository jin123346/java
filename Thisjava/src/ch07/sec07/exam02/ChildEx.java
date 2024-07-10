package ch07.sec07.exam02;

public class ChildEx {

	public static void main(String[] args) {
		Child child = new Child();
		
		child.method1();
		child.method2();
		child.method3();
		
		Parent parent = child;
		
		parent.method1();
		parent.method2();
		//parent.method3();  =>  호출 불가능
		
		Parent pa = new Child();
		
		Child ch = (Child)pa;
		
		ch.method2();	   //출력 Child method2()
		ch.method3();    //출력 Child method3()
		
		Child pach = (Child) parent;
		
		pach.method3();    //출력 Child method3()
		pach.method2();	   //출력 Child method2()
	}
}
