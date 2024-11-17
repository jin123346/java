package sub05;
/*
 * 날짜 : 2024/07/22
 * 이름 : 하진희
 * 내용 : 데몬스레드 실습하기 
 */

import java.awt.Toolkit;

class SubThread  extends Thread{
	private String name;
	
	public SubThread(String name) {
		this.name =name;
	}

	@Override
	public void run() { // 작업 스레드로 처리할 메서드 run()
		
		for(;;) {
			
			System.out.println(name + " Sub Thread 실행....");

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}//1000은 1초 	
		}
	}
}

public class DaemonThreadTest {
	public static void main(String[] args) {
		SubThread sub = new SubThread("sub");
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		sub.setDaemon(true);
		
		sub.start();
		
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("main 스레드 실행");
		}
		
		System.out.println("main thread 종료");
	}

}
