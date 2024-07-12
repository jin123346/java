package test3;

/*
 * 날짜 : 2024/07/11
 * 이름 : 하진희
 * 내용 : 싱글톤 객체와 인스턴스 객체 연습문제
 */
class Adder{
	private static Adder instance = new Adder();
	public static Adder getInstance() {
		return instance;
	}
	
	private Adder() {};
	private Adder(int value) {
		y+=value;
	}
	
	private int x;
	private int y;
	
	public void add(int x,int y) {
		this.x+=x;
		y++;      //this.y=0  , 변수 y = 3 
	}
	
	public void add(int[] arr) {
		this.x += arr[0];
		this.y += arr[1];
	}
	public static void add(Adder a2) {
		a2.x +=10;
	}
	public static Adder add(Adder a3,int value) {
		return new Adder(value);   // 새로운 객체 생성됨 
		
	}
	public void show() {
		System.out.println("x : "+this.x);
		System.out.println("y : "+this.y);
	}
	
}

public class Test06 {
	public static void main(String[] args) {
		Adder a1 = Adder.getInstance();
		
		a1.add(1,2);         //method area에 x=1 , y=3
		a1.show(); 				//x:1 y:0
		
		int[] arr= {10,20};   //heap 10 20 
		a1.add(arr);		// x :11 y:20
		
		a1.show();			
		
		Adder.add(a1);     //x : 21 y : 20
		a1.show();
		
		a1= Adder.add(a1, 3);  // Adder(3) => 새 인스턴스니까 x:0 y:0인 상태에서 this.y+=3이됨 
		a1.show();		//x:0,y:3
		
		
	}

}
