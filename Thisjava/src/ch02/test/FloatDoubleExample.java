package ch02.test;

public class FloatDoubleExample {
	public static void main(String[] args) {
		
		float var1 = 0.1234567890123456789f;   
		double var2 = 0.1234567890123456789;   
		//double이 float보다 약 2배정도의 유효숫자를 가진다.
		System.out.println(var1);  //출력 0.12345679
		System.out.println(var2);  //출력 0.12345678901234568
		
		double var3 = 3e6;
		float var4 = 3e6F;
		double var5= 2e-3;
		
		System.out.println(var3); //출력 3000000.0
		System.out.println(var4); //출력 3000000.0
		System.out.println(var5); //출력 0.002

		
	}
}
