package ch04;

public class PrintFrom1To10Example {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			System.out.print(i+" ");
		}
		
		int sum =0;
		int j;
		
		for(j=1; j<=100;j++) {
			sum +=j;
			
		}//j는 11로 증가되면서 종료 
		System.out.println();
		
		System.out.println("1 ~ "+(j-1) + " 합 :"+sum);

	}
}
