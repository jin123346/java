package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*
 * #날짜 : 2024/07/10
 * #백준 : 2675번 문자열 반복
 */
public class Main07 {
	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		List<String> arr = new ArrayList<>();
		
		for(int i=0; i<T;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int R = Integer.parseInt(st.nextToken());
			String[] S = st.nextToken().split("");
			int length= S.length;
			for(int j=0;j<length;j++) {
				int count =0;
				while (count<R) {
					arr.add(S[j]);
					count++;
					}
			}
			arr.add(" ");
			
		}
		String str = String.join("", arr);
		String[] result = str.toString().split(" ");
		
		for(String a : result) {
			System.out.println(a); 
				
			}
		}
		
		
	}


