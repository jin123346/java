package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 날짜 : 2024/07/03
 * 문제번호 : 14681
 */
public class test4 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		 // 한 줄로 입력받아 공백으로 분리합니다.
        String[] input = bf.readLine().split(" ");

        // 각 부분을 정수로 변환합니다.
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);

        // 각 사분면에 따라 결과를 출력합니다.
        if (x > 0 && y > 0) {
            System.out.println(1);
        } else if (x < 0 && y > 0) {
            System.out.println(2);
        } else if (x < 0 && y < 0) {
            System.out.println(3);
        } else if (x > 0 && y < 0) {
            System.out.println(4);
        }

	           
	       
		
	}

}
