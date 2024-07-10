package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main04 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		boolean state = true;
		int Max = Integer.MIN_VALUE;
		int Min = Integer.MAX_VALUE;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		while(state) {
			String line=br.readLine();
			
			if(line==null || line.isEmpty()) {
				state=false;
				break;
			}
			StringTokenizer st = new StringTokenizer(line);
			while(st.hasMoreTokens()){
				int num=Integer.parseInt(st.nextToken());
				if(num==0) {
					state=false;
					break;
				}
				
				arr.add(num);
				if(num>Max) {
					Max=num;
				}
				if(num<Min) {
					Min=num;
				}
			}
			
			
		}
		System.out.println(Max);
		System.out.println(Min);
	}

}
