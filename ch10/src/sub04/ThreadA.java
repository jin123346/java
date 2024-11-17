package sub04;

public class ThreadA extends Thread	 {

	private WorkObject workObject;

	public ThreadA(WorkObject workObject) { // 공유 작업 객체를 바음
		setName("ThreadA"); // thread 이름변경
		this.workObject = workObject;
	}

	@Override
	public void run() {
		
		for(int i=0;i<10;i++) {
			workObject.methodA();
		}
	}
	
	
	
	
	
}
