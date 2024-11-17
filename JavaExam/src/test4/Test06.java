package test4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * 날짜 : 2024/07/19
 * 이름 : 하진희
 * 내용 : 리스트 연습문제
 */
public class Test06 {
	public static void main(String[] args) {
		printList(createList());
	}
	
	public static void printList(List<Integer> scoreList) {
		int total = 0;
		int size = scoreList.size();
		
		for(int i=0;i<size ; i++) {
			int score = scoreList.get(i);
			
			total += score;
			
			System.out.print(score);
			
			if(i==size-1) {
				System.out.print("=");
			}else {
				System.out.print("+");
			}
		}
		System.out.println(total);
	}
	
	
	public static List<Integer> createList(){
		List<Integer> scoreList = new ArrayList<Integer>();
		Random rand = new Random();
		
		for(int i=1;i<=10;i++) {
			//60~100 사이의 임의의 수
			int num = rand.nextInt(41)+60;
			//rand.nextInt(41)은 1~40까지의 랜덤 수 
			
			scoreList.add(num);
		}
		
		return scoreList;
		
		
	}
	

}
