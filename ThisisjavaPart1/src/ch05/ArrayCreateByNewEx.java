package ch05;

public class ArrayCreateByNewEx {

	public static void main(String[] args) {
		int[] arr1 = new int[3];
		
		for(int i =0;i<3;i++) {
			System.out.printf("arr1[%d] : %d, ",i,arr1[i]);
		}
		System.out.println();
		
		arr1[0] = 10;
		arr1[1] =20;
		arr1[2] = 30;
		
		for(int i=0; i<3;i++) {
			System.out.printf("arr1[%d] : %d, ",i,arr1[i]);
		}
		System.out.println("\n");
	
		double[] arr2 = new double[3];
		
		for(int i=0;i<3;i++) {
			System.out.printf("arr2[%d] : %2f, ",i,arr2[i]);
		}
		System.out.println();
	
	}
}
