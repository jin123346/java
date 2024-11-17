package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * #날짜 : 2024/07/10
 * #백준 : 2743번 단어길이재기
 */
public class Main02 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split("");
		
		System.out.println(str.length);
	}

}
