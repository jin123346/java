package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main03 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int[]  arr = new int[N];
		int Max=0;
		int Min = Integer.MAX_VALUE;
		st = new StringTokenizer(br.readLine());

		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0;i<arr.length;i++) {
				if(arr[i]>=Max) {
					Max = arr[i];
				}
				if(arr[i]<=Min) {
					Min=arr[i];
				}
			
		}
		
		System.out.println(Min+" "+Max);
		
		
		
	}

}
