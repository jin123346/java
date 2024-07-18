package sub02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 날짜 : 2024/07/18 
 * 이름 : 하진희
 * 내용 : 버퍼 보조 스트림 실습하기
 */
public class BufferedStreamTest {
	public static void main(String[] args) {
		//파일 경로  C:\Users\lotte4\Desktop\sample1.txt
		
		String source = "C:\\Users\\lotte4\\Desktop\\workspace.zip";
		String target = "C:\\Users\\lotte4\\Desktop\\workspace2.zip";
		
		try {
			//입력 스트림 생성 및 파일 연결
			FileInputStream fis = new FileInputStream(source);
			FileOutputStream fos = new FileOutputStream(target);
			
			//보조스트림
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			while(true) {
				//파일 읽기 
				int data = bis.read();
				//더이상 읽을 내용이 없을 경우
				if(data == -1 ) {
					break;
				}
				
				//파일 쓰기 => 자동으로 인코딩 처리됨
				bos.write(data);
				
				
			}
			//버퍼 비우기
			bos.flush();
			
			
			// 스트림 해제 작업=>자원회수  
			// 버퍼스트림 먼저 해제 후 메인 스트림 해제
			bis.close();
			bos.close();
			fis.close();
			fos.close();
			
			
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
		
		
	}

}