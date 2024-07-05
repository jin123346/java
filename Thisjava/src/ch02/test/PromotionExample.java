package ch02.test;

public class PromotionExample {
	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue;
		
		System.out.println(intValue); //print 10
		
		char charValue = '가';
		intValue = charValue;
		
		System.out.println("가의 유니코드 : "+intValue); //print 44032
		
		intValue=50;
		long longValue = intValue;
		System.out.println(longValue); //print 50
		
		longValue=100;
		float floatValue=longValue;
		
		System.out.println(floatValue);  //print 100.0
		
		floatValue= 100.5F;
		double doubleValue = floatValue;
		
		System.out.println(doubleValue); //print 100.5
	}
	
}
