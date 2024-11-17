package sub2;
/*
 * 날짜 : 2024/07/16
 * 이름 : 하진희	
 * 내용 : 자바 StringBuilder 클래스 실습하기
 */
public class StringBuilderTest {
	public static void main(String[] args) {
		
		//String은 불변(immutable) 문자열
		String str="Java";
		System.out.println("str주소 : "+System.identityHashCode(str));
		
		str +=" Programming";
		//문자열을 추가시 주소가 바뀜 => 새로운 객체가 생성됨 
		System.out.println("str주소 : "+System.identityHashCode(str));
	
		System.out.println("str : "+str);

		StringBuilder sb = new StringBuilder("Java");
		
		System.out.println(System.identityHashCode(sb));

		sb.append(" Programming");
		System.out.println(System.identityHashCode(sb));
		//주소 동일
		
		sb.insert(4, ",");
		System.out.println(sb);
	}

}
