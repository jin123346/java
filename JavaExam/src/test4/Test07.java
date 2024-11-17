package test4;
/*
 * 날짜 : 2024/07/19
 * 이름 : 하진희
 * 내용 : 로또번호 연습문제
 */

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test07 {
	public static void main(String[] args) {
		for(int count=1;count<=5;count++) {
			System.out.println(makeLotto());
		}
	}
	
	public static Set<Integer> makeLotto(){
		
		Set<Integer> lottoset = new HashSet<>();
		
		//무한루프
		for(;;) {
			int num = (int)(Math.ceil(Math.random()*45));
			lottoset.add(num);
			if(lottoset.size()==6) {
				break;
			}
		}
		
		//TreeSet => 정렬할때 사용 
		Set<Integer> treeset = new TreeSet<>(lottoset);
		return treeset;
	}

}
