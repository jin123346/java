package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main02 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		
		int[] num=new int[A];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<num.length;i++) {
			num[i]= Integer.parseInt(st.nextToken());
		}
	
		 
		for(int i=0;i<num.length;i++) {
			if(num[i]<X) {
				System.out.print(num[i]+" ");
			}
		
		}
		
		
		
	}

}
