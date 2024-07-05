package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int T = Integer.parseInt(st.nextToken());
		int[][] num =new int[T][2]; 
		for(int i=0;i<T;i++) {
			st = new StringTokenizer(br.readLine());
			num[i][0]=Integer.parseInt(st.nextToken());
			num[i][1]=Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<T;i++) {
			if(num[i][0]>0 &&num[i][1]<10) {
				System.out.printf("Case #%d: %d + %d = %d\n",i+1,num[i][0],num[i][1],num[i][0]+num[i][1]);
			}else {
				return;
			}
		}
	}
}
