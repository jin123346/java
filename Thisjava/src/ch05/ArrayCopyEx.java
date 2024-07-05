package ch05;

public class ArrayCopyEx {
	public static void main(String[] args) {
		String[] oldStrArray = {"java","array","copy"};
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for(String i : newStrArray) {
			System.out.print(i+", ");
		} // 출력 java, array, copy, null, null, 
		System.out.println();
		System.out.println(oldStrArray[1]==newStrArray[1]); //true
	}
}
