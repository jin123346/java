package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * #날짜 : 2024/07/
 * #백준 : 25206번 
 */
public class Main09 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[][] grade = {
							{"A+","4.5"},
							{"A0","4.0"},
							{"B+","3.5"},
							{"B0","3.0"},
							{"C+","2.5"},				
							{"C0","2.0"},
							{"D+","1.5"},
							{"D0","1.0"},
							{"F","0.0"},
							{"P","0.0"}
							};
		int sum=0;
		for(int i=0;i<20;i++) {
			String[] input = br.readLine().split(" ");
			for(int j=0;j<grade.length;j++) {
				if(grade[j][0]==input[2]) {
					double score = Double.parseDouble(grade[j][1]);
					double credit = Double.parseDouble(input[1]);
					sum+= score*credit;
					System.out.println(sum);
					break;
					
				}
			}
			
		
		}
		
		double total = sum/(4.5*20);
		System.out.println(total);
		
	
	
	}
	

}
