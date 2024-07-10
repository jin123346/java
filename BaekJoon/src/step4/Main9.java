package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main9 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] forward = new int[N+1];
		
		for(int i=0;i<=N;i++) {
			forward[i]=i;
		}
		
		for(int i=0; i<M; i++) {
			st= new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			for(int j=0;j<(b-a+1)/2;j++) {
					int temp = forward[a+j];
					forward[a+j]=forward[b-j];
					forward[b-j]=temp;
				}	
			
			}

		
		for( int i=1;i<=N;i++) {
			System.out.print(forward[i]+" ");
		}

	}

}
