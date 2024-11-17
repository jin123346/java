package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/*
 * #날짜 : 2024/07/
 * #백준 : 1316번 그룹 단어 체커
 */
public class Main088 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int count=0;
		
		
		
		
		for(int i=0;i<n;i++) {
			String word =br.readLine();
			if(isGroupWord(word)) {
				count++;
			}
			
		}
		System.out.println(count);
		
		
		
	}
	
	private static boolean isGroupWord(String word) {
		Set<Character> seen = new HashSet<Character>();
		char prev = '\0';
		
		for(int i=0;i<word.length();i++) {
			char current = word.charAt(i);
			if(current != prev) {
				if(seen.contains(current)) {
					return false;
				}
				seen.add(current);
			}
			prev=current;
		}
		
		
		return true;
	}
	

}
