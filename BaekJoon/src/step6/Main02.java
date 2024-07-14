package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * #날짜 : 2024/07/
 * #백준 : 3003번 킹,퀸,룩,비숍,나이트,폰 
 */
public class Main02 {
	public static void main(String[] args) throws IOException {
		//체스 기본 1,1,2,2,2,8
		
		
		 int[] chess = {1,1,2,2,2,8};
		 int[]	result = {0,0,0,0,0,0};
		 
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 String input = br.readLine().trim();
		 String[] pieces = input.split(" "); 
		 
		 for(int i=0; i<pieces.length;i++) {
			 int count = Integer.parseInt(pieces[i]);
			 result[i] = chess[i]-count;
			 }
			 
		
		
		 for(int r : result) {
			 System.out.print(r+" ");
		 }
		 
		 
		 
	}
	

}
