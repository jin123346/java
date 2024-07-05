package ch05;

public class IndexofContainEx {
	public static void main(String[] args) {
		String subject= "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location); //3  해당 문자열의 시작하는 지점을 표시
		
		String substring= subject.substring(location); 
		
		System.out.println(substring);//프로그래밍

		
		location = subject.indexOf("자바");
		if(location != -1) {
			System.out.println("자바와 관련된 책이군요.");
		}else {
			System.out.println("자바와 관련 없는 책이군요.");
		}
		//자바와 관련된 책이군요.

		
	}
}
