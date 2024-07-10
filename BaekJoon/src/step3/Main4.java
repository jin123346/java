package step3;

import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		if(num>=1 && num<=100) {
			for(int i=0;i<num;i++) {
				for(int k=num-1;k>i;k--) {
					System.out.print(" ");
				}
				for(int j=0;j<i+1;j++) {
					System.out.print("*");
				}
					System.out.println();
			
				}
			}
		sc.close();
	}
}
