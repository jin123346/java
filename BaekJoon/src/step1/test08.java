package step1;
/*
 * 날짜 : 2024/07/03
 * 문제번호 : 18108번
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test08 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int y = Integer.parseInt(bf.readLine());
		int now=0;
		
		if(y>=1000 && y<=3000) {
			now =y-543;
			}	
		
		System.out.println(now);
		
		bf.close();
		
		
		
	}

}
