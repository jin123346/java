package test01;

/*
 * 날짜 : 2024/08/01
 * 이름 : 하진희
 * 내용 : 자바 총정리 문제
 */
public class Main {

	public static void main(String[] args) {
		//학생 성적 객체 생성
		StudentScore student = new StudentScore("홍길동","S001","자바",90.0);
		
		//학생 정복 출력
		student.printStudentInfo();
		System.out.println("------------------------------------");
		
		//정보수정
		student.updateScore(98.0);
		System.out.println("------------------------------------");
		
		student.updateScore(102.0);
		System.out.println("------------------------------------");
		
		student.printStudentInfo();
		System.out.println("------------------------------------");
	}
}
