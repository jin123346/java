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
public class Main08 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int count=0;
		
		
		
		
		for(int i=0;i<n;i++) {
			String word =br.readLine();
			Set<Character> seen = new HashSet<>();
			boolean isGroupword = true;
			char prev = '\0';
			
			for(int j=0;j<word.length();j++) {
				char current = word.charAt(j);
				if(current != prev) {
					if(seen.contains(current)) {
						isGroupword = false;
						break;
					}
					seen.add(current);
				}
				prev=current;
			}
			
			if(isGroupword) {
				count++;
			}
		}
		System.out.println(count);
		
		
		
	}
	
	
}
