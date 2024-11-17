package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
 * #날짜 : 2024/07/1
 * #백준 : 번 
 */
public class Main33 {
	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        // 5줄의 입력을 저장하기 위한 리스트
        ArrayList<String[]> lines = new ArrayList<>();
        
        // 최대 길이를 기록하기 위한 변수
        int maxLength = 0;
        
        for (int i = 0; i < 5; i++) {
            String[] line = br.readLine().split("");
            lines.add(line);
            // 최대 길이를 갱신
            if (line.length > maxLength) {
                maxLength = line.length;
            }
        }
        
        StringBuilder result = new StringBuilder();
        
        // 최대 길이만큼 반복
        for (int i = 0; i < maxLength; i++) {
            for (int j = 0; j < 5; j++) {
                if (i < lines.get(j).length) {
                    result.append(lines.get(j)[i]);
                }
            }
        }
        
        System.out.print(result.toString());	
	}

}
