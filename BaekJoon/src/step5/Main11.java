package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


/*
 * #날짜 : 2024/07/14
 * #백준 : 11718번  그래도 출력
 */
public class Main11 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<String> array= new ArrayList<String>();
		String input;
		while(( input=br.readLine()) !=null && !input.isEmpty()) {
			array.add(input);
			}
		
		for(String a : array) {
			System.out.println(a);
		}
	
	}

}
