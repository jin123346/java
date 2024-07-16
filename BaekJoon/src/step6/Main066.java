package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * #날짜 : 2024/07/15
 * #백준 : 1157번 
 * 결과 메모리 초과
 */
public class Main066 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine().trim().toUpperCase();
		String[] alphabet = 
			{"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		int[] result = new int[alphabet.length];
		int temp=0;
		int max= 0,count=0;
		for(int i=0; i < input.length();i++) {
			for(int j=0;j<alphabet.length;j++) {
				if(String.valueOf(input.charAt(i)).equals(alphabet[j])) {
					result[j]++;
					break;
				}
			}
		}
		for(int k=0;k<result.length;k++) {
			if(result[k]>max) {
				max=result[k];
				temp=k;
				count =1;
			}else if(result[k]==max) {
				count++;
			}
		}
		
		if(count==1) {
			System.out.println(alphabet[temp]);
		}else if(count>1){
			System.out.println("?");
		}
		
	}
	

}
