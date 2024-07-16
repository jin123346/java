package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * #날짜 : 2024/07/16
 * #백준 : 2941번 크로아티아 알파벳 
 */
public class Main07 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine().trim();
		String[] patt = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		
		for(String p : patt) {
			input= input.replace(p, "*");
		}
		
		System.out.println(input.length());
		
		
		
		
		
		/*
		 * StringBuilder sb = new StringBuilder(); int length= input.length();
		 * sb.append(input); int count=0; for(int i=0;i<patt.length;i++) { Boolean
		 * status = input.contains(patt[i]); if(status) { count++; length -=
		 * patt[i].length(); } } System.out.println(length+count);
		 */
	}
	

}
