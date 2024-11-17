package sub04;
/*
 * 날짜 : 2024/07/22
 * 이름 : 하진희
 * 내용 : 스레드 제어 실습하기 617-619 
 */

import java.util.List;
import java.util.Vector;

class Board {
	private String subject;
	private String content;
	private String writer;
	public Board(String subject, String content, String writer) {
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	@Override
	public String toString() {
		return "Board [subject=" + subject + ", content=" + content + ", writer=" + writer + "]";
	}
	
	

}
public class ThreadWaitNotifyTest {
	public static void main(String[] args) {
		WorkObject workObject = new WorkObject();
	
		ThreadA threadA = new ThreadA(workObject);
		ThreadB threadB = new ThreadB(workObject);
		
		List<Board> list = new Vector<>();
		
		
		System.out.println("main Thread 종료");
	}

}
