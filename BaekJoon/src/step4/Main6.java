package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main6 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());		
		int M = Integer.parseInt(st.nextToken());		
		
		
		int[] basket = new int[N+1];
		for(int c=1;c<N+1;c++) {
			basket[c] =c;
		}
		
		int i=0,j=0,k=0;
		for(int a=0;a<M;a++) {
			st= new StringTokenizer(br.readLine());
			i=Integer.parseInt(st.nextToken());
			j=Integer.parseInt(st.nextToken());
			
			int temp = basket[i];
			basket[i]=basket[j];
			basket[j]=temp;
			
				
			}
				
			for(int num=1;num<=N;num++ ) {
				System.out.print(basket[num]+" ");
	
		
		
		
		}
			
					
	
		
		
		
		
		
	}

}
