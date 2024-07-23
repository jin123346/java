package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

/*
 * #날짜 : 2024/07/19
 * #백준 : 11005번 진법 변화
 */
public class Main22 {
	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
				
	
		String ans = "";
		while(N>0) {
			int D = N%B;
			if(D <10) {
				ans +=D;
			}else {
				ans +=(char)('A'+(D-10));
			}
			N = N/B;
		}
	
		for(int i=ans.length()-1;i>=0;i--) {
			System.out.print(ans.charAt(i));
		}
	}

}
