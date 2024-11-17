package sub7;

public class Eagle extends Animal {
	
	public void fly() {
		System.out.println("Eagle is Fly...");
	}
	
	@Override
	public void move() {
		fly();
	}
	@Override
	public void hunt() {
		System.out.println("Eagle hunt...");
	}
}
