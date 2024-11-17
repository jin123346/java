package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*
 * #날짜 : 2024/07/13
 * #백준 : 1152번 단어의 개수
 */
public class Main08 {
	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().trim();
		
		
		if(str.toString().isEmpty()) {
			System.out.println(0);
		}else {
			String[] words = str.split(" ");
			System.out.println(words.length);

		}
	}

}
