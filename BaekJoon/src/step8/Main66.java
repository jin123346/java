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
public class Main66 {
	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int num = Integer.parseInt(st.nextToken());
		
		int  room=1;
		int range=0;
		int step=1;
		
		while(num > range) {
			range += step;
			step++;
			room++;
		}
		
		System.out.println(range);
		System.out.println(room);
		
	
	
	}

}
