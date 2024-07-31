package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*
 * #날짜 : 2024/07/19
 * #백준 : 1193번 분수찾기
 */
public class Main6 {
	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int num = Integer.parseInt(st.nextToken());
		
		int  x=1;
		int  y=1;
		int end=1;
		int step=1;
		int start=1;
		
		while(num > end) {
			start = end+1;
			end += step+1;
			++step;
		}
		
		
		//step 이 짝수 x ++ / y--	
		if((step)%2==0) {
			x= 1+(num-start);
			y= step-(num-start);
		}else {
			//step이 홀수 x-- / y++
			x=step-(num-start);
			y=1+(num-start);
		}
		
		System.out.println(x+"/"+y);
	
		
	
	
	}

}
