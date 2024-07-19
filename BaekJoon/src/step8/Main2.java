package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

/*
 * #날짜 : 2024/07/19
 * #백준 : 11005번 진법 변화
 */
public class Main2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		String[] alpha = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		
		
		List<String> result = new ArrayList<String>();
		int set = N;
		while(set>0) {
			int temp = set%B;
			if(B>10) {
				
				if(temp<10) {
					result.add(Integer.toString(temp));
				}else {
					result.add(alpha[temp-10]);
				}
			}else {
				
				result.add(Integer.toString(temp));		
			}	
			set /= B;
				
			}
			
	
		for(int i=result.size()-1;i>=0;i--) {
		
			System.out.print(result.get(i));
		}
		
	
	}

}
