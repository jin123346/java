package ch01.sec11;
/**
 * @author HaJinHee
 */

/*
 * 날짜 : 2024/06/28
 * 장제목 : 실행문과 세미콜론
 */

public class Calculator {
	public static void main(String[] args) {
		int x = 1; // 변수선언 
		int y = 2;
		int result = x+y;   //변수 선언하고 변수 x와 y를 더한 값을 저장
		System.out.println(result); // 변수 값 출력 콘솔에 출력하는 메소드 호출
		System.out.println(" x + y = "+ result);
	}
}
