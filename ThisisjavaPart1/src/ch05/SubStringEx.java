package ch05;

public class SubStringEx {
	
	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0,6);
		System.out.println(firstNum);  //880815
		
		String seconNum=ssn.substring(7);
		System.out.println(seconNum); //1234567
	}
}
