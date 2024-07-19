package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/*
 * #날짜 : 2024/07/19
 * #백준 : 2745번 진법 변화
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String N = st.nextToken().toUpperCase();
		int B = Integer.parseInt(st.nextToken());
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		int result=0;
		int len = N.length();
		for(int i=0 ;i<len;i++) {
			int a = N.charAt(i);
			int value;
		
			if(a>='0' && a<='9') {
				value = a-'0';
			}else {
				value = a-'A'+10;
			}
			
			result += value*Math.pow(B,len-1-i);
			
		}
								
		
		System.out.println(result);
	
	}

}
