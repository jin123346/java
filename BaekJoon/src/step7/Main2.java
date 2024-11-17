package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * #날짜 : 2024/07/17
 * #백준 : 2566번 
 */
public class Main2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int[][] input = new int[9][9];
		int max=0;
		int x=0,y=0;
		for(int i=0;i<9;i++) {
			st = new StringTokenizer(br.readLine());
			for( int j=0;j<9;j++) {
				input[i][j]=Integer.parseInt(st.nextToken());
				if(input[i][j]>=max) {
					max = input[i][j];
					x=i+1;
					y=j+1;
				}
			}
		}
		
		System.out.println(max);
		System.out.println(x+" "+y);
		
		
	}

}
