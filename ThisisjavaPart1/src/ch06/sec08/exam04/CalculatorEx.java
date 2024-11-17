package ch06.sec08.exam04;


public class CalculatorEx {
	public static void main(String[] args) {
	Cacluator myCal = new Cacluator();
		
		double result1 = myCal.areaRectangle(10);
		
		double result2 = myCal.areaRectangle(10, 20);
		
		System.out.println("정사각형 넓이 : "+result1);
		System.out.println("직사각형 넓이 : "+result2);
		
		
		
	}
}
