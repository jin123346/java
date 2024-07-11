package sub8;

/*
 * 날짜 : 2024/07/11
 * 이름 : 하진희
 * 내용 : 인터페이스 실습하기
 */
class Computer {
	public void boot() {
		System.out.println("부팅...");
	}
}

interface Internet{
	public void access();
	
}
//복잡도가 올라가서 권장하지않음 
class Tv extends Computer implements Internet {
	public void show() {
		System.out.println("TV 시청...");
	}
	
	@Override
	public void access() {
		System.out.println("Internet Access! ");
	}
}



public class InterfaceTest {
	public static void main(String[] args) {
		// 인터페이스 실습 1 - 정형화된 클래스 설계
		//구현 
		RemoteControl lg = new RemoteLG();
		lg.powerOn();
		lg.chUp();
		lg.soundUP();
		lg.powerOff();
		
		
		RemoteControl samsung = new RemoteSamsung();
		samsung.powerOn();
		samsung.chDown();
		samsung.soundDown();
		samsung.powerOff();
		
		// 인터페이스 실습 2 - 다형성 예제
		
		Bulb bulb = new Bulb();
		Socket socket = new Cable(bulb);
		
		socket.switchOn();
		socket.switchOff();
		
		
		// 인터페이스 실습 3 - 다중 상속 효과 예제
		
		Tv tv = new Tv();
		tv.boot();
		tv.access();
		tv.show();
		
		
		//업캐스팅 불가능 
		Internet tv2=new Tv();
		tv2.access();
		//tv2.boot();
		
		
	}

}
