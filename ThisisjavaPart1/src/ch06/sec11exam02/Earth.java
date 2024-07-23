package ch06.sec11exam02;

public class Earth {
	//상수 선언 및 초기화
	static final double EARTH_RADIUS=6400;
	//상수 선언
	static final double EARTH_SURFACE_AREA;
	//정적블록에서 상수 초기화
	static {
		EARTH_SURFACE_AREA=4*Math.PI*EARTH_RADIUS*EARTH_RADIUS;
	}
	public static void main(String[] args) {
		System.out.println("지구 반지름 : "+Earth.EARTH_RADIUS);
		System.out.println("지구 표면적 : "+Earth.EARTH_SURFACE_AREA);
	}

}
