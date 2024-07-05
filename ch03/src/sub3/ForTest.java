package sub3;

/*
 * 날짜 : 2024.07.01
 * 이름 : 하진희
 * 내용 : 반복문 for 실습하기
 */

public class ForTest {
	public static void main(String[] args) {
		//for 
			
		for(int i=1; i <= 10; i++) {
			System.out.println("i : "+i);
		}
		
		//1부터 10까지 합
		
		int sum =0;
		for(int k=1;k<=10;k++) {
			sum += k;
		}
		System.out.println("1부터 10까지 합 : "+sum);
		
		
		
		//1부터 10까지 짝수합
		int total = 0;
		
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				total +=i;
			}
		}
		
		System.out.println("1부터 10까지 짝수 합 : "+total);

		
		//for 중첩
		for(int a=1;a<=3; a++) {
			System.out.println("a : "+a);
			for(int b=1;b<=5;b++) {
				System.out.println("b : "+b);
				
			}
			System.out.println();
		}
		
		
		//구구단
		for(int x=1; x<10;x++) {
			System.out.printf("--- %d 단----\n",x);
			for(int y=1; y<10; y++) {
				int z = x*y;
				System.out.printf("%d X %d = %d\n",x,y,z);
			}
			System.out.println();
		}
		
		//별삼각형
		
		for(int start=1; start <= 10; start ++) {
			for(int end = 1; end <=start;end ++) {
				System.out.print("⭐");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int start=1; start <= 10; start ++) {
			for(int end = 1; end <=10-start+1;end ++) {
				System.out.print("⭐");
			}
			System.out.println();
		}
	}
	

}
