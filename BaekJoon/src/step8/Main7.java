package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*
 * #날짜 : 2024/07/19
 * #백준 : 2869번 올라가고 싶다.
 */
public class Main7 {
	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
	
		
		int result=0;
		int m = A-B;
		
		result = (V-B)/m;
		
		if((V-B)%m != 0) {
			result ++;
		}
		
		System.out.println(result);
		
		
	
	
	
	}

}