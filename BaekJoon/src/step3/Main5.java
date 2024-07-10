package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main5 {
	public static void main(String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		boolean get=true;
		int[] num = new int[] {0,0};

		ArrayList<Integer> result= new ArrayList<Integer>();
		while(get==true) {
			
			st = new StringTokenizer(br.readLine());
			num[0]=Integer.parseInt(st.nextToken());
			num[1]=Integer.parseInt(st.nextToken());
			if(num[0]==0 && num[1]==0) {
				get=false;
			}else {
				result.add(num[0]+num[1]);
			}
			/*
			 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		        StringBuilder sb = new StringBuilder();
		        
		        while (true) {
		            StringTokenizer st = new StringTokenizer(br.readLine());
		            int a = Integer.parseInt(st.nextToken());
		            int b = Integer.parseInt(st.nextToken());
		            
		            if (a == 0 && b == 0) {
		                break;
		            }
		            
		            sb.append(a + b).append("\n");
		        }
		        
		        System.out.print(sb);
			 */

		}
		for(int i : result) {
			System.out.println(i);
		}
		
		
		
	}
}
