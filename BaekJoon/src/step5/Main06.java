package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
 * #날짜 : 2024/07/10
 * #백준 : 10809번 알파벳 찾기
 */

public class Main06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] S = br.readLine().split("");
        String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        int[] result = new int[alphabet.length];
        Arrays.fill(result, -1);
        boolean[] status = new boolean[alphabet.length];
        Arrays.fill(status, false);

        for (int i = 0; i < S.length; i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (S[i].equals(alphabet[j]) && !status[j]) {
                    result[j] = i;
                    status[j] = true;
                }
            }
        }

        for (int a : result) {
            System.out.print(a + " ");
        }
    }
}
