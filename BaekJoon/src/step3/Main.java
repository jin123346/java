package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		
		int num = Integer.parseInt(st.nextToken());
		
		int[][] numCase= new int[num][2];
		
		for(int i =0;i<num;i++) {
			st= new StringTokenizer(br.readLine());
			numCase[i][0] = Integer.parseInt(st.nextToken());
			numCase[i][1] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0;i<num;i++) {
			if(numCase[i][0]>0 && numCase[i][1]<10) {
			System.out.printf("Case #%d: %d\n",i+1,numCase[i][0]+numCase[i][1]);
			}else {
				return;
			}
		}
				
	}
}
