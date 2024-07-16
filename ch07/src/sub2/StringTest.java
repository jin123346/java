package sub2;
/*
 * 날짜 : 2024/07/16
 * 이름 : 하진희	
 * 내용 : 자바 String 클래스 실습하기
 */
public class StringTest {
	public static void main(String[] args) {
		//문자열(문자+배열) 생성
		String str1="Hello"; //리터럴 문자열
		String str2 = new String("Hello"); // 객체 생성도 가능
		
		System.out.println("str1 : "+str1);
		System.out.println("str2 : "+str2);

		//문자열 비교
		if(str1==str2) {
			System.out.println("str1과 str2는 주소값이 같다");
		}else {
			System.out.println("str1과 str2는 주소값이 다르다");
		}//출력 : str1과 str2는 주소값이 다르다
		
		if(str1.equals(str2)) {
			System.out.println("str1과 str2는 문자열이 같다");
		}else {
			System.out.println("str1과 str2는 문자열이 다르다");
		}//출력 : str1과 str2는 문자열이 같다
		
		
		int a = str1.indexOf("e");
		System.out.println(a);
		
		char c = str1.charAt(a);
		
		System.out.println(c);
		
		//문자열 길이 
		
		String message = "Hello,Korea";
		System.out.println("message 길이 : "+message.length());
		
		//문자열 추출
		char c1 = message.charAt(0);
		char c2 = message.charAt(6);
		System.out.println("1번째 문자 : "+c1);
		System.out.println("7번째 문자 : "+c2);
		
		//문자열 자르기 
		String sub1 = message.substring(0, 5);// 0번에서 5번까지
		String sub2 = message.substring(6);
		System.out.println("문자열 1번에서 6번까지(인덱스 0~5)"+sub1);
		System.out.println("문자열 7번에서 끝까지(인덱스6번에서 끝까지)"+sub2);
		
		
		//문자열 인덱스
		int e =message.indexOf("e");
		int le =message.lastIndexOf("e");
		System.out.println("e의 index번호 : "+e);   // 1번
		System.out.println("e의 last index번호 : "+le);   // 9번
		
		//split 문자열 분리
		String[] result = message.split(",");
		
		for(String str : result) {
			System.out.println("result  : "+str);
		}
		
		//문자열 교체
		String rs1 = message.replace("Korea", "Busan");
		String rs2 = message.replace("Hello", "Welcome");
	
		System.out.println("rs1 : "+rs1);
		System.out.println("rs2 : "+rs2);
		
		//문자열 변환
		int var1 = 1;
		double var2 = 3.14;
		boolean var3 = true;
		           //정적메서드, 클래스 메서드 
		String s1 = String.valueOf(var1);
		String s2 = String.valueOf(var2);
		String s3 = String.valueOf(var3);
		
		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);
		System.out.println("s3 : "+s3);
	}

}
