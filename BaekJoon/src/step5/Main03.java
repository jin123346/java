package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * #날짜 : 2024/07/10
 * #백준 : 9086번 문자열
 */
public class Main03 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		String[] az = new String[T];
		
		for(int i=0;i<T;i++) {
			st = new StringTokenizer(br.readLine());
			az[i]=st.nextToken();
		}
		String first=null;
		String end = null;
		
		for(int i=0;i<T;i++) {
			String[] split =az[i].split("");
			int length=split.length;
			first = split[0];
			if(length==1) {
				end = first;
			}else {
				end=split[length-1];
			}
			System.out.printf(first+end+"\n");
		}
		
	}

}
