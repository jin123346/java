package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 날짜 : 2024/07/03
 * 문제번호 : 
 */
public class test7 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] currentTime=br.readLine().trim().split(" ");
		int currentHour = Integer.parseInt(currentTime[0]);
		int currentMinute = Integer.parseInt(currentTime[1]);
		
		int elapsedTime = Integer.parseInt(br.readLine().trim());
		
		int totalMinutes = currentHour*60 + currentMinute+elapsedTime;
		
		int endHour= (totalMinutes/60)%24;
		int endMinute=totalMinutes%60;
		
		System.out.printf("%d %d",endHour,endMinute);
	}

}
