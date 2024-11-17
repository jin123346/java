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
		int same=0;
		for(int i=0;i<num.length-1;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]>num[j]) {
					int temp=num[j];
					num[j]=num[i];
					num[i]=temp;
				}
			}
			
		}
		
		System.out.println(num.equals(X));
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
			if(num[i]==X) {
				same=i;
			}
		}
		for(int i=0;i<=same;i++) {
			System.out.print(num[i]+" ");
		}
		
	}

}
