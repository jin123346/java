package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * #날짜 : 2024/07/13
 * #백준 : 2098번 상수
 */
public class Main09 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String a = st.nextToken();
		String b= st.nextToken();
		
		int[] A = new int[a.length()];
		int[] B = new int[b.length()];
		
		
		for(int i=0;i<A.length;i++) {
				A[i]=a.charAt(i)-'0';
				System.out.println(A[i]);
		}
		for(int i=0;i<B.length;i++) {
				B[i]=b.charAt(i)-'0';
		}
		
		
		for(int i=0;i<A.length/2;i++) {
			int tmp = A[i];
			A[i]=A[A.length-1-i];
			A[A.length-1-i]=tmp;
		}
		for(int i=0;i<B.length/2;i++) {
			int tmp = B[i];
			B[i]=B[B.length-1-i];
			B[B.length-1-i]=tmp;
		}
		
		
			
        int numA = 0;
        int numB=0;
        for (int digit : A) {
            numA *= 10;
            numA += digit;
        }
        for (int digit : B) {
            numB *= 10;
            numB += digit;
        }
        if(numA>numB) {
        	System.out.println(numA);
        }else {
        	System.out.println(numB);
        }
        
        br.close();
        

	
		
		
		
		
	}

}
