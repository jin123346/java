package sub3;

public class Calc {
	
	//싱글톤 객체 => 클래스 안에서 자기자신의 객체를 선언해준다.
	//private static Calc instance = new Calc();
	
	private static Calc stance =new Calc();
 	public static Calc getInstance() {
		return stance;
	}
	//외부에서 생성되지않도록 하기위해 생성자를 'private' 처리해준다. 
	private Calc() {}
	
	public  int plus(int x,int y) {
		return x+y;
	}
	
	public  int minsu(int x, int y) {
		return x-y;
	}

	public  int multi(int x, int y) {
		return x*y;
	}
	public  int div(int x, int y) {
		return x/y;
	}
	
}
