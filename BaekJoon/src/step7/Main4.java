package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * #날짜 : 2024/07/17
 * #백준 : 2563번 
 */
public class Main4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[][] squre  = new int[100][100];
	
		
		
		int n = Integer.parseInt(st.nextToken());
		int a = 0,b=0;
		int sum=0;
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			for(int x=a;x<a+10;x++) {
				for(int y=b;y<b+10;y++) {
					squre[x][y]++;

				}
			}
		}
	
			for(int x=0;x<100;x++) {
				for(int y=0;y<100;y++) {
					if(squre[x][y]!=0) {
						sum++;
					}
				}
			}
			
			System.out.println(sum);
		
	}

}
