package sub8;

public class RemoteSamsung implements RemoteControl{

	@Override
	public void powerOn() {
		System.out.println("SamSung PowerOn");
	}

	@Override
	public void powerOff() {
		System.out.println("SamSung PowerOff");		
	}

	@Override
	public void soundUP() {
		System.out.println("SamSung soundOn");
	}

	@Override
	public void soundDown() {
		System.out.println("SamSung soundDown");
	}

	@Override
	public void chUp() {
		System.out.println("SamSung chUP");
	}

	@Override
	public void chDown() {
		System.out.println("SamSung chDown");		
	}

}
