package step6;

import java.util.Scanner;

/*
 * #날짜 : 2024/07/
 * #백준 : 2444번 별찍기
 */
public class Main03 {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int  N = sc.nextInt();
		int count=0;
		
		for(int i=0;i<2*N-1;i++) {
			if(i<N) {
				count++;
			}else {
				count--;
			}
			for(int j=N-1;j>count-1;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<2*count-1;k++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		
		sc.close();
		
	}
	

}
