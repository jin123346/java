package ch02.test;

public class VariableInitializationExample {
	public static void main(String[] args) {
		int value;
		
		value = 2;  //=> 변수 초기화 시켜줌
		
		int result = value +10; //컴파일 오류 
		// value값이 없는상태에서는 연산이 되지않는다.
		
		
		System.out.println(result);
	}
}
