package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main7 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
		
		int arr[] = new int[10];
		final int num=42;
		
		
		for(int i=0;i<10;i++) {
			 st = new StringTokenizer(br.readLine());
			 arr[i]=Integer.parseInt(st.nextToken())%num;
		}
		int count=0;
		
		for(int i=0;i<10;i++) {
			for(int j=i+1;j<10;j++) {
				if(arr[i]!= arr[j]) {
					count++;
					break;
				}
			}
		}
		
		System.out.println(count);

	}

}
