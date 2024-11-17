package sub5;
/*
 * 날짜 : 2024/07/16
 * 이름 : 하진희	
 * 내용 : 자바 날짜,시간 클래스 실습하기
 */

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		//Date클래스
		
		Date date = new Date();
		System.out.println("date : "+date);
		
		//원하는 형식의 date를 출력할 수 있음 
		SimpleDateFormat sdf = new SimpleDateFormat("yyy/MM/dd HH:mm:ss");
		String result = sdf.format(date);
		System.out.println("result : "+result); //result : 2024/07/16 11:14:26
		
		
		//Calander 클래스	
		Calendar cd = Calendar.getInstance();
		System.out.println(cd.getWeekYear());
		int year = cd.get(Calendar.YEAR);
		int month = cd.get(Calendar.MONTH)+1;//1월이 0이기때문에 한달씩 밀려있음 +1해줘야함
		int day = cd.get(Calendar.DATE);
		int Hour = cd.get(Calendar.HOUR);
		int minute = cd.get(Calendar.MINUTE);
		int second = cd.get(Calendar.SECOND);
		
		
		System.out.printf("%d/%02d/%02d %02d:%02d:%02d",year,month,day,Hour,minute,second);
	
	
	}
	
	
}
