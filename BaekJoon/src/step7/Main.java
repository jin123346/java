package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * #날짜 : 2024/07/17
 * #백준 : 2739번  행렬 덧셈
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		
		int[][] result = new int[N][M];
		
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine()); 
			for(int j =0 ; j<M;j++ ) {
				result[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine()); 
			for(int j =0 ; j<M;j++ ) {
				result[i][j] += Integer.parseInt(st.nextToken());

			}
		}
		
		for(int i=0;i<N;i++) {
			for(int j =0 ; j<M;j++ ) {
				System.out.printf(result[i][j]+" ");
				
			}
			System.out.print("\n");
		}
		
	
		
	

	}
}
