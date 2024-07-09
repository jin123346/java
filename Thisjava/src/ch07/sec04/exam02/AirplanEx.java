package ch07.sec04.exam02;

public class AirplanEx {
	public static void main(String[] args) {
		SuperonicAirplane sa = new SuperonicAirplane();
		
		sa.takeOff();
		sa.fly();
		sa.flyMode=SuperonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode=SuperonicAirplane.NORMAL;
		sa.fly();
		sa.land();
	}
}
/*
		 이륙합니다.
		일반 비행합니다.
		초음속 비행합니다.
		일반 비행합니다.
		착륙합니다.
 */
 