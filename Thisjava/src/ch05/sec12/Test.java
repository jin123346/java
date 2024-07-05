package ch05.sec12;

public class Test {
	public static void main(String[] args) {
		int[][] array= {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		int sum=0;
		int count=0;
		for(int i=0; i<array.length; i++) {
			for(int j=0; j< array[i].length;j++) {
				sum+=array[i][j];
				count++;
			}
			
		}
		System.out.println("총합 : "+sum);
		double avg = (double)sum / count;
		System.out.println("평균 : "+avg);
		
		System.out.println(array.length); // 3
		System.out.println(array[2].length);//5
	
		int[] arr1 = {1,5,3,8,2};
		int max = 0;
		for(int i=0; i<arr1.length; i++) {
			if(max<arr1[i]) {
				max = arr1[i];
			}
			
		}
		System.out.println(max);
	
		
	
	}
	
	
	
	
	
}
