package sub2;


/*
 * 날짜 : 2024.06.28
 * 이름 : 하진희
 * 내용 : 변수 자료형 실습하기
 */
public class DataTypeTest {
	public static void main(String[] args) {
		//정수형
		byte  num1 = 127;  // 잘안씀
		short num2 = 32767; // 잘안씀 
		int   num3 = 214783647;  //대부분 int 
		long  num4 = 99999999999L;  //L => long임을 나타내줌 
		
		//num1 = 128;  에러 = 8비트 
		//num2 = 32768;
		//num3 = 21478364;
		
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
		System.out.println("num3 : "+num3);
		System.out.println("num4 : "+num4);
		
		//실수형
		float var1= 0.123456789f;
		double var2=0.123456789123456789;
		
		System.out.printf("var1 : %f \n",var1);
		System.out.printf("var2 : %2f \n",var2);  //float =>f /double=>2f
		System.out.println("var2 : "+var2);
		
		
		//논리형
		boolean data1= true;
		boolean data2 = false;
		
		System.out.println("data1 : "+ data1);
		System.out.println("data2 : "+ data2);
		
		
		//문자형  한 글자만 가능  %c
		
		char c1 = 'A';
		char c2 = '가';

		
		System.out.println("c1 : "+c1);
		System.out.println("c2 : "+c2);
		//문자열 (참조형)=> '객체'다.
		
		String str1= "Apple";
		String str2= "Banana";
		String str3 = "가";
		String str4 = "가을";
		
		System.out.println("str1 : "+str1);
		System.out.println("str2 : "+str2);
		System.out.println("str3 : "+str3);
		System.out.println("str4 : "+str4);
	
	}
}
