package ch06.sec11exam01;

public class KoreanEx {
	public static void main(String[] args) {
		Korean k1 = new Korean("123456-1234567","김자바");
		
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		System.out.println(k1.name);
		
		// k1.nation="USA";  // 변경 불가능
		//k1.ssn="123456-7894561"; // 변경 불가능
		k1.name="자바김"; //변경가능
	}

}
