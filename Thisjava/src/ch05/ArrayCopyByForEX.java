package ch05;

public class ArrayCopyByForEX {

	public static void main(String[] args) {
		int[] oldIntArray= {1,2,3};
		int[] newIntArray = new int[5];
		
		for(int i=0; i< oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
			System.out.println(oldIntArray[i]==newIntArray[i]);
		}
		
		for(int i=0; i<newIntArray.length;i++) {
			System.out.print(newIntArray[i]+", ");

		}
		System.out.println();
		
		System.out.println(oldIntArray[1]==newIntArray[1]);
	}
}
