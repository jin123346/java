package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main05 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());		
		int M = Integer.parseInt(st.nextToken());		
		
		int[][] arr = new int[N+1][N];
		int i=0,j=0,k=0;
		for(int a=0;a<M;a++) {
			st= new StringTokenizer(br.readLine());
			i=Integer.parseInt(st.nextToken());
			j=Integer.parseInt(st.nextToken());
			k=Integer.parseInt(st.nextToken());
			
			if(i==1) {
				arr[1][0]=k;
			}else {
			arr[i][a] =k;
			arr[j][a]=k;
			}
			
		}
		
		
		
	}

}
