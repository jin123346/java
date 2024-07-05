package ch05;

public class ArrayCreateByValuesListEx {
	public static void main(String[] args) {
		int[] scores;
		
		scores = new int[] {83,90,87};
		
		int sum1 =0;
		for(int i: scores) {
			sum1 += i;
		}
		System.out.println("총합 : "+sum1);
		
		printItem(new int[] {83,90,87});
		
		
		
	}
	
	public static void printItem(int[] scores) {
		for(int i=0;i<scores.length; i++) {
			System.out.printf("scores[%d] : %d\n",i,scores[i]);
		}
	}
}
