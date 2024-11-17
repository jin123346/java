package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * #날짜 : 2024/07/
 * #백준 : 10988번 
 */
public class Main04 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input =br.readLine().trim().split("");
		String[] result = input.clone();
		int len = input.length;
	  
		
		for(int i = 0; i<len/2;i++) {
			String tmp = result[i];
			result[i]= result[len-i-1];
			result[len-i-1] = tmp;
			
		}
		int count=0;
		
		for(int i=0;i<len;i++) {
			if(result[i].equals(input[i])) {
				count++;
			}
		}
		if(count==len) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
		
	}
	

}
