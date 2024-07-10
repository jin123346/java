package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 날짜 : 2024/07/03
 * 문제번호 : 
 */
public class test8 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().trim().split(" ");
		int[] dice = new int[input.length];
		for(int i=0; i<dice.length;i++) {
			dice[i]=Integer.parseInt(input[i]);
		}
		int[] count=new int[dice.length];
		int[] same=new int[dice.length];
		for(int i=0;i<dice.length;i++) {
			for(int j=i;j<dice.length;j++){
				if(dice[i]==dice[j]) {
					count[i] +=1;
					same[i] = dice[i];
				}
			}
		}
		int res=0;
		int max=0, max2=0;
		for(int m=0;m<count.length;m++) {
			if(max<count[m]) {
				max = count[m];
				res=same[m];
				
			}
			if(max2<dice[m]) {
				max2=dice[m];
			}
		}
		
		if(max ==3) {
			System.out.println(10000+res*1000);
		}else if(max==2) {
			System.out.println(1000+res*100);
		}else {
			System.out.println(max2*100);
		}
	}

}
