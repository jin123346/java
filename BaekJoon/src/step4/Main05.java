package step4;

/*
	  <문제 요약>
	1. 바구니가 N개 있음 (1번부터 N번 바구니까지).
	2. M번 공을 넣는 작업을 수행함.
	3. 각 작업은 세 개의 정수 i, j, k로 구성되며, i번부터 j번 바구니에 k번 공을 넣음.
	4. 모든 작업이 끝난 후, 각 바구니에 들어있는 공의 번호를 출력. =>K값 출력 
 */
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
		
		
		int[] basket = new int[N+1];
		int i=0,j=0,k=0;
		for(int a=0;a<M;a++) {
			st= new StringTokenizer(br.readLine());
			i=Integer.parseInt(st.nextToken());
			j=Integer.parseInt(st.nextToken());
			k=Integer.parseInt(st.nextToken());
			
			for(int b=i;b<=j;b++) {
				basket[b]=k;
				}
				
			}
				
			for(int num=1;num<=N;num++ ) {
				System.out.println(basket[num]+" ");
	
		
		
		
		}
			
					
	
		
		
		
		
		
	}

}
