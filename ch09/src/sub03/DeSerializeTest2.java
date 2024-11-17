package sub03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * 날짜 : 2024/07/18 
 * 이름 : 하진희
 * 내용 : 역직열화 실습하기
 */
public class DeSerializeTest2 {
	public static void main(String[] args) {
		
		Apple apple = new Apple("한국",3000);
		
		String path = "C:\\Users\\lotte4\\Desktop\\apple.txt";
		
		
		
		try {
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			//객체 역직렬화(불러오기)
			Apple apple2 = (Apple) ois.readObject();
			apple2.show();
			
			
			//스트림 해제
			
			ois.close();
			fis.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
	}
	

}
