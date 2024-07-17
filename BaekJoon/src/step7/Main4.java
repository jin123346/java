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
		Boolean[][] squre  = new Boolean[100][100];
	
		Arrays.fill(squre,false);
		
		int n = Integer.parseInt(br.readLine());
		int a = 0,b=0;
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			for(int x=a;x<a+10;x++) {
				for(int y=b;y<b+10;y++) {
					if(squre[x][y]!=false) {
					squre[x][y]=false;
					}else{
					squre[x][y] = null;
					}
				}
			}
		}
	}

}
