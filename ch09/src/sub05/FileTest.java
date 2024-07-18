package sub05;

import java.io.File;
import java.io.IOException;

/*
 * 날짜 : 2024/07/18 
 * 이름 : 하진희
 * 내용 : 파일관리 실습하기
 */
public class FileTest {
	public static void main(String[] args) {
		String path1 = "C:\\Users\\lotte4\\Desktop\\source.txt";
		String path2 = "C:\\Users\\lotte4\\Desktop\\temp";
		
		// file 객체 생성
		File f1 = new File(path1);
		File f2 = new File(path2);
		
		try {
			
			f1.createNewFile();//파일생성
			
			f2.mkdir();//디렉토리 생성
			
			//파일 정보출력
			System.out.println("f1 존재여부 : "+f1.exists());
			System.out.println("f2 존재여부 : "+f2.exists());
			System.out.println("f1 파일 여부 : "+f1.isFile());
			System.out.println("f2 파일 여부  : "+f2.isFile());
			System.out.println("f1 폴더 여부 : "+f1.isDirectory());
			System.out.println("f2 폴더 여부 : "+f2.isDirectory());
			System.out.println("f1 파일명 : "+f1.getName());
			System.out.println("f2 파일명 : "+f2.getName());
			System.out.println("f1 경로 : "+f1.getPath());
			System.out.println("f2 경로 : "+f2.getPath());
			System.out.println("f1 절대경로 : "+f1.getAbsolutePath());
			System.out.println("f2 절대경로 : "+f2.getAbsolutePath());
			
			
			//파일 삭제
			f1.delete();
			f2.delete();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
