package sub8;

//인터페이스 : 표준화된 클래스 설계에 사용되는 구초체
public interface RemoteControl {
	
	public abstract void powerOn();
	public abstract void powerOff();
	
	public abstract void soundUP();
	public abstract void soundDown();
	
	// 인터페이스 안의 메소드는 무조건 추상메서드이므로 abstract 생략가능
	public void chUp();   
	public void chDown();
	
	
}
