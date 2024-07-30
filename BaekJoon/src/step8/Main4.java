package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * #날짜 : 2024/07/19
 * #백준 : 2903번 중앙 이동 알고리즘
 */
public class Main4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int result=2;
		
		if(n==0) {
			result=4;
		}else {
			double temp=1;
			for(int i=0;i<n ;i++) {
				temp *= 2;
				}
			temp +=1;
			result=(int)temp*(int)temp;
		}
		System.out.println(result);
	}

}
