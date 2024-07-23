package ch08.sec04;

public interface RemoteControl {
	//상수선언
	int MAX_VOLUME=10;
	int MIN_VOLUME=0;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);

}
