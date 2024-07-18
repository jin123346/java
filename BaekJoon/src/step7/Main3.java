package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
 * #날짜 : 2024/07/17
 * #백준 : 10798번 
 */
public class Main3 {
	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		String[][] str = new String[5][];
		int maxLength=0;
		
		for(int i=0;i<5;i++) {
			str[i] = br.readLine().split("");
			if(str[i].length > maxLength) {
				maxLength= str[i].length;
			}
		}
		
		ArrayList<String> result = new ArrayList<>();
		
		for(int i=0;i<maxLength;i++) {
			for(int j=0;j<5;j++) {
				if(i<str[j].length) {
				result.add(str[j][i]);
				}
			}
				
		}
		
		for(String a : result) {
			System.out.print(a);
		}
		
	}

}
