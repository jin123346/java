package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main8 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int present[] = new int[31];
		boolean[] status = new boolean[31];
		for(int i=1;i<31;i++) {
			present[i]=i;
			status[i]=false;
		}
		status[0]= true;
		
		for(int i=1; i<29; i++) {
			st= new StringTokenizer(br.readLine());
			int num= Integer.parseInt(st.nextToken());
			int submit = present[num];
			status[submit]=true;
			
		}
		
		for(int i=1;i<31;i++) {
			if(status[i]==false) {
				System.out.println(i);
			}
		}
		
		//짧은코딩 
//		 boolean[] submitted = new boolean[31]; // 1~30번 인덱스를 사용하기 위해 크기를 31로 설정
//	        // false로 초기화되어 있음
//	        
//	        // 28명의 제출 상태를 기록
//	        for (int i = 0; i < 28; i++) {
//	            int num = Integer.parseInt(br.readLine());
//	            submitted[num] = true; // 제출한 학생 번호를 true로 설정
//	        }
//	        
//	        // 제출하지 않은 학생 번호 출력
//	        for (int i = 1; i <= 30; i++) {
//	            if (!submitted[i]) {
//	                System.out.println(i);

	}

}