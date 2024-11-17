package sub4;
/*
 * 날짜 : 2024/07/09
 * 이름 : 하진희
 * 내용 : 클래스 상속 실습하기
 *  */

public class InheritanceTest {
	
	public static void main(String[] args) {
		Sedan genesis = new Sedan("제너시스", "검정", 50, 3000);
		
		genesis.SpeedUp(100);
		genesis.SpeedDown(50);
		genesis.show();
		
		Truck truck1 = new Truck("봉고", "파란", 10, 1);

		truck1.SpeedUp(100);
		truck1.SpeedDown(50);
		truck1.show();
		
		//StockAccount 실습
		StockAccount kb = new StockAccount("kb증권","101-11-1001","홍길동",10000,"삼성전자",0,50000);
		//(back, acc, name,balance,stock,amount,price)
		kb.deposit(1000000);
		kb.buy(20,50000);
		kb.sell(10,50000);
		kb.show();
		
		// Person 클래스 상속 실습
		
		Doctor who= new Doctor("김유신",33,"소아과");
		Engineer se = new Engineer("김춘추", 30, "소프트웨어");
		
		who.work();
		se.work();
				
	}

}

