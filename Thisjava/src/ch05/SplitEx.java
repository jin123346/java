package ch05;

import java.util.Arrays;

public class SplitEx {
	
	public static void main(String[] args) {
		String board="1,자바 학습,참조 타입 String을 학습합니다.,홍길동";
		
		//문자열 분리
		String[] tokens = board.split(",");
	
		System.out.println("번호 : "+tokens[0]);
		System.out.println("제목 : "+tokens[1]);
		System.out.println("내용 : "+tokens[2]);
		System.out.println("성명 : "+tokens[3]);
		
		for(String i : tokens) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		String alphabet = "123456789";
		
		String[] alphaArr = alphabet.split("");
		
		for(String i : alphaArr) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		
	}
}
