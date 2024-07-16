package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * #날짜 : 2024/07/15
 * #백준 : 1157번 
 * 결과 수정
 */
public class Main0666 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine().trim().toUpperCase();
		
		int[] frequency = new int[26];
		int maxFrequency = 0;
		int maxIndex = -1;
		boolean isTie=false;
		
		//빈도계산  A로부터 얼마나 떨어진 것인지 A-A 0번빼 / B-A 1번째 
		for(int i=0;i<input.length();i++) {
			int index = input.charAt(i)-'A';
			frequency[index]++;
			
			if(frequency[index]>maxFrequency) {
				maxFrequency = frequency[index];
				maxIndex =index;
				isTie = false;
			}else if(frequency[index]==maxFrequency) {
				isTie = true;
			}
		}
		
		if(isTie) {
			System.out.println("?");
		}else {
			System.out.println((char)(maxIndex+'A'));
		}
		
		
	}
	

}
