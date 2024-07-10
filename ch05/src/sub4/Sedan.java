package sub4;


//Car  - 부모클래스 sedan - 자식클래스
public class Sedan extends Car{
	
	//private String name;  => Car에 존재하므로 새로 적을 필요가 없다.
	//private String color;
	//private int speed;
	private int cc;
	public Sedan(String name, String color, int speed, int cc) {
		super(name,color,speed);    // 부모클래스 생성자 호출
		this.cc = cc;
	}
	
	public void show() {
		super.show();   
		System.out.println("배기량 : "+cc);	
	}
	
//	public void speedUP(int speed) {
//		this.speed+=speed;
//	}  => 해당 메소드도 이미 Car에 존재하므로 필요없음

}
