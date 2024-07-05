package step1;
/*
 * 날짜 : 2024/07/03
 * 문제번호 : 2588
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test10 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String first  = bf.readLine();
		String second = bf.readLine();
		
		String[] sec = second.split("");
		int a = Integer.parseInt(sec[0]);
		int b= Integer.parseInt(sec[1]);
		int c=Integer.parseInt(sec[2]);
		int fir = Integer.parseInt(first);
		
		int num1 = c*fir;
		int num2 = b*fir;
		int num3 = a*fir;
		
		int sum = num1+num2*10+num3*100;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(sum);
	
	}

}
