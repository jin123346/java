package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 날짜 : 2024/07/03
 * 문제번호 : 1330
 */
public class test01 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		String[] number = str.split(" ");
		long num1 = Long.parseLong(number[0]);
		long num2 = Long.parseLong(number[1]);
		
		if(num1>num2) {
			System.out.println(">");
		}else if(num1<num2) {
			System.out.println("<");
		}else {
			System.out.println("==");
		}
	}

}
