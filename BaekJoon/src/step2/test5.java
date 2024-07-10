package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 날짜 : 2024/07/03
 * 문제번호 : 
 */
public class test5 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] setTime = input.split(" ");
		int H = Integer.parseInt(setTime[0]);
		int M = Integer.parseInt(setTime[1]);
		int setH =0;
		int setM=0;
		if(H>=0 && H<=23 && M>=0 &&M<=59) {
			if(H==0) {
				if(M<45) {
					setH = 23;
					setM =M+(60-45);
				}else {
					setH=H;
					setM=M-45;
				}
			}else {
				if(M<45) {
					setH = --H;
					setM =M+(60-45);
				}else {
					setH=H;
					setM=M-45;
				}
			}
		}
		
		System.out.printf("%d %d",setH,setM);
		
	}

}
