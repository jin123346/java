package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 날짜 : 2024/07/03
 * 문제번호 : 9498
 */
public class test02 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String input = bf.readLine();
		int score = Integer.parseInt(input);
		char grade;
		
		if(score > 100 && score <0) {
			return;
		}else{
			if(score >= 90 ) {
				grade='A';
			}else if(score>=80 && score<90) {
				grade='B';
			}else if(score>=70 && score<80) {
				grade = 'C';
			}else if(score>=60 && score<70) {
				grade = 'D';
			}else {
				grade = 'F';
			}
		}
		
		System.out.println(grade);
	}

}
