package step5;

import java.util.Scanner;

/*
 * #날짜 : 2024/07/14
 * #백준 : 5622번 다이얼
 */
public class Main10 {
	public static void main(String[] args) {
		/*
		 1-2초 n+1
		 2-3초   ABC
		 3-4초	DEF
		 4-5초	GHI
		 5-6초	JKL
		 6-7초	MNO
		 7-8초	PQRS
		 8-9초	TUV
		 9-10초	WXYZ
		 0-11초 0일때 11초 
		 */
		
		Scanner	sc = new Scanner(System.in);
		char[] st = sc.nextLine().toCharArray();
		String[][] dial = {	{null,null,null},
							{null,null,null},
							{"A","B","C"},
							{"D","E","F"},
							{"G","H","I"},
							{"J","K","L"},
							{"M","N","O"},
							{"P","Q","R","S"},
							{"T","U","V"},
							{"W","X","Y","Z"}
							};
		int[] result = {0,0,0,0,0,0,0,0,0,0};
		
		for(char c : st) {
			for(int i=2; i< dial.length;i++) {
				for(int j=0;j<dial[i].length;j++) {
						if(dial[i][j].charAt(0)==c) {
							result[i]+=(i+1);
						}
				}
			}
		}
		
		int time=0;
		for(int t : result) {
			time +=t ;
		}
		System.out.println(time);
		
		sc.close();
	}

}
