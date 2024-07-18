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
 * 내용 : 파일 메서드를 이용한 파일 복사 실습하기
 */
public class FIleTransferTest {
	public static void main(String[] args) {
		//파일 경로  C:\Users\lotte4\Desktop\sample1.txt
		
		String source = "C:\\Users\\lotte4\\Desktop\\workspace.zip";
		String target = "C:\\Users\\lotte4\\Desktop\\workspace3.zip";
		
		
		try {
			//입력 스트림 생성 및 파일 연결
			FileInputStream fis = new FileInputStream(source);
			FileOutputStream fos = new FileOutputStream(target);
			
			//메서드
			fis.transferTo(fos);
			
			
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