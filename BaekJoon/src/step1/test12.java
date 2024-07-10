package step1;
/*
 * 날짜 : 2024/07/03
 * 문제번호 : 11382
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test12 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine().trim();
		String[] jm = str.split(" ");
		int sum=0;
		for(int i = 0;i<jm.length;i++) {
			long tmp = Long.parseLong(jm[i]);
			sum += tmp;
		}
		
		System.out.println(sum);
		
		
	}

}
