package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main04 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[9];
		int index =0;
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i =0; i<9;i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(arr[i]> max) {
				max = arr[i];
				index = i+1;
			}
			
			
			
		}
		
		System.out.println(max);
		System.out.println(index);
		
		
	}

}
