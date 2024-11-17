package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main01 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int[] num = new int[N];
		
		st= new StringTokenizer(br.readLine());

		for(int i=0;i<num.length;i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		st= new StringTokenizer(br.readLine());
		int V= Integer.parseInt(st.nextToken());
		int count =0;
		
		for(int i=0;i<num.length;i++) {
			if(num[i]==V) {
				count++;
			}
		}
		System.out.println(count);
		
		
	}

}
