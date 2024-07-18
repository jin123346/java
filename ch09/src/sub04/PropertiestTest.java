package sub04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/*
 * 날짜 : 2024/07/18 
 * 이름 : 하진희
 * 내용 : properties 실습하기
 * 
 * 프로퍼티(Properties)
 * - 문자열을 데이터만 취급하는 key-value 자료구조 클래스
 * - 직렬화, 역직렬화를 이용해 데이터를 입출력하는 자료구조 클래스
 * - 프로그램 환경설정 값을 저장할 때 많이 사용됨
 * 
 */
public class PropertiestTest {
	public static void main(String[] args) {
		
		//프로퍼티 생성
		Properties pp = new Properties();
		
		pp.setProperty("A", "Apple");
		pp.setProperty("B", "Banana");
		pp.setProperty("C", "Cherry");
		
		System.out.println(pp);
		
		
		//프로퍼티 직렬화(파일 저장)
		String path = "C:\\Users\\lotte4\\Desktop\\fruit.properties";
		
		try {
			//스트림 생성
			FileOutputStream fos =  new FileOutputStream(path);
			
			//직렬화
			pp.store(fos, null);
			
			
			//스트림 해제 
			fos.flush();
			fos.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		//역직렬화
		///////////////////////////////////////////////////
		//프로퍼티 역직렬화 파일읽기/////////////////////////
		String path2 = "C:\\Users\\lotte4\\Desktop\\city.properties";
		Properties cityprop = new Properties();
		
		try {
			//스트림 생성
			FileInputStream fis = new FileInputStream(path2);
			
			//역직렬화
			cityprop.load(fis);
			
			//스트림 해제 
			fis.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(cityprop);
		
		System.out.println("일본 : "+cityprop.getProperty("jpn"));
		System.out.println("중국 : "+cityprop.getProperty("chi"));
		System.out.println("미국 : "+cityprop.getProperty("usa"));

	}

}
