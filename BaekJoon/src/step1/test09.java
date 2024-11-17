package step1;
/*
 * 날짜 : 2024/07/03
 * 문제번호 : 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test09 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String input = bf.readLine();
		String[] inputs = input.split(" ");
		
		if(inputs.length != 3) {
			return;
		}
		try {
		int a = Integer.parseInt(inputs[0]);
		int b = Integer.parseInt(inputs[1]);
		int c = Integer.parseInt(inputs[2]);
		
		System.out.println((a+b)%c);
		System.out.println(((a%c)+(b%c))%c);
		System.out.println((a*b)%c);
		System.out.println(((a%c)*(b%c))%c);
		}catch(NumberFormatException e) {
			System.out.println("유효한 정수값이 아님");
		}

	}
}
