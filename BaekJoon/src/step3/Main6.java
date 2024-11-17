package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        
		int[] num = new int[] {0,0};
		ArrayList<Integer> result= new ArrayList<Integer>();

        while ((input = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(input);
            num[0]=Integer.parseInt(st.nextToken());
			num[1]=Integer.parseInt(st.nextToken());
			result.add(num[0]+num[1]);

        }
        
        for(int i : result) {
			System.out.println(i);
		}
    }
}


