package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 날짜 : 2024/07/03
 * 문제번호 : 2525번
 */
public class test6 {
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine().trim();
		int time = Integer.parseInt(br.readLine());
		String[] str=input.split(" ");
		int A= Integer.parseInt(str[0]);
		int B= Integer.parseInt(str[1]);
		boolean aH = A>=0 && A <=23? true:false;
		boolean bM = B>=0 && B<=59? true : false;
		int endhour=0;
		int endminute=0;
		if(aH==true && bM ==true) {
			if(A==23) {
				if (time/60==0) {
					if(B+time>=60) {
						endhour=0;
						endminute=B+time-60;
					}else {
						endhour=A;
						endminute=B+time;
					}
				}else {
					int tmph=time/60;
					int tmpm=time-tmph*60;
					endhour=tmph;
					if(B+tmpm>=60) {
						endhour=tmph+1;
						endminute=B+tmpm-60;
					}else {
						endminute=B+tmpm;
					}
				}	
			}else { //a=22일수도 있음
				if (time/60==0) {
					if(B+time>=60) {
						endhour=A+1;
						endminute=B+time-60;
					}else {
						endhour=A;
						endminute=B+time;
					}
				}else {
					int tmph=time/60;
					int tmpm=time-tmph*60;
					endhour=A+tmph;
					if(endhour>23) {
						endhour=endhour%23;
					}
					if(B+tmpm>=60) {
						endhour=endhour+1;
						endminute=B+tmpm-60;
					}else {
						endminute=B+tmpm;
					}
				}
		
			}
		}
		
		System.out.printf("%d %d",endhour,endminute);
	}
}
