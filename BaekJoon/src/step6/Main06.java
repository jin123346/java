package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * #날짜 : 2024/07/
 * #백준 : 번 
 */
public class Main06 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().trim().toUpperCase().split("");
		String[] alphabet = 
			{"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		int[] result = new int[input.length];
		int temp=0;
		int max= 0,count =0;
		for(int i=0; i < input.length;i++) {
			for(int j=0;j<alphabet.length;j++) {
				if(input[i].equals(alphabet[j])) {
					result[j]++;
				}
				if(result[j]>max) {
					max = result[j];
					temp = j;
				}
			}
		}
		
	
			System.out.println(result[temp]);
		
	
	
		
	}
	

}
