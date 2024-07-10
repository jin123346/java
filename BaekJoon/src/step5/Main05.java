package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * #날짜 : 2024/07/10
 * #백준 : 11720 숫자의 합
 */
public class Main05 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		String[] str = st.nextToken().split("");
		if(str.length>N) {
		
		}else {
		int sum=0;
		for(int i=0;i<str.length;i++) {
			int tmp = Integer.parseInt(str[i]);
			sum +=tmp;
		}
		
		System.out.println(sum);
		
		}
				
		
	}

}
