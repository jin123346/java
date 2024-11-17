package sub02;

/*
 * 날짜 : 2024/07/22
 * 이름 : 하진희
 * 내용 : 스레드 상태 실습하기 
 */
class WorkThread extends Thread{
	@Override
	public void run() { // 작업 스레드로 처리할 메서드 run()
		
		for(int i=0;i <10;i++) {
			
			System.out.println(" Work Thread 실행....");

			try {
				Thread.sleep(1000); //1000은 1초  
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println(" Work Thread 종료...");
	}
}

public class TreadJoinTest {
	public static void main(String[] args) {
		WorkThread work = new WorkThread();
		
		work.start();
		
		try {
			work.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main Thread 종료 ...");  // 프로그램 종료 
		
		
		
	}

}
