package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*
 * #날짜 : 2024/07/
 * #백준 : 25206번 
 */
public class Main09 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// hashmap도전
		Map<String, Double> grade = new HashMap<String, Double>();
		grade.put("A+", 4.5);
		grade.put("A0", 4.0);
		grade.put("B+", 3.5);
		grade.put("B0", 3.0);
		grade.put("C+", 2.5);
		grade.put("C0", 2.0);
		grade.put("D+", 1.5);
		grade.put("D0", 1.0);
		grade.put("F", 0.0);

		
		
		 double sum=0; 
		 double creditsum = 0;
		 
		 for(int i=0;i<20;i++) { 	 
			 String[] input = br.readLine().split(" ");
		 	 if(input[2].equals("P")) { continue; }
		 	 else{
		 			 String key= input[2];
		 			 double score = grade.get(key);
		 			 double credit =Double.parseDouble(input[1]);
		 			 sum += score*credit;
		 			 creditsum += credit;
		 		 }
		 	 
		 }
		 
		 double avg = sum/creditsum;
		 System.out.println(avg);
		 

	}
}
