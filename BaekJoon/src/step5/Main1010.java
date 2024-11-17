package step5;

import java.util.Scanner;

/*
 * #날짜 : 2024/07/13
 * #백준 : 5622번 다이얼
 */
public class Main1010 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        char[] st = sc.nextLine().toCharArray();
        String[][] dial = {
                {null, null, null},
                {null, null, null},
                {"A", "B", "C"},
                {"D", "E", "F"},
                {"G", "H", "I"},
                {"J", "K", "L"},
                {"M", "N", "O"},
                {"P", "Q", "R", "S"},
                {"T", "U", "V"},
                {"W", "X", "Y", "Z"}
        };
        int[] result = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        for (int i = 0; i < st.length; i++) {
            char c = st[i];
            for (int j = 2; j < dial.length; j++) {
                for (int k = 0; k < dial[j].length; k++) {
                    if (dial[j][k].charAt(0) == c) {
                        result[i] = j + 1; // 다이얼 번호에 해당하는 시간을 result 배열에 저장
                        break;
                    }
                }
            }
        }

        int time = 0;
        for (int t : result) {
            time += t;
        }
        System.out.println(time);

        sc.close();
	}

}
