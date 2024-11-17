package sub03;

import java.util.Scanner;

/*
 * 날짜 : 2024/07/15
 * 이름 : 하진희
 * 내용 : 예외발생 시키기
 */

class Score{
	public void check(int score) throws Exception  { //예외발생시 throws 처리 해줘야함
		if(score<0) {
			//예외 발생 시킴
			throw new Exception("점수는 음수가 될 수 없습니다.");
		}else if(score > 100) {
	
			throw new Exception("점수는 100점을 초과할 수 없습니다.");
		}else {
			System.out.println("점수가 정상입니다.");
		}
	}
}
public class ThrowTest {
	public static void main(String[] args) {
		
		Score score = new Score();
		
		//예외 처리 해줘야함. 예외처리시 순서대로 제일 위에 있는 예외의 경우만 catch됨
		try {
			score.check(150);
			score.check(60);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		try {
			score.check(-90);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		System.out.println("프로그램 종료 ");
		
		
	}
}
