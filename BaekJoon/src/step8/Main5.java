package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*
 * #날짜 : 2024/07/19
 * #백준 : 2292번 중앙 이동 알고리즘
 */
public class Main5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int num = Integer.parseInt(st.nextToken());
		final int six = 6;
		int room  =1;
		int range=1;
		int step=1;
		
		while(num>range) {
			range+= six*step;
			step++;
			room++;
		}
		
		
		
		/*
		 int a = 2; 
		 int b = 6;
		 List<Integer> rooms = new ArrayList<Integer>(); rooms.add(1);
		 
		 while (num > a) { a += b; b += six; room++; rooms.add(a); }
		 */
		
		System.out.println(room);
		
		
		
		
		
		
		
	
	
	}

}
