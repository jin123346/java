package sub2;
/*
 * 날짜 : 2024/07/08
 * 이름 : 하진희
 * 내용 : 캡슐화 실습하기
 */
public class EncpasTest {
	public static void main(String[] args) {
		//Car 객체 생성
		Car sonata = new Car("소나타","흰색",0);
		sonata.SpeedUp(80);
		sonata.SpeedDown(20);
		sonata.setColor("은색");
		sonata.setSpeed(0);
		sonata.show();
		System.out.println();

		Car avante = new Car("아반떼","검정",0	);
		avante.SpeedUp(100);
		avante.SpeedDown(40);
		avante.show();
		System.out.println();
	
		//account
		Account kb = new Account("국민은행","101-21-1001","김유신",10000);
		
		kb.deposit(40000);
		kb.withdraw(30000);
		kb.setName("김유진");
		
		kb.show();
		
		Account wr= new Account("우리은행", "101-22-1001", "김춘추",10000);
		wr.deposit(20000);
		wr.withdraw(15000);
		wr.setBank("유리은행");
		
		wr.show();
		
		//클래스 연습문제
		
		Book java = new Book("이것이 자바다","신용권","979-11-6921-227-4",3);
		Book sql = new Book("혼자공부하는 SQL","우재남","112-10-1102",2);

		java.borrowBook();
		java.show();
		
	
		sql.borrowBook();
		sql.borrowBook();
		sql.borrowBook();
		sql.returnBook();
		sql.show();
	}

}
