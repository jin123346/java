package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * #날짜 : 2024/07/10
 * #백준 : 27866번 문자와 문자열
 */
public class Main01 {
	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split("");
		
		int i = Integer.parseInt(br.readLine());
		
		
		System.out.println(str[i-1]);		
	}

}
