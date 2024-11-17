package test3;

/*
 * 날짜 : 2024/07/11
 * 이름 : 하진희
 * 내용 : 싱글톤 객체와 인스턴스 객체 연습문제
 */
class Adder2{
	private static Adder2 instance = new Adder2();
	public static Adder2 getInstance() {
		return instance;
	}
	
	private Adder2() {};
	private Adder2(int value) {
		y+=value;
	}
	
	private static int x;
	private static int y;
	
	public void add(int x,int y) {
		Adder2.x+=x;
		y++;      //this.y=0  , 변수 y = 3 
	}
	
	public void add(int[] arr) {
		Adder2.x += arr[0];
		Adder2.y += arr[1];
	}
	public static void add(Adder2 a2) {
		Adder2.x +=10;
	}
	public static Adder2 add(Adder2 a3,int value) {
		return new Adder2(value);   // 새로운 객체 생성됨 
		
	}
	public void show() {
		System.out.println("x : "+Adder2.x);
		System.out.println("y : "+Adder2.y);
	}
	
}

public class Test66 {
	public static void main(String[] args) {
		Adder2 a1 = Adder2.getInstance();
		
		a1.add(1,2);         // x=1 , y=0
		a1.show(); 				//x:1 y:0
		
		int[] arr= {10,20};   //heap 10 20 
		a1.add(arr);		// x :11 y:20
		
		a1.show();			
		
		Adder2.add(a1);     //x : 21 y : 20
		a1.show();
		
		a1= Adder2.add(a1, 3);  // Adder(3) => x:21 y:23  
		a1.show();		// x:21 y:23  
		
		
	}

}
